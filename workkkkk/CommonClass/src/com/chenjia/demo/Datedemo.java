package com.chenjia.demo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

/**
 * @author Ashkilla
 * @create 2020-03-05-15:24
 */
public class Datedemo {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("当前时间戳："+ date.getTime());
        System.out.println("当前时间："+ date.toString());


        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        System.out.println("simple date format:"+simpleDateFormat.format(date));

    }
}
