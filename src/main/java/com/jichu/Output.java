package com.jichu;

public class Output {
    public static void main(String[] args){
        double x = -100000.00/3;
//        System.out.println(x);
//        System.out.printf("%1.2f", x); //printf用法，引号中点后是小数位数
        //断言
//        if (x < 0){
//            throw new IllegalArgumentException("x<0");
//        }
        assert x<0: x;
    }
}
