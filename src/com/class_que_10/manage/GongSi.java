package com.class_que_10.manage;

import java.util.ArrayList;
import java.util.Random;

public class GongSi {
    private double zongZiChan;
    private ArrayList<YuanGong> yuanGongs;
    public GongSi(){
        super();
    }
    public GongSi(double zongZiChan, ArrayList<YuanGong> yuanGongs){
        this.zongZiChan = zongZiChan;
        this.yuanGongs = yuanGongs;
    }
    public void faGongZi(){
        for(int i = 0; i < yuanGongs.size();i++){
            YuanGong thisYuanGong = yuanGongs.get(i);
            if (thisYuanGong instanceof FuWuYuan.JingLi) {
                FuWuYuan.JingLi thisJingLi = (FuWuYuan.JingLi) thisYuanGong;
                zongZiChan -= thisJingLi.getJiangJin();
                zongZiChan -= thisJingLi.getGongZi();
                //发过奖金后，该经理的存款会多一个月的奖金
                thisJingLi.setCunKuan(thisJingLi.getCunKuan() + thisJingLi.getJiangJin() + thisJingLi.getCunKuan());
            }else{
                zongZiChan -= thisYuanGong.getGongZi();
                //发过工资后，该员工的存款会多一个月的工资
                thisYuanGong.setCunKuan(thisYuanGong.getCunKuan() + thisYuanGong.getGongZi());
                }
        }
    }
    public void tiaoXin(YuanGong yg, double fudu){
        yg.setGongZi(yg.getGongZi() + fudu);
    }
    public YuanGong lukyYuanGong(){
        return yuanGongs.get(new Random().nextInt(yuanGongs.size()));
    }
    public double getZongZiChan(){
        return zongZiChan;
    }
    public void setZongZiChan(double zongZiChan){
        this.zongZiChan = zongZiChan;
    }
    public ArrayList<YuanGong> getYuanGongs(){
        return yuanGongs;
    }
    public void setYuanGongs(ArrayList<YuanGong> yuanGongs){
        this.yuanGongs = yuanGongs;
    }
}
