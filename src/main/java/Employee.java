//public class Employee {
//    String name;
//    public void work(){
//        System.out.println("尽心尽力的工作");
//    }
//}
//class Teacher extends Employee{
//    public void printName(){
//        System.out.println("name = "+ name);
//    }
//    public static void main(String[] args) {
//        Teacher t = new Teacher();
//        t.name = "明";
//        t.printName();
//        t.work();
//    }
//}

////同名成员变量的处理
//class Employee{
//    int num = 5;
//}
//class Zi extends Employee{
//    int num = 6;
//    public void show(){
//        System.out.println("父类中的num= " + super.num);
//        System.out.println("子类中的num= " +this.num);
//    }
//    public static void main(String[] args){
//        Zi z = new Zi();
//        z.show();
//    }
//}
//同名方法的处理，重写
//class Employee{
//    public void work(){
//        System.out.println("父类方法执行");
//    }
//}
//class Zi extends Employee{
//    public void work(){
//        System.out.println("子类方法执行");
//    }
//    public static void main(String[] args){
//        Zi z = new Zi();
//        z.work();
//    }
//}
class Employee{
    void show(){
    }
    public void method(){

    }
}
class Zi extends Employee{
    public void show(){};
    public void method(){};
}