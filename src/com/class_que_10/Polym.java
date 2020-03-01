package com.class_que_10;


/**
 多态，父类引用成员变量，需要参考左边类，
 父类引用方法，需要参考右边类。
 */
//public class Polym {
//    int num = 4;
//}
//class Polym2 extends Polym{
//    int num = 5;
//}
//class Test2{
//    public static void main(String[] args){
//        Polym p = new Polym2();
//        System.out.println(p.num);
//        Polym2 p2 = new Polym2();
//        System.out.println(p2.num);
//    }
//}

public class Polym {
    void work() {
      System.out.println("引用Polym");
    }
}
class Polym2 extends Polym{
    void work() {
        System.out.println("引用Polym2");
    }
    void work2(){
        System.out.println("引用Polym2+work2");
    }
}
class Test2{
    public static void main(String[] args){
        Polym p = new Polym2();
       // p.work2();              //向下转型，才能使用子类的特有方法
        if(!(p instanceof Polym2)){
            System.out.println("类型不匹配，不能转换");
            return;
        }
        Polym2 m = (Polym2)p;     //向下转型，才能使用子类的特有方法
        m.work2();
    }
}
/**
 instanceof
 */

//public class Polym {
//    int num = 4;
//}
//class Polym2 extends Polym{
//    int num = 5;
//}
//class Test2{
//    public static void main(String[] args){
//        Polym p = new Polym();
////        boolean b = p instanceof Polym2;
//        System.out.println(b);
//    }
//}

/**
 多态转型
 */

//public class Polym {
//    int num = 4;
//}
//class Polym2 extends Polym{
//    int num = 5;
//}
//class Test2{
//    public static void main(String[] args){
////        int m = 5;
////        double d = m;
//        double m = 5;
//        int n = (int)m;   //强制转换
//    }
//}