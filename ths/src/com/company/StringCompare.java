package com.company;

/**
 * 字符串比较
 *
 * @author zhanglei
 * @date 2020/3/13 11:04
 */
public class StringCompare {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        String str3 = "a" + "b" + "c";
        String str4 = new String("abc");
        String str5 = new String("abc");

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1 == str4);
        System.out.println(str4 == str5);

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str4));
        System.out.println(str4.equals(str5));
        System.out.println("abc".equals(str1));


        switch (str4) {
            case "abc":
                System.out.println("found abc");
                break;
            case "123":
                System.out.println("found 123");
                break;
            default:
                System.out.println("can't find");
                break;
        }
    }

}
