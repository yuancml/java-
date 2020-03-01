package com.ThreadClass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TreadSun extends Thread {
    String name;
    public TreadSun(String name){
        this.name = name;  // 可以直接使用super(name);
    }
    @Override
    public void run(){
        for(int i = 0;i < 1000;i++){
            System.out.println("程序正在打印name = " + i);
        }
    }
    public void run2(){
        for(int z = 0;z < 1000;z++){
            System.out.println("第二个程序正在打印name = " + z + Thread.currentThread().getName());
        }
    }

}
class TestThread{
    public static void main(String[] args){
        //计算时间
        long startTime = System.currentTimeMillis();
        SimpleDateFormat sdf = new SimpleDateFormat();
        String start = sdf.format(new Date(startTime));
        Date s1 = new Date();
        s1.getTime();
        //运行程序
        TreadSun myThread = new TreadSun("线程");
        TreadSun myThread2 = new TreadSun("线程2");
        myThread2.run2();
        myThread.run();
        //运行结束，开始计算
        long endTime = System.currentTimeMillis();
        String end = sdf.format(new Date(endTime));
//        Date myTime = end - start;
        Date s2 = new Date();
        s2.getTime();
//        Date s3 = s2 - s1;
        System.out.println("打印之前的时间为： " + start);
        System.out.println("打印之后的时间为： " + end);
//        System.out.println("打印之后的时间为： " + s1);

    }
}