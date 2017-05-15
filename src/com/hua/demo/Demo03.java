package com.hua.demo;

import com.google.gson.Gson;
import com.hua.bean.SettingsBean;

public class Demo03 {
	
	public static void main(String[] args) {
		Gson gson = new Gson();
		String json = gson.toJson(new SettingsBean());
		System.out.println(json);
		
		System.out.println("-------------------------------");
		
		String settingJson = "";
		SettingsBean fromJson = gson.fromJson(settingJson, SettingsBean.class);
		System.out.println(fromJson);
		if(fromJson == null){
			fromJson = new SettingsBean();
		}
		System.out.println(gson.toJson(fromJson));
		
		
	}

}
