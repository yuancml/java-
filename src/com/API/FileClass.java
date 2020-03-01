package com.API;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

public class FileClass {
    public static void getAllFile(File file) {
        File[] files = file.listFiles();
        for (File n : files) {
            if (n.isDirectory()) {
                getAllFile(n);
            } else {
                System.out.println("打印出当前文件名称" + n);
            }
        }
    }

    public static void main(String[] args) {
                /*
        递归得出所有的文件目录
         */
//        File desktop = new File("/Users/cml/Desktop");
//        getAllFile(desktop);
        /*
        file常用方法
         */
        File f = new File("/Users/cml/Desktop/tech_java");
        System.out.println("输出文件位置： " + f);
        File f1 = new File(f, "vhr/hrserver");
        System.out.println("输出文件位置： " + f1);
        /*
        File的方法
         */
        String f_get = f1.getAbsolutePath();
        String f_name = f1.getName();
        String f_getpath = f1.getPath();
        long f_getlength = f1.length();
        System.out.println("输出f_get:" + f_get);
        System.out.println("输出f_get:" + f_name);
        System.out.println("输出f_get:" + f_getpath);
        System.out.println("输出f_get:" + f_getlength);
        /*
        listFiles()
        list()返回该文件路径下的所有文件
        listFile()返回该文件路径下的所有文件的路径
         */

        String[] names = f.list();
        for (String name : names) {
            System.out.println("输出list方法得到的数组：" + Arrays.toString(names) + " 下的文件为： " + name);
        }
        File[] lists = f.listFiles();
        for (File list : lists) {
            System.out.println("输出listFiles方法得到的数组：" + Arrays.toString(lists) + " 下的文件为： " + list);
            File[] filefilters = f.listFiles(new MyFileFilter());
            for (File filefilter : filefilters) {
                System.out.println("打印出符合要求的文件：" + filefilter);
            }
        }
    }
}


class MyFileFilter implements FilenameFilter {
    public boolean accept(File dir, String name) {
        return name.endsWith("vhr");
    }
}