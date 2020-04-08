package com.class_que_13;

public class Phone {
    private String brand;
    private String color;
    //成员变量私有，需要编写方法获得；
    public String getBrand(){
        return brand;
    }
    public void setBrand(){
        this.brand = brand;
    }
    public String getColor(){
        return color;
    }
    public void setColor(){
        this.color = color;
    }
    //构造方法
    public Phone(){
        super();
    }
    public Phone(String brand, String color){
        super();
        this.brand = brand;
        this.color = color;
    }
    public static void call(){
        System.out.println("正在打电话");
    }
    public void system(){
        System.out.println("手机的品牌：" + brand + ",颜色：" + color);
    }
}
class Te {
    public static void main(String[] args) {
        Phone phone = new Phone("小米", "黑色");
        phone.call();
        phone.system();
        System.out.println(phone.getBrand());
    }
}