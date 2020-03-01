import java.util.Scanner;
//Scanner类的使用
public class scanner {
    public static void main(String[] args) {

        //创建Scanner
        Scanner sc = new Scanner(System.in);
        //获取数字
        System.out.println("请输入一个数字");
        int n = sc.nextInt();

        System.out.println("n的数值为" + n);
        System.out.println("请输入一个字符串");
        String m = sc.next();
        System.out.println("m为" + m);
    }
}