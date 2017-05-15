package com.hua.demo;

/**
 * 去除字符串中特殊符号
 * @author Administrator
 *
 */
public class Demo01 {
	
	public static void main(String[] args) {
		String source = "01java版权声明本文为博主原创文章未经博主允许不得转载end02";
		String str = "01java 版权声明：本&*^.文为,~!博主?原@#创文%^章，<未>[经]{博}{|主允=-。，许不‘；’：}{【】得转载$&*()_+><\\//[]end02";
		String reg = "[^\u4e00-\u9fa5a-zA-Z0-9]";
		str = str.replaceAll(reg, "");
		System.out.println(str);
		System.out.println(source);
	}

}
