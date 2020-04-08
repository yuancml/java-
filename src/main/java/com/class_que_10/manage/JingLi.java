package com.class_que_10.manage;

public class JingLi extends YuanGong {
    private double JiangJin;
    public JingLi(){
        super();
    }
    public JingLi(String xingMing, String gongHao, double cunKuan, double gongZi, double JiangJin){
        super(xingMing, gongHao, cunKuan, gongZi);
        this.JiangJin = JiangJin;
    }

    public void setJiangJin(double JiangJin){
        this.JiangJin = JiangJin;
    }

    public double getJiangJin(){
        return JiangJin;
    }

    @Override
    public void work(){
        System.out.println("哪个员工不让顾客满意，我就扣她的工资");
    }
}
