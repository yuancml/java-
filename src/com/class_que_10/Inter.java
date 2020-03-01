package com.class_que_10;

interface 缉毒{
    public abstract void 缉毒();
        }
abstract class 犬{
    public abstract void 吃饭();
    public abstract void 吼叫();
}
class 缉毒犬 extends 犬 implements 缉毒{
    public void 缉毒(){
        System.out.println("犬会缉毒");
    }
    public void 吃饭(){}
    public void 吼叫(){}
}
class 缉毒猪 implements 缉毒{
    public void 缉毒(){}
}
class ceshi{
    public static void main(String[] args){
        缉毒犬 j = new 缉毒犬();
        j.缉毒();
    }
}