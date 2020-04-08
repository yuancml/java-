package com.API.Date;

import java.util.Arrays;

public class MathClass {
    public static void main(String[] args){
//        double n1 = -5.1;
//        int n2 = 10;
//        int n3 = 2;
//        System.out.println(Math.abs(n1)); //绝对值
//        System.out.println(Math.ceil(n1));//返回整数，接入正无穷大；
//        System.out.println(Math.floor(n1));//返回整数，接入负无穷大；
//        System.out.println(Math.pow(n3, 2));//返回n3的n2次方；
//        System.out.println(Math.random());//返回随机数m， 0<m<1
//        /*
//        System方法，常用的方法
//        */
//        //验证打印1000次时间
//        long start = System.currentTimeMillis();
//        for(int i = 0; i < 10000; i++){
//            System.out.println(i);
//        }
//        long end = System.currentTimeMillis();
//        System.out.println("打印总耗时：" + (end - start));
//        //相互替换2个数组中的位置
        int[] src = new int[]{1,2,3,4,5,6};
        int[] dest = new int[]{7,8,9,10,11,12};
        System.arraycopy(src, 2,dest, 1,4);  //src为复制原数据，2是复制数组开始的位置；dest为复制的目的数组，1，4是目的数组的复制位置；
        System.out.println("int[] src= " + Arrays.toString(src) + "int[] dest=  "+ Arrays.toString(dest));
        //退出
//        for(int i = 100;i < 901;i++){
//            if(i % 10 == 0){
//                System.out.println("i= " + i);
////                System.exit(i);
//            }
//        }
//        Random random = new Random();
//        while (true){
//            int number = random.nextInt(900) + 100;
//            System.out.println("number: "+ number);
//            if (number % 10 == 0){
//                System.out.println("WHILE方法的i = " + number);
//                System.exit(number);
//            }
//        }
//        //
//        //Arrays类方法
//        //
        double[] arr5 = new double[]{12,59,232,5232,90,23,5,6,8};
//        double[] arr2 = Arrays.sort(arr5);
//        int arr3 = arr2[3];
        Arrays.sort(arr5);  //排序，从小到大
        int n = Arrays.binarySearch(arr5, 59);  //返回指定数字在数组中的位置，0，1，2。。。。
        double[] result = new double[4];
        System.arraycopy(arr5,0, result, 0, 3);
        System.out.println("返回结果result：" + Arrays.toString(result));
        System.out.println("打印出后重新排序的后三位" + Arrays.toString(arr5));
        System.out.println("打印出指定的数" + n);
    }
}
