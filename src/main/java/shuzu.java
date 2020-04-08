import java.util.Scanner;

public class shuzu {
    public static void main(String[] args) {
//        Random r =  new Random(100);   //新建Random实例
//        int week = r.nextInt(7) + 1;
//        System.out.println("week的值为" + week);
//        int week = new Random().nextInt(7) + 1;
//        System.out.println("week的值为" + week);
//以下是生成随机数
//        int week = new Random().nextInt(100);
//        System.out.println("系统生成的数是" + week);
//以下是键盘输入数字
//        Scanner s = new Scanner(System.in);
//        int week = s.nextInt();
        System.out.println("请输入一个数字");
        int week = new Scanner(System.in).nextInt() + 1;
        switch (week) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("今天是工作日");
                break;
            case 6:
            case 7:
                System.out.println("今天是周末");
                break;
        }
    }
}
    //list常用方法

//public class shuzu{
//    public static void main(String[] args){
//        int[] arr = new int[4];
//        System.out.println("int[0]=" + arr[0]);
//        System.out.println("int[1]=" + arr[1]);
//        System.out.println("int[2]=" + arr[2]);
//        System.out.println("int[3]=" + arr[3]);
//    }
//}

//
//public class shuzu{
//    public static void main(String[] args){
//        int[] arr = {4, 2 ,3 ,4 };
//        System.out.println("int[0]=" + arr[0]);
//        System.out.println("int[1]=" + arr[1]);
//        System.out.println("int[2]=" + arr[2]);
//        System.out.println("int[3]=" + arr[3]);
//    }
//}

//数组+for循环遍历
//public class shuzu{
//    public static void main(String[] args){
//        int[] arr = {1, 4, 5, 7, 9, 0};
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//    }
//}

//数组+for循环遍历查找最大值
//public class shuzu{
//    public static void main(String[] args){
//        int[] arr = new int[]{9, 422889, 3333333, 44, 67, 123, 455, 889999999, 2329, 423, 5869};
//        int max = arr[0];
//        for (int i =0; i < arr.length; i++){
//            if (arr[i] > max){
//                max = arr[i];
//                System.out.println("max的值依次为" + max);
//            }
//        }
//        System.out.println();
//        System.out.print("max最终的值为" + max);
//    }
//}

//// 二维数组遍历 求和
//public class shuzu{
//    public static void main(String[] args){
//        int[][] arr = {{1,2,3}, {4, 5, 6, 7}, {8, 9, 10, 11}};
//        int i,j;
//        int sum = 0;
//        for (i = 0; i < arr.length; i++){
//            for (j = 0; j < arr[i].length; j++){
//                System.out.println("数组的值为" + arr[i][j]);
//                sum += arr[i][j];
//                System.out.println("所有数组的和=" + sum);
//            }
//        }
//    }
//}

////随机点名
////1.键盘输入同学姓名，程序保存起来到 arr[]
////2.打印出所有同学姓名；
////3.在所有人数范围内，随机获取一个数字，根据这个数字打印出对应同学姓名；
//public class shuzu{
//    public static void main(String[] args){
////1.键盘输入同学姓名，并保存起来到 names数组
//        String[] names = new String[3];
//        Scanner nc = new Scanner(System.in);
//        for(int i = 0;i < names.length;i++) {
//            System.out.println("请输入第" + (i+1) + "个姓名，不要带数字");
//            names[i] = nc.next();
//        }
////2.打印出所有同学的姓名；
//        System.out.println("所有学生的姓名为" + Arrays.toString(names));
//        for(int i = 0; i < names.length; i++){
//            System.out.println("第" + (i+1) + "个姓名的姓名为" + names[i]);
//        }
////3.生成随机数，随机打出某个同学的姓名
//        int x = new Random().nextInt(names.length);
//        String name = names[x];
//        System.out.println("随机点名的同学姓名是" + name);
//    }
//}


