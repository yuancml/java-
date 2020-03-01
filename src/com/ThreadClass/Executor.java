package com.ThreadClass;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executor implements Runnable {

    @Override
    public void run(){
        System.out.println("我要一个教练");
        try {
            Thread.sleep(1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("教练来了，" + Thread.currentThread().getName());
        System.out.println("教练结算后走了");
    }
}
class TestExecutor{
    public static void main(String[] args){
        ExecutorService exe = Executors.newFixedThreadPool(2);
        //创建线程对象
        Executor myThread = new Executor();
        Thread t = new Thread(myThread);
        t.start();
        exe.submit(myThread);
        exe.submit(myThread);
        exe.submit(myThread);
        exe.shutdown();
    }
}
