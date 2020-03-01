package com.class_que_10;

interface Usb {
    void open();
    void close();
}
class Mouse implements Usb{
    public void open(){
        System.out.println("鼠标开启");
    }
    public void close(){
        System.out.println("鼠标关闭");
    }
}
class Keyboard implements Usb{
    public void open(){
        System.out.println("键盘开启");
    }
    public void close(){
        System.out.println("键盘关闭");
    }
}
class NoteBook {
    public void run() {
        System.out.println("笔记本运行");
    }

    public void useUsb(Usb usb) {
        if (usb != null) {
            usb.open();
            usb.close();
        }
    }

    public void shutDown() {
        System.out.println("笔记本关闭");
    }
    static class Test3 {
        public static void main(String[] args) {
            NoteBook nt = new NoteBook();
            nt.run();
            Mouse m = new Mouse();  //多态
            nt.useUsb(m);
            Keyboard k = new Keyboard();
            nt.useUsb(k);
            nt.shutDown();
        }
    }
}