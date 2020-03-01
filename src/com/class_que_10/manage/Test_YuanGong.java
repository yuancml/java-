package com.class_que_10.manage;

import java.util.ArrayList;

public class Test_YuanGong {
    public static void main(String[] args){
        ArrayList<YuanGong> yuanGongs = new ArrayList<YuanGong>();
        yuanGongs.add(new FuWuYuan.JingLi("经理","119", 100, 8000, 3000));
        yuanGongs.add(new FuWuYuan.ChuShi("厨师","120", 1000, 6000));
        yuanGongs.add(new FuWuYuan("服务员","1001", 200, 4000));
        yuanGongs.add(new FuWuYuan("服务员2", "1002", 200, 4000));
        //公司数据；
        GongSi gongSi = new GongSi(2000000, yuanGongs);
        System.out.println("公司总资产= " + gongSi.getZongZiChan());
        for(int i = 0; i < yuanGongs.size(); i++){
            YuanGong thisYuanGong = yuanGongs.get(i);
            System.out.println("姓名：" + thisYuanGong.getXingMing());
            System.out.println("工号：" + thisYuanGong.getGongHao());
            System.out.println("存款：" + thisYuanGong.getCunKuan());
            System.out.println("工资：" + thisYuanGong.getGongZi());
        }
        //发工资
        gongSi.faGongZi();
        System.out.println("------------------");
        // 发工资完后
        System.out.println("发完工资后的公司总资产：" + gongSi.getZongZiChan());
        for(int i = 0; i < yuanGongs.size(); i++){
            YuanGong thisYuanGong = yuanGongs.get(i);
            System.out.println("姓名：" + thisYuanGong.getXingMing());
            System.out.println("工号：" + thisYuanGong.getGongHao());
            System.out.println("存款：" + thisYuanGong.getCunKuan());
            System.out.println("工资：" + thisYuanGong.getGongZi());
        }
        System.out.println("====================");
        YuanGong lukyYuanGong = gongSi.lukyYuanGong();
        System.out.println("幸运员工是 " + lukyYuanGong.getXingMing());

        System.out.println("====================");
        //调用调整工资的方法；
        gongSi.tiaoXin(lukyYuanGong, 1500);
        System.out.println("调薪的员工：" + lukyYuanGong.getXingMing());
        System.out.println("调薪后的工资：" + lukyYuanGong.getGongZi());
        System.out.println("=====================");
        FuWuYuan.ChuShi chuShi = (FuWuYuan.ChuShi) yuanGongs.get(1);
        chuShi.server();

    }

}
