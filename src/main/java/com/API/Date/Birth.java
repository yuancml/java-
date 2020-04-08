package com.API.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Birth {
    void second(String birthday){
        SimpleDateFormat dft = new SimpleDateFormat("yyyy-MM-dd");
        Date birthdayDate = null;
        try{
            birthdayDate = dft.parse(birthday);
        }catch (ParseException e){
            e.printStackTrace();
        }
        Date today = new Date();
        long todaySecond = today.getTime();
        long birthdaySecond = birthdayDate.getTime();
        long sec = todaySecond - birthdaySecond;
        System.out.println(sec/1000/60/60/24);
    }
}
