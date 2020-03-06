package com.chenjia.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author Ashkilla
 * @create 2020-02-29-20:46
 */
public class testReflect {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        String str = "java.lang.String";

        //获取反射的三种常见方法
        Class clazz1 = Class.forName(str);  //返回指定名字的Class对象
        Class clazz2 = "java.lang.math".getClass();
        Class clazz = Person.class;

        ClassLoader classLoader = clazz.getClassLoader();   //返回一个类加载器
        Class superclass = clazz.getSuperclass();   //返回当前对象的父类的class
        System.out.println(clazz.getName());    // 返回实体
        System.out.println(clazz1.getName());
        System.out.println(clazz2.getName());

        //利用反射来创建对象
        Constructor con = clazz.getConstructor(String.class,String.class); //返回一个包含某些Constructor对象的数组
        Person person1 = (Person)con.newInstance("chenjia","chenjiajia");   //调用缺省构造函数，返回该Class对象的一个实例
//        clazz.getMethod("setName", String.class).invoke("chenjia");
        System.out.println("\n"+person1);
    }
}
