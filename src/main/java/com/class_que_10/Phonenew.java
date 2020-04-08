package com.class_que_10;

public class Phonenew extends Phone {
    public void call() {
        System.out.println("语音拨号中...");
        super.call();
    }

    public void printBrand() {
        System.out.print(getBrand() + "的手机很好用...");
    }
}