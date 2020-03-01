//if...else
//public class tiaojian {
//    public static void main(String[] args){
//        System.out.println("请输入一个数字");
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        if (x < 10) {
//          x++;
//            System.out.println("x小于5，x=" + x++);
//        }else{
//            System.out.println("x小于5，x=" + x);
//        }
//    }
//}

////if...else if....else
//public class tiaojian {
//    public static void main(String[] args){
//        int grade =49;
//        if(grade > 70) {
//            System.out.println("该同学的成绩为优");
//        }else if(grade > 60){
//            System.out.println("该同学的成绩为良");
//        }else if(grade > 50){
//            System.out.println("该同学的成绩为差");
//        }else{
//            System.out.println("该同学的成绩为0");
//        }
//    }
//}

////for循环语句
//public class tiaojian {
//    public static void main(String[] args){
//        int sum = 0;
//        for (int i = 1;i <= 4; i++){
//            sum += i;
//        }
//        System.out.println("sum的和为" + sum);
//    }
//}

////while循环
//public class tiaojian{
//    public static void main(String[] args){
//        int i = 0;
//        while (i < 4){
//            System.out.println("x的值为" + i);
//            i++;
//        }
//    }
//}

////do...while
//public class tiaojian {
//    public static void main(String[] args){
//        int x = 1;
//        do {
//            System.out.println("x的数值为" + x);
//                    x++;
//        }
//        while(x <= 4);
//    }
//}

////for循环嵌套
//public class tiaojian{
//    public static void main(String[] args){
//        int i,j;
//        for (i = 1; i <= 9;i++) {
//            for (j =1; j<=i; j++){
//                System.out.print("*");   //此处需要使用 print，不会换行，如果使用println会自动换行
//            }
//            System.out.println();
//        }
//    }
//}

////break
//public class tiaojian{
//    public static void main(String[] args){
//        int i = 1;
//        while (i <= 4){
//            System.out.println("x=" + i);
//            if (i == 3){
//                break;
//            }
//            i++;
//
//        }
//    }
//}

////itcast
//public class tiaojian{
//    public static void main(String[] args){
//        int i,j;
//        itcast: for(i=1;i <= 9; i++){
//        for(j = 1; j <= i; j++){
//                if (i > 4){
//                    break itcast;
//        }
//            System.out.print("*");
//            }
//            System.out.print("\n");
//        }
//
//    }
//}

////continue   计算100以内所有正奇数的和
//public class tiaojian{
//    public static void main(String[] args){
//        int sum = 0 ;
//        for (int i = 1; i < 100; i++) {
//            if (i % 2 == 0){
//                continue;
//            }
//            sum = sum +i;
//            System.out.println(sum);
//        }
////        System.out.println(sum);
//    }
//}

//猜数字游戏
//public class tiaojian{
//    public static void main(String[] args){
//        int rander = new Random().nextInt(100);
//        System.out.println("系统生成的数是" + rander);
//        Scanner nc = new Scanner(System.in);
//        System.out.println("请输入一个数字");
//        int enternumber = nc.nextInt();
//        while (enternumber != rander){
//            if(enternumber < rander) {
//                System.out.println("sorry，您猜小了!\n");
//            }else if(enternumber > rander) {
//            System.out.println("sorry，您猜大了!\n");
//                }
//            System.out.println("请输入一个数字");
//            enternumber = nc.nextInt();
//        }
//        if (enternumber == rander){
//            System.out.println("恭喜您，答对了!\n");
//        }
//    }
//}
//





