package com.API.Date;
import java.util.Scanner;

public class TestBirth {
    public static void main(String[] args){
        System.out.println("请输入你的年龄，格式 yyyy-MM-dd");
        Birth birthday = new Birth();
        String birth = new Scanner(System.in).next();
        birthday.second(birth);
    }
}
