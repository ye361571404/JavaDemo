package com.hua.io.utils;


import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/**
 * @author MaTianyu
 * @date 2014-12-05
 */
public class StringCodingUtils {

    public static byte[] getBytes(String src, Charset charSet) {
    	try {
            return src.getBytes(charSet.name());
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return null;
    }

}
