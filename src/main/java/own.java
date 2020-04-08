


//public class own {
//    public static void main(String[] args){
//        design p = new design();
//        p.brand = "小米6";
//        p.color = "黑色";
//        p.size = 2.4;
//        System.out.println("我的手机品牌是 " + p.brand);
//    }
//}

import java.util.Random;

public class own {
    public static void main(String[] args){
        String[] pets = {"fido","zeus","bin"};
        int x = pets.length;
        Random a = new Random();
        int y = a.nextInt(3);
        String s = pets[y];
        System.out.println(s + " is a dog");
    }
}