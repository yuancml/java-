package com.class_que_10.manage;

public class FuWuYuan extends YuanGong implements VIP {
    public FuWuYuan() {
        super();
    }

    public FuWuYuan(String xingMing, String gongHao, double cunKuan, double gongZi) {
        super(xingMing, gongHao, cunKuan, gongZi);
    }

    @Override
    public void work(){
        System.out.println("亲，服务员全心为您服务，请给好评");
    }
    @Override
    public void server(){
        System.out.println("VIP服务-给客人倒酒");
    }

}
//public class FuWuYuan extends YuanGong implements VIP {
//    public FuWuYuan(){
//        super();
//    }
//    public FuWuYuan(String xingMing, String gongHao, double cunKuan, double gongZi){
//        super(xingMing, gongHao, cunKuan, gongZi);
//
//    }
//    public void work() {
//        System.out.println("亲，全心为您服务，请给好评");
//    }
//    @Override
//    public void server() {
//        System.out.println("给顾客倒酒");
//    }
//    public static class JingLi extends YuanGong{     //要想被外部使用FuWuYuan.JingLi ，必须使用static
//        private double jiangjin;
//        public JingLi(){
//            super();
//        }
//        public JingLi(String xingMing, String gongHao, double cunKuan, double gongZi, double jiangjin){
//            super(xingMing, gongHao, cunKuan, gongZi);
//            this.jiangjin = jiangjin;
//        }
//        public double getJiangJin(){
//            return jiangjin;
//        }
//        public void setJiangjin(double v){
//            this.jiangjin = jiangjin;
//        }
//        public void work(){
//            System.out.print("哪个员工不让顾客满意，我就扣她的工资");
//        }
//
//    }
//    public static class ChuShi extends YuanGong implements VIP{
//
//        public ChuShi(){
//            super();
//        }
//        public ChuShi(String xingMing, String gongHao, double cunKuan, double gongZi){
//            super(xingMing, gongHao, cunKuan, gongZi);
//        }
//        @Override
//        public void server() {
//            System.out.println("做饭加量加菜");
//        }
//
//        @Override
//        public void work() {
//            System.out.println("我做饭，你放心吃吧");
//        }
//    }
//}
