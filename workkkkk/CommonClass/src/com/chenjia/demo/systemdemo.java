package com.chenjia.demo;

/**
 * @author Ashkilla
 * @create 2020-03-05-15:23
 */
public class systemdemo {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();     //返回时间戳
        System.out.println("时间戳："+ time);
        System.gc();        //垃圾回收

        String javaVersion = System.getProperty("java.version");
        System.out.println("java的version:" + javaVersion);
        String javaHome = System.getProperty("java.home");
        System.out.println("java的home:" + javaHome);
        String osName = System.getProperty("os.name");
        System.out.println("os的name:" + osName);
        String osVersion = System.getProperty("os.version");
        System.out.println("os的version:" + osVersion);
        String userName = System.getProperty("user.name");
        System.out.println("user的name:" + userName);
        String userHome = System.getProperty("user.home");
        System.out.println("user的home:" + userHome);
        String userDir = System.getProperty("user.dir");
        System.out.println("user的dir:" + userDir);
        System.exit(0); //正常退出
    }
}
