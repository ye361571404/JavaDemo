package com.hua.demo;

/**
 * ȥ���ַ������������
 * @author Administrator
 *
 */
public class Demo01 {
	
	public static void main(String[] args) {
		String source = "01java��Ȩ��������Ϊ����ԭ������δ������������ת��end02";
		String str = "01java ��Ȩ��������&*^.��Ϊ,~!����?ԭ@#����%^�£�<δ>[��]{��}{|����=-��������������}{������ת��$&*()_+><\\//[]end02";
		String reg = "[^\u4e00-\u9fa5a-zA-Z0-9]";
		str = str.replaceAll(reg, "");
		System.out.println(str);
		System.out.println(source);
	}

}
