package com.API.Date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

public class Riqi {
    public static void main(String[] args){
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd"); //将日期转换成年，月，日 只要出现y,M,d,H,m,s就会自动转换为对应的日期格式
        Date a = new Date();
        String c = df.format(a); //Date转换String
        System.out.println(a);
        System.out.println(c);
        //String转Date
        DateFormat date = new SimpleDateFormat("yyyy年MM月dd日");
        String d = "2019年11月20日";
        Date g = null;
        try {
            g = date.parse(d);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("返回日期为：" + g);
        /*

         */
//        Calendar ca = Calendar.getInstance();
//        int cc = ca.get(Calendar.AM_PM);
//        System.out.println("Calendar返回日期为：" + ca.getTime());
//        System.out.println("Calendar返回日期为：" + cc);
//
        Calendar ca = Calendar.getInstance();
        ca.add(Calendar.MONTH, 1);  //add方法，月份+1
        Date cc = ca.getTime();   //获取毫秒值，可以做运算
        int cy = ca.get(Calendar.YEAR);  //获取年份
        int cy1 = ca.get(Calendar.HOUR); //时
        int cy2 = ca.get(Calendar.MONTH); //月份
        System.out.println("Calendar返回的数据：" + cy);
        System.out.println("Calendar返回的数据：" + cy1);
        System.out.println("Calendar返回的数据：" + cy2);
        System.out.println("转换时间格式" + cc);
        //计算是否时闰年
        Calendar ru = Calendar.getInstance();
        ru.set(2018, 2, 1);
        ru.add(Calendar.DAY_OF_MONTH, -1);
        int day = ru.get(Calendar.DAY_OF_MONTH);
        System.out.println("2月的天数：" +day);
    }
}
