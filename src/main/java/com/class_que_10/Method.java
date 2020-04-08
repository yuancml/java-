package com.class_que_10;

public class Method {
    private int a;
    private String num;
    Method(){}
    Method(int d){
        this.a = d;
    }

    public boolean equalsA(Method m) {
        return this.a == m.a;
    }
}
class Test_Method{
    public static void main(String[] args){
        int n = 190;
        Method j = new Method(n);
        j.equalsA(j);
    }
}
