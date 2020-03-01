package com.ThreadClass;

public class TestRunnable implements Runnable{

    @Override
    public void run(){
        for(int i = 0;i < 1000;i++){
            System.out.println("我的线程：" + i);
        }
    }
    public void run_two(){
        for(int z = 0; z < 1000;z++){
            System.out.println("第二个线程" + z);
        }
    }
}
class TestRun{
    public static void main(String[] args){
        Runnable runn = new TestRunnable();
        //创建线程
        Thread thr1 = new Thread(runn);
        Thread thr2 = new Thread(runn);
        thr1.start();
        thr2.start();
        for(int j = 0; j < 10000;j++){
            System.out.println("main方法的线程" + j);
        }
    }

}