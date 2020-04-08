package com.class_que_10.manage;
import java.util.ArrayList;

public class Test_YuanGong{
    public static void main(String[] args){
        ArrayList<YuanGong> yuanGongs = new ArrayList<YuanGong>();
        yuanGongs.add(new FuWuYuan("服务员1","001", 1000, 3000));
        yuanGongs.add(new FuWuYuan("服务员2","002", 2000, 3000));
        yuanGongs.add(new JingLi("经理","003", 10000, 8000, 5000));
        yuanGongs.add(new ChuShi("厨师","004", 5000, 7000));
     //公司
    GongSi gongSi = new GongSi(30000, yuanGongs);
    System.out.println("公司的资产= " + gongSi.getZongZiChan());
    for(int i = 0; i < yuanGongs.size(); i++){
        YuanGong thatYuanGong = yuanGongs.get(i);
        System.out.println("姓名:" + thatYuanGong.getXingMing());
        System.out.println("工号：" + thatYuanGong.getGongHao());
        System.out.println("存款：" + thatYuanGong.getCunKuan());
        System.out.println("工资：" + thatYuanGong.getGongZi());
    }
    //发工资
    gongSi.faGongZi();
    System.out.println("----------------------");
    //发完工资后
//    for(int i = 0; i < yuanGongs.size(); i++){
//        YuanGong thisYuanGong = yuanGongs.get(i);
//        System.out.println("姓名:" + thisYuanGong.getXingMing());
//        System.out.println("工号：" + thisYuanGong.getGongHao());
//        System.out.println("存款：" + thisYuanGong.getCunKuan());
//        System.out.println("工资：" + thisYuanGong.getGongZi());
//        }
    //公司资产
    System.out.println("公司剩余资产= " + gongSi.getZongZiChan());
    //幸运员工
    YuanGong luckyYuanGong = gongSi.luckyYuanGong();
    System.out.println("幸运员工是= " + luckyYuanGong.getXingMing());

    //调整工资
    gongSi.tiaoXin(luckyYuanGong, 500);
    System.out.println("调薪后的工资：" + luckyYuanGong.getGongZi());
    System.out.println("使用厨师的VIP服务");
    ChuShi thisChuShi = new ChuShi();
    thisChuShi.server();
    }
}

//public class Test_YuanGong {
//    public static void main(String[] args){
//        ArrayList<YuanGong> yuanGongs = new ArrayList<YuanGong>();
//        yuanGongs.add(new FuWuYuan.JingLi("经理","119", 100, 8000, 3000));
//        yuanGongs.add(new FuWuYuan.ChuShi("厨师","120", 1000, 6000));
//        yuanGongs.add(new FuWuYuan("服务员","1001", 200, 4000));
//        yuanGongs.add(new FuWuYuan("服务员2", "1002", 200, 4000));
//        //公司数据；
//        GongSi gongSi = new GongSi(2000000, yuanGongs);
//        System.out.println("公司总资产= " + gongSi.getZongZiChan());
//        for(int i = 0; i < yuanGongs.size(); i++){
//            YuanGong thisYuanGong = yuanGongs.get(i);
//            System.out.println("姓名：" + thisYuanGong.getXingMing());
//            System.out.println("工号：" + thisYuanGong.getGongHao());
//            System.out.println("存款：" + thisYuanGong.getCunKuan());
//            System.out.println("工资：" + thisYuanGong.getGongZi());
//        }
//        //发工资
//        gongSi.faGongZi();
//        System.out.println("------------------");
//        // 发工资完后
//        System.out.println("发完工资后的公司总资产：" + gongSi.getZongZiChan());
//        for(int i = 0; i < yuanGongs.size(); i++){
//            YuanGong thisYuanGong = yuanGongs.get(i);
//            System.out.println("姓名：" + thisYuanGong.getXingMing());
//            System.out.println("工号：" + thisYuanGong.getGongHao());
//            System.out.println("存款：" + thisYuanGong.getCunKuan());
//            System.out.println("工资：" + thisYuanGong.getGongZi());
//        }
//        System.out.println("====================");
//        YuanGong luckyYuanGong = gongSi.lukyYuanGong();
//        System.out.println("幸运员工是 " + luckyYuanGong.getXingMing());
//
//        System.out.println("====================");
//        //调用调整工资的方法；
//        gongSi.tiaoXin(luckyYuanGong, 1500);
//        System.out.println("调薪的员工：" + luckyYuanGong.getXingMing());
//        System.out.println("调薪后的工资：" + luckyYuanGong.getGongZi());
//        System.out.println("=====================");
//        FuWuYuan.ChuShi chuShi = (FuWuYuan.ChuShi) yuanGongs.get(1);
//        chuShi.server();
//
//    }
//
//}
