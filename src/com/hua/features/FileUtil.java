package com.hua.features;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.hua.io.utils.FileUtils;

public class FileUtil {
	
	/**
	 * ��ȡ��Ŀ��·��
	 * D:\workspace\Demo
	 * @return
	 */
	public static String getProjectRootPath(){
		return System.getProperty("user.dir");
	}
	
	/**
	 * ��ȡ�ļ�����
	 * @param fileName	file.txt or files or files/file.txt
	 * @return
	 */
	public static File getFile(String fileName){
		String rootPath = getProjectRootPath();
		String filePath = rootPath + File.separator + fileName;
		return new File(filePath);
	}
	
	public static String getStringFromFile(String fileName){
		
		String source = null;
		File file = FileUtil.getFile("files" + File.separator + fileName);
		try {
			source = FileUtils.readFileToString(file,"UTF-8");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return source;
	}
	
	/**
	 * ��ȡĿ¼�������ļ�
	 * @param srcDir
	 * @param filter	�����ļ�
	 * @return
	 */
	public static List<File> readFiles(File srcDir,FileFilter filter) {
		File[] listFiles = srcDir.listFiles(filter);
		File file = null;
		List<File> files = new ArrayList<File>();
		for (int i = 0; i < listFiles.length; i++) {
			file = listFiles[i];
			if(file.isDirectory()){
				List<File> readFiles = readFiles(file,filter);
				if(!readFiles.isEmpty()){
					files.addAll(readFiles);
				}
			}else{
				files.add(file);
			}
		}
		return files;
	}
	
	
	/**
	 * ת�� android or ios �ļ�
	 * @param sourceFile	Դ�ļ�
	 * @param outFile		���ļ�
	 * @param flag			true ����android�ļ�	false ����ios�ļ�
	 * @return
	 */
	public static void generateNewHtml(File sourceFile, File outFile,boolean flag){
		try {
			String source = FileUtils.readFileToString(sourceFile,"UTF-8");
			String aStart = "<js-android>";
			String aEnd = "</js-android>";
			String iStart = "<js-ios>";
			String iEnd = "</js-ios>";
			
			if(flag){
				// ����android�ļ�
				String aStartAnnotate = "";
				String aEndAnnotate = "";
				String iStartAnnotate = "/\\*\\*<js-ios>";
				String iEndAnnotate = "</js-ios>\\*\\*/";
				
				source = source.replaceAll(aStart, aStartAnnotate);
				source = source.replaceAll(aEnd, aEndAnnotate);
				// ע��ios
				source = source.replaceAll(iStart,iStartAnnotate);
				source = source.replaceAll(iEnd,iEndAnnotate);
				
			}else{
				// ����ios�ļ�
				String aStartAnnotate = "/\\*\\*<js-android>";
				String aEndAnnotate = "</js-android>\\*\\*/";
				String iStartAnnotate = "";
				String iEndAnnotate = "";
				
				// ע��android
				source = source.replaceAll(aStart, aStartAnnotate);
				source = source.replaceAll(aEnd, aEndAnnotate);
				
				source = source.replaceAll(iStart,iStartAnnotate);
				source = source.replaceAll(iEnd,iEndAnnotate);
			}
			// ���android-html
			FileUtils.writeStringToFile(outFile, source,"UTF-8");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void convertAndroidAndIos(File srcDir, File destDirAndroid, File destDirIos)
			throws IOException {
		FileUtils.copyDirectory(srcDir, destDirAndroid);
		FileUtils.copyDirectory(srcDir, destDirIos);
		
		List<File> androidFiles = FileUtil.readFiles(destDirAndroid,new HtmlFilter());
		convertHtml(androidFiles,true);
		
		List<File> iosFiles = FileUtil.readFiles(destDirIos,new HtmlFilter());
		convertHtml(iosFiles,false);
		
		List<File> files = FileUtil.readFiles(srcDir,new HtmlFilter());
		for (int i = 0; i < files.size(); i++) {
			System.out.println(i + "\t" +files.get(i));
		}
	}

	/**
	 * 
	 * @param files
	 * @param flag	true ����android�ļ�	false ����ios�ļ�
	 */
	private static void convertHtml(List<File> files,boolean flag) {
		File sourceFile = null;
		for (int i = 0; i < files.size(); i++) {
			sourceFile = files.get(i);
			FileUtil.generateNewHtml(sourceFile, sourceFile, flag);
		}
	}

}
