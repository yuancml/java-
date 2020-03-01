package com.class_que_13;

public class Cout {
    public int number1;
    public int number2;

    public Cout() {
        super();
    }
    public Cout(int number1, int number2) {
        super();
        this.number1 = number1;
        this.number2 = number2;
    }

    public double sum(){
        return number1 + number2;
    }
    public double sub(){
        return number1 - number2;
    }
    public double mul(){
        return number1 * number2;
    }
    public double div(){
        return number1 / number2;
    }
    //执行方法
    public static void main(String[] args){
        Cout cout = new Cout(100000000, 100);
        System.out.println(cout.sum());
        System.out.println(cout.sub());
        System.out.println(cout.mul());
        System.out.println(cout.div());
    }

}
