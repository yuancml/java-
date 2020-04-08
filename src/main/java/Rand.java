//Random类
//public class random{
//    public static void main(String[] args){
//        Random r = new Random();
//        int i = r.nextInt(101);
//        double d = r.nextDouble();
//        if(i < 100) {
//            for (int j = 1; j < 100; j++){
//                Random m = new Random();
//                int n = r.nextInt(101);
//                System.out.println(n);
//            }
//        }
//    }
//}
//import java.util.Random;
////do while循环
//public class Rand{
//    public static void main(String[] args){
//        int i;
//        do{
//            Random r = new Random();
//            i = r.nextInt(100);
//            System.out.println(i);
//        } while (i < 100);
//    }
//}

//public class Rand{
//    int s;
//    public Rand(String name){
//        System.out.println(name);
//    }
//    public void setAge(int age){
//        s = age;
//    }
//    public int getAge(){
//        System.out.println(s);
//        return s;w
//    }
//    public static void main(String[] args){
//        Rand s = new Rand("chenming");
//        s.setAge(5);
//        s.getAge();
//        System.out.println(s.getAge());
//    }
//}
public class Rand{
    public static void main(String[] args){
        byte i =127;
        int b = (byte)i;
        System.out.println(b);
    }
}

//public class Rand{
//    public static void main(String[] args){
//        char c1='a';//定义一个char类型
//        int i1 = c1;//char自动类型转换为int
//        System.out.println("char自动类型转换为int后的值等于"+i1);
//        char c2 = 'A';//定义一个char类型
//        int i2 = c2+1;//char 类型和 int 类型计算
//        System.out.println("char类型和int计算后的值等于"+i2);
//    }
//}