package com.class_que_10;

interface Demo {
    public static final int num = 3;
    public abstract void show1();
}
interface Demo2{
    public abstract void show2();
}

class DemoImpl implements Demo,Demo2{
    public void show1(){};
    public void show2(){};
}
