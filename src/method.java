//public class method{
//    public static void main(String[] args){
//        int area = getArea(3, 5);
//        System.out.println("the area is " + area);
//        return;
//    }
//    public static int getArea(int x, int y){
//        int temp = x * y;
//        return temp;
//    }
//}

////打印三行*
//public class method{
//    public static void main(String[] args){
//        for(int i = 0; i < 3; i++){
//            for(int j = 0; j < 3; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}

///点名器，使用方法组合
//1.存储全班同学姓名
//2.随机选择一名同学
//3.打印出来
//
//public static void main(String[] args){
//    String[] students = new String[3];
//    addStudentName(students);
////    printStudentName(students);
////    String randomName = randomStudentName(students);
//    public static void addStudentName(String[] students){
//        System.out.println("请输入学生姓名");
//        Scanner sc = new Scanner(System.in);
//        for(int i = 0;i < students.length; i++){
//            System.out.println("存储第" + i + "个姓名");
//            students[i] = sc.next();
//        }
//    }
//        public static void printStudentName()
//}
//public static void method(String[] students){
//    String[] students = new String[3];
//    System.out.println("请输入学生姓名");
//    Scanner sc=new Scanner(System.in);
//    for(int i=0;i < students.length;i++){
//        System.out.println("存储第" + i + "个姓名");
//        students[i]=sc.next();
//        }
//}

////方法的重载入
////要求：1.参数的类型不一致；
////     2.参数的个数不一致；
////     3.参数的顺序可能不一致；
//     4.与变量名称无关
////     5.与入参有关，与返回值无关
//public class method{
//    public static void main(String[] args){
//        int sum01 = add(1, 2);
//        int sum02 = add(1, 2, 3);
//        double sum03 = add(1.2, 1.1);
//        double sum04 = add(1.2, 1);
//        double sum05 = add(1, 1.2);
//        System.out.println("sum01的值为 " + sum01);
//        System.out.println("sum02的值为 " + sum02);
//        System.out.println("sum03的值为 " + sum03);
//        System.out.println("sum04的值为 " + sum04);
//        System.out.println("sum05的值为 " + sum05);
//    }
//    public static int add(int x, int y){
//        return x + y;
//    }
//    public static int add(int x, int y, int z){
//        return x + y + z;
//    }
//    public static double add(double x, double y){
//        return x + y;
//    }
////    public static double add(int x, double y){
////        return x + y;
////    }
//    public static double add(double x, int y){
//        return x + y;
//    }
//}

//练习
// 1.定义3个重载方法，求2个，3个，4个小数的平均数 并分别在main方法中调用

//public class method{
//    public static void main(String[] args){
//        double average1 = average(3.4, 3.7);
//        double average2 = average(3.4, 3.7, 4.1);
//        double average3 = average(3.4, 3.7, 4.1, 4.2);
//        System.out.println("2个数的平均值为 " + average1);
//        System.out.println("3个数的平均值为 " + average2);
//        System.out.println("4个数的平均值为 " + average3);
//    }
//    public static double average(double x, double y){
//        return (x + y)/2;
//    }
//    public static double average(double x, double y, double z){
//        return (x + y + z)/4;
//    }
//    public static double average(double x, double y, double z, double m){
//        return (x + y + z + m)/4;
//    }
//}

//2.要求：定义一个方法，打印 0-100中所有奇数的个数、所有偶数的个数、所有奇数的和、所有偶数的和，并在main方法中调用

import java.lang.reflect.Array;
import java.util.Arrays;

//public class method{
//    public static void main(String[] args){
//        int figure = 100;
//       System.out.println(figure.count());
////        int[] arr = new int[0];
//////        int[] arr1 = new int[50];
//////        int count1 = count(arr);
////        System.out.println("打印出arr数组" + Arrays.toString(arr));
//    }
//    public static int count(int a){
//        for(int i = 0; i < a; i++) {
//            if (i % 2 == 0) {
//                i++;
//                System.out.println(i);
//            }
//        }
//    }
//}
//public class method{
//    public static void main(String[] args){
//        int j = 100;
//        int sum3 = cont(j);
//    }
//    public static int cont(int j) {
//        int sum1 = 0;
//        int sum2 = 0;
//        int m = 0;
//        int n = 0;
//        int arr1[] = new int[m];
//        int arr2[] = new int[n];
//        int x =0;
//        int y =0;
//        for(int i = 0; i < j; i++) {
//            if (i % 2 != 0) {
//                m++;
//                sum1 += i;   //求奇数和；
////                arr1[m] = i;
//                System.out.println(j + "以内所有奇数的为" + Arrays.toString(arr1));
//            }
//
//        }
//        for(int k = 0; k < j; k++) {
//            if (k % 2 == 0) {
//                n++;
//                sum2 += k;
////                arr1[n] = j;
//                System.out.println(j + "以内所有偶数的为" + Arrays.toString(arr2));
//            }
//        }
//        System.out.println(j + "以内所有奇数的个数为" + m);
//        System.out.println(j + "以内所有偶数的个数为" + n);
//        System.out.println(j + "以内所有奇数的为" + sum1);
//        System.out.println(j + "以内所有偶数的为" + sum2);
//        return 0;
//    }
//}
////

//3.定义一个方法，接收一个整数类型的数组作为参数，然后将数组里边的元素倒序打印
//        例如 数组里边元素为1,3,9,5,0  调用方法后打印出来的顺序 为 0,5,9,3,1，并分别在main方法中调用
public class method{
    public static void main(String[] args){
        int[] arr1 = new int[]{1, 3, 9, 5, 0};
        int[] arr2 = new int[arr1.length];
        backarr(arr1);
    }
    public static int backarr(int[] arr){
        int i = 0;
        int j = arr.length;
        int[] arr3 = new int[arr.length];
        for(i = 0;i < arr.length;i++){
            j--;
            arr3[j] = arr[i];
        }
        System.out.println("数组的倒序排列为" + Arrays.toString(arr3));
        return j;
    }
}
