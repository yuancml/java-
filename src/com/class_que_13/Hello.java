package com.class_que_13;

public class Hello {
    public static String sta;
    public String man;
    void mana(){
        System.out.println("定义为成员方法" + man);
    }
    static void stat(){
        System.out.println("定义为静态方法" + sta);
    }
}
class Te_Hello{
    public static void main(String[] args){
        Hello hello = new Hello();
        hello.mana();
        hello.stat();
    }
}
