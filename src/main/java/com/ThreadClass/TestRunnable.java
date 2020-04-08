package com.ThreadClass;

public class TestRunnable implements Runnable{

    @Override //需要重写run方法，start()方法会自动调用run()
    public void run(){
        for(int i = 0;i < 10;i++){
            System.out.println("我的线程：" + i);
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
        for(int j = 0; j < 10;j++){
            System.out.println("main方法的线程" + j);
        }
    }

}