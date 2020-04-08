package com.class_que_10.manage;

public class ChuShi extends YuanGong implements VIP {
    public ChuShi(){
        super();
    }

    public ChuShi(String xingMing, String gongHao, double cunKuan, double gongZi){
        super(xingMing, gongHao, cunKuan, gongZi);
    }

    @Override
    public void work() {
        System.out.println("我做饭，你放心吃吧");
    }

    @Override
    public void server(){
        System.out.println("做饭加量加菜");
    }
}
