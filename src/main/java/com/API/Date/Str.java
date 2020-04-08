package com.API.Date;
import java.lang.String;


public class Str {
    public static void main(String[] args){
        //创建字符串
        String str = new String("abcdefghijklcmN");
        //startsWith
        String start = "a";
        boolean a = str.startsWith(start);
        boolean b = str.startsWith(start, 1);
        System.out.println("str的开头是否是"+ start+":" +a);
        System.out.println("str的开头是否是"+ start+":" +b);
        //startsWith
        //contains
        boolean c = str.contains(start);
        System.out.println("str的开头是否包含"+ start+":" +c);
        //indexOf
        int j = str.indexOf("c"); //索引
        int i = str.indexOf("c", 4);//从某个索引开始，该c第一次出现的位置。
        System.out.println(j);
        System.out.println(i);
        //equals equalsIgnoreCase
        String str1 = "Abcdefghijklcmn";
        boolean equa = str.equals(str1);
        boolean equa1 = str.equalsIgnoreCase(str1);
        System.out.println("两个字符是否相同：" + equa);
        System.out.println("两个字符是否相同(忽略大小写)：" + equa1);
        //isEmpty
        boolean s = str.isEmpty();
        System.out.println("字符是否为空：" + s);
        //toLowerCase
        System.out.println("原始数据" + str);
        String str2 = str.toLowerCase();
        System.out.println("全部换成小写：" + str2);
        String str3 = str.toUpperCase();
        System.out.println("全部换成大写：" + str3);
        //替换replace
        String str4 = str.replace("abc", "ABC");
        System.out.println("替换后的"+str4);
        String Str5 = new String("hello youj，I am from youj。");
        //replaceFirst
        System.out.print("返回值 :" );
        System.out.println(Str5.replaceFirst("youj",
                "google" ));
        System.out.print("返回值 :" );
        System.out.println(Str5.replaceFirst("(.*)youj(.*)",
                "google" ));
        //charAt 得到目标指定顺序的某个字符
        System.out.println("原始数据" + str);
        int bigstr = 0;
        for(int x = 0; x < str.length(); x++){
            char ch =str.charAt(x);    //char得到每个字符
            if(ch >= 'a' && ch <= 'z'){
                bigstr++;
            }
        }
        System.out.println("原字符总长度为："+str.length() +"小写字符的长度为" +bigstr);
        //subString
        String sta = str.substring(0,1);
        String end = str.substring(1);
        String staupp = sta.toUpperCase();
        String endlow = end.toLowerCase();
        String strul = staupp + endlow;
        System.out.println(strul);
        /*StringBuffer
        method
         */
        StringBuffer sb = new StringBuffer();
        sb.append("abcd");
        System.out.println("sb:" + sb);
    }
}
