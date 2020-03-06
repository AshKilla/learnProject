package com.chenjia.demo;

/**
 * @author Ashkilla
 * @create 2020-02-29-22:21
 */
public class TestClassLoader {
    public static void main(String[] args) throws ClassNotFoundException {

        // 获取系统的类加载器
        ClassLoader classloader = ClassLoader.getSystemClassLoader();
        System.out.println(classloader);

        //获取系统加载器的父加载器,即扩展类加载器
        classloader = classloader.getParent();
        System.out.println(classloader);

        //获取扩展类加载器的父加载器，即引导类加载器
        classloader = classloader.getParent();
        System.out.println(classloader);

        //5.测试JDK提供的Object类由哪个类加载器加载
        classloader = Class.forName("java.lang.Object").getClassLoader();
        System.out.println(classloader);
    }
}
