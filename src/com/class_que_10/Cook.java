package com.class_que_10;

public abstract class Cook {
    private int age;
    private String name;

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public abstract void steam();   //抽象方法--对应抽象类
}
