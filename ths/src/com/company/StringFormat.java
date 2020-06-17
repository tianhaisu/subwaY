package com.company;

import java.io.UnsupportedEncodingException;
import java.text.MessageFormat;

/**
 * 字符串格式化
 *
 * @author zhanglei
 * @date 2020/3/13 14:18
 */
public class StringFormat {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String name = "张雷";
        int age = 34;
        String str = "姓名：" + name + "    " + "年龄：" + age;
        System.out.println(str);
        System.out.println(String.format("姓名：%s    年龄：%d", name, age));
        System.out.println(MessageFormat.format("姓名：{1}    年龄：{0}", age, name));
    }
}