//课堂作业
//1.要求：
//        输入1~7的一个数字，输出以该数字打头的一个成语如下:
//        1:一帆风顺
//        2:二话不说
//        3:三心二意
//        4:四面楚歌
//        5:五湖四海
//        6:六亲不认
//        7:七上八下
//        其它:您输入的有误!
//使用方法: 1.while case
//public class shuzu{
//    public static void main(String[] args){
//        System.out.println("请输入数字");
//        int week = new Scanner(System.in).nextInt();
//        System.out.println("您输入的数字为" + week);
//        switch(week){
//            case 1:
//                System.out.println("一帆风顺");
//                break;
//            case 2:
//                System.out.println("二话不说");
//                break;
//            case 3:
//                System.out.println("三心二意");
//                break;
//            case 4:
//                System.out.println("四面楚歌");
//                break;
//            case 5:
//                System.out.println("五湖四海");
//                break;
//            case 6:
//                System.out.println("六亲不认");
//                break;
//            case 7:
//                System.out.println("七上八下");
//                break;
//            default:
//                System.out.println("您输入的有误!");
//        }
//    }
//}

//2.自定义一个int类型数组并赋值,获取到数组中最大值和最小值的差值,打印到控制台
//方法：int[]

//public class shuzu{
//    public static void main(String[] args){
//        int[] number = {1, 5, 2, 8, 9};
//        int max = number[0];
//        int min = number[number.length - 1];
//        for (int i = 1; i < number.length; i++) {
//            if (number[i] > max) {
//                max = number[i];
//            }
//        }
//        for (int j = 0; j < (number.length - 1); j++) {
//            if (number[j] < min) {
//                min = number[j];
//            }
//        }
//        int value = max - min;
//        System.out.println("max - min=" + value);
//    }
//}

//现在有如下的一个数组:int oldArr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5}
//要求将以上数组中值为0的项去掉，将不为0的值存入一个新的数组，生成的新数组为:
//int newArr[]={1,3,4,5,6,6,5,4,7,6,7,5}
//最后遍历两个数组要求格式如下:

//public class shuzu{
//    public static void main(String[] args){
//        int oldArr[] = {1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
//        int i;
//        int j =0;
//        for(i = 0; i < oldArr.length; i++){
//            if(oldArr[i] != 0){
//                j++;
//            }
//        }
//        int newArr[] = new int[j];
//        int m = 0;
//        for(i = 0; i < oldArr.length; i++){
//            if(oldArr[i] != 0){
//                newArr[m] = oldArr[i];
//                m++;
//            }
//        }
//        System.out.println("新的数组为" + Arrays.toString(newArr)); //打印数组
//    }
//}
//
//


//4.例如要统计一个公司三个销售小组中每个小组的总销售额以及整个公司的销售额。如下所示
//第一小组销售额为{11, 12}万元
//第二小组销售额为{21, 22, 23}万元
//第三小组销售额为{31, 32, 33, 34}万元。
//运行结果如下图所示。  第一个小组的销售额为##万元  ；
//                   第二个小组的销售额为##万元  ；
//                   第三个小组的销售额为##万元  ；

//  定义变量的位置和顺序不同，在循环中产生的影响也是不一样的。层级越高，累加的影响也更多
//public class shuzu{
//    public static void main(String[] args){
//        int[][] arr = {{11, 12}, {21, 22, 23}, {31, 32, 33, 34}};
//        int i, j=0;
//        int sum2 = 0;
////        int newarr[] = new arr[(1+j+j-i)/2*i];
//        for (i = 0; i < arr.length; i++){
//            int sum=0;
//            for (j =0; j < arr[i].length; j++){
//                System.out.println(arr[i][j]);
//                sum += arr[i][j];
//                sum2 += arr[i][j];
//            }
//            System.out.println("第" + i + "个小组的销售额为" + sum);
//            System.out.println("所有的数的和为"+ sum2);
//        }
////        System.out.println("所有的数的和为"+ sum2);
//    }
//}





