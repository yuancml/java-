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