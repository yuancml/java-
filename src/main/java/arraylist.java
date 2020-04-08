import java.util.ArrayList;
//list创建、增、删、改、查
public class arraylist{
    public static void main(String[] arg){
        ArrayList<String> student = new ArrayList<String>();
        student.add("stu1");
        student.add("stu2");
        student.add("stu3");
        student.add("stu4");
        System.out.println("打印出student= " + student);
        System.out.println("打印出student的长度= " + student.size());
        System.out.println("打印出student的第二个数= " + student.get(1));
        //特殊用法
        student.add(0, "特殊添加");
        System.out.println("打印出student= " + student);
        student.remove("stu4");
        System.out.println("打印出student= " + student);
        student.remove(2);
        System.out.println("打印出student= " + student);
        student.set(1, "student5");
        System.out.println("打印出student= " + student);
        //遍历数组
        for(int i = 0; i < student.size(); i++){
            String j = student.get(i);
            System.out.println("student数组的第" + (i+1) + "个数为 " + j);
        }
        student.clear();
        System.out.println("打印出student= " + student);
    }
}

//随机点名器
//public class arraylist{
//    public static void main(String[] arg){
//        ArrayList<String> student = new ArrayList<String>();
//        student.add("ming");
//    }
//}
