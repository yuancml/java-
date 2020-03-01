import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Student {
    private int age;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void addStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Student s = new Student();
            System.out.println("第" + i + "个学生的姓名: ");
            String name = sc.next();
            s.setName(name);
            System.out.println("第" + i + "个学生的年纪: ");
            int age = sc.nextInt();
            s.setAge(age);
            list.add(s);
        }
    }
    public static void printStudent(ArrayList<Student> list) {
        for(int i = 0;i < list.size();i++){
            Student s = list.get(i);
            System.out.println(s.getName() + s.getAge());
        }
    }
    public static void randomStudent(ArrayList<Student> list) {
        int index = new Random().nextInt(list.size());
        Student s = list.get(index);
        System.out.println("随机点名的同学为" + s.getName() + s.getAge());
    }
public static void main(String[] args){
    ArrayList<Student> list = new ArrayList<Student>();
    addStudent(list);
    printStudent(list);
    randomStudent(list);
    }
}