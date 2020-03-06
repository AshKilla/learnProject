package com.chenjia.threaddemo;

/**
 * @author Ashkilla
 * @create 2020-02-29-19:15
 */
public class testAndroid {
    public static void main(String[] args) throws InterruptedException {
        Android android =  new Android("and1",10);
        android.start();
        System.out.println(android.getName());
        System.out.println(android.getPriority());
        System.out.println(android.isAlive());
        android.sleep(4000);
    }
}
