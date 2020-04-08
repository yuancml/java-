package com.class_que_10.manage;

interface VIP {
    public abstract void server();
}

public abstract class YuanGong{
    private String xingMing;
    private String gongHao;
    private double cunKuan;
    private double gongZi;

    public YuanGong(){
        super();
    }
    public YuanGong(String xingMing, String gongHao, double cunKuan, double gongZi){
        super();
        this.xingMing = xingMing;
        this.gongHao = gongHao;
        this.cunKuan = cunKuan;
        this.gongZi = gongZi;
    }

    public abstract void work();
    //get and set
    public void setXingMing(){
        this.xingMing = xingMing;
    }
    public String getXingMing() {
        return xingMing;
    }
    public void setGongHao(){
        this.gongHao = gongHao;
    }
    public String getGongHao() {
        return gongHao;
    }
    public void setCunKuan(double cunKuan){
        this.cunKuan = cunKuan;
    }
    public double getCunKuan(){
        return cunKuan;
    }
    public void setGongZi(double gongZi){
        this.gongZi = gongZi;
    }
    public double getGongZi(){
        return gongZi;
    }

}

//员工类
//public abstract class YuanGong{
//    //属性
//    private String xingMing;
//    private String gongHao;
//    private double cunKuan;
//    private double gongZi;
//
//    //构造方法
//    public YuanGong(){
//        super();
//    }
//
//    public YuanGong(String xingMing,String gongHao,double cunKuan,double gongZi){
//        this.xingMing = xingMing;
//        this.gongZi = gongZi;
//        this.cunKuan = cunKuan;
//        this.gongHao = gongHao;
//    }
//
//    //抽象方法
//    public abstract void work();
//
//    //get和set
//    public void setXingMing(String xingMing){
//        this.xingMing = xingMing;
//    }
//    public String getXingMing(){
//        return xingMing;
//    }
//    public void setGongHao(String gongHao){
//        this.gongHao = gongHao;
//    }
//    public String getGongHao(){
//        return gongHao;
//    }
//    public void setCunKuan(double cunKuan){
//        this.cunKuan = cunKuan;
//    }
//    public double getCunKuan(){
//        return cunKuan;
//    }
//    public void setGongZi(double gongZi){
//        this.gongZi = gongZi;
//    }
//    public double getGongZi(){
//        return gongZi;
//    }
//}
///*
//服务员和厨师增加特殊VIP
// */
//interface Vip{
//    public abstract void server();
//}