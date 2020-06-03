package com.company;

import java.io.UnsupportedEncodingException;

/**
 * 字符串编码转换
 *
 * @author zhanglei
 * @date 2020/3/13 14:51
 */
public class StringEncodeChange {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "Java基础培训";
        String strUTF8 = new String(str.getBytes("gbk"), "utf-8");
        String strGB2312 = new String(str.getBytes("utf-8"), "gbk");
        System.out.println(str);
        System.out.println(strUTF8);
        System.out.println(strGB2312);
    }
}
