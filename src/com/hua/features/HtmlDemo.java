package com.hua.features;

import java.io.File;
import java.io.IOException;


public class HtmlDemo {

	public static void main(String[] args) {
		
		File file = FileUtil.getFile("files");
		File[] listFiles = file.listFiles();
		File sourceFile = null;
		for (int i = 0; i < listFiles.length; i++) {
			sourceFile = new File(file.getName() + File.separator + listFiles[i].getName());
			System.out.println(sourceFile.getPath());
			String sourceAndroid = sourceFile + "_android";
			String sourceIos = sourceFile + "_ios";
			
			File destDirAndroid = FileUtil.getFile(sourceAndroid);
			File destDirIos = FileUtil.getFile(sourceIos);
			
			try {
				FileUtil.convertAndroidAndIos(sourceFile, destDirAndroid, destDirIos);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
