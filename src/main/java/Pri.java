class Pri {
    private int age;
    private String name;

    public void setAge(int a){
        if(a < 0 || a > 150){
            System.out.print(a + " 不符合要求");
            return;
        }
        else{
            age = a;
        }
    }
    public int getAge(){
        return age;
    }
//class PriDemo{
public static void main(String[] args){
    Pri i = new Pri();
    i.setAge(10);
    int m = i.getAge();
    System.out.println(m);
    }
}

