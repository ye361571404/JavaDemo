package com.hua.features;

import java.io.File;
import java.io.FileFilter;

public class HtmlFilter implements FileFilter{

	@Override
	public boolean accept(File pathname) {
		
		if(pathname.isDirectory()){
			return true;
		}else if(pathname.getName().endsWith(".html")){
			return true;
		}
		return false;
	}

}
