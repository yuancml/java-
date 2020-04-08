package com.class_que_10;

public class Phone {
    private String brand;
    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void call(){
        System.out.println("正在给xx打电话...");
    }
}
