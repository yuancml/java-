package com.class_que_10.manage;
import java.util.ArrayList;
import java.util.Random;

public class GongSi{
    private double zongZiChan;
    private ArrayList<YuanGong> yuanGongs;

    public GongSi(){
        super();
    }

    public GongSi(double zongZiChan, ArrayList<YuanGong> yuanGongs){
        this.zongZiChan = zongZiChan;
        this.yuanGongs = yuanGongs;
    }

    public void setZongZiChan(double zongZiChan){
        this.zongZiChan = zongZiChan;
    }

    public double getZongZiChan(){
        return zongZiChan;
    }

    public ArrayList<YuanGong> getYuanGongs(){
        return yuanGongs;
    }

    public void setYuangongs(ArrayList<YuanGong> yuanGongs){
        this.yuanGongs = yuanGongs;
    }
    //发工资
    public void faGongZi(){
        for(int i = 0; i < yuanGongs.size(); i++){
            YuanGong thisYuanGong = yuanGongs.get(i);
            if(thisYuanGong instanceof JingLi){
                JingLi thisJingLi = (JingLi) thisYuanGong;
                zongZiChan -= thisJingLi.getJiangJin();
                zongZiChan -= thisJingLi.getGongZi();
                //发过奖金后，经理的存款
                thisJingLi.setCunKuan(thisJingLi.getCunKuan() + thisJingLi.getGongZi() + thisJingLi.getJiangJin());
                System.out.println("发完奖金的员工的姓名" + thisYuanGong.getXingMing());
            }else{
                zongZiChan -= thisYuanGong.getGongZi();
                //发过奖金后，员工的存款
                thisYuanGong.setCunKuan(thisYuanGong.getCunKuan() + thisYuanGong.getGongZi());
                System.out.println("发完奖金的员工的姓名" + thisYuanGong.getXingMing());
            }
        }
    }
    //抽取幸运员工
    public YuanGong luckyYuanGong() {
        return yuanGongs.get(new Random().nextInt(yuanGongs.size()));
    }
    //调薪
    public void tiaoXin(YuanGong yG, double fd){
        yG.setGongZi(yG.getGongZi() + fd);
    }

}



//public class GongSi {
//    private double zongZiChan;
//    private ArrayList<YuanGong> yuanGongs;
//    public GongSi(){
//        super();
//    }
//    public GongSi(double zongZiChan, ArrayList<YuanGong> yuanGongs){
//        this.zongZiChan = zongZiChan;
//        this.yuanGongs = yuanGongs;
//    }
//    public void faGongZi(){
//        for(int i = 0; i < yuanGongs.size();i++){
//            YuanGong thisYuanGong = yuanGongs.get(i);
//            if (thisYuanGong instanceof FuWuYuan.JingLi) {
//                FuWuYuan.JingLi thisJingLi = (FuWuYuan.JingLi) thisYuanGong;
//                zongZiChan -= thisJingLi.getJiangJin();
//                zongZiChan -= thisJingLi.getGongZi();
//                //发过奖金后，该经理的存款会多一个月的奖金
//                thisJingLi.setCunKuan(thisJingLi.getCunKuan() + thisJingLi.getJiangJin() + thisJingLi.getCunKuan());
//            }else{
//                zongZiChan -= thisYuanGong.getGongZi();
//                //发过工资后，该员工的存款会多一个月的工资
//                thisYuanGong.setCunKuan(thisYuanGong.getCunKuan() + thisYuanGong.getGongZi());
//                }
//        }
//    }
//    public void tiaoXin(YuanGong yg, double fudu){
//        yg.setGongZi(yg.getGongZi() + fudu);
//    }
//    public YuanGong lukyYuanGong(){
//        return yuanGongs.get(new Random().nextInt(yuanGongs.size()));
//    }
//    public double getZongZiChan(){
//        return zongZiChan;
//    }
//    public void setZongZiChan(double zongZiChan){
//        this.zongZiChan = zongZiChan;
//    }
//    public ArrayList<YuanGong> getYuanGongs(){
//        return yuanGongs;
//    }
//    public void setYuanGongs(ArrayList<YuanGong> yuanGongs){
//        this.yuanGongs = yuanGongs;
//    }
//}
