package com.class_que_10;

public class Animal {
    private int age;
    private String name;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void eat(){
        System.out.println("吃饭...");
    }
}
class Cat extends Animal{
    public void eat(){
        System.out.println("猫吃鱼...");
    }
}
class Dog extends Animal{
    public void eat(){
        System.out.println("狗吃骨头...");
    }
}
class Test{
    public static void main(String[] args){
        Cat a = new Cat();
        a.setAge(1);
        a.getAge();
        a.setName("喵");
        a.getName();
        a.eat();
        Dog d = new Dog();
        d.setAge(2);
        d.getAge();
        d.setName("汪");
        d.getName();
        d.eat();
        System.out.println(a.getName() + "的年龄是" + a.getAge() + "," + d.getName() + "的年龄是" + d.getAge());
    }
}

