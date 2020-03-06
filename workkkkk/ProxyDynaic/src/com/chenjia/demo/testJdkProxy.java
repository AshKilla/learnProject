package com.chenjia.demo;

/**
 * @author Ashkilla
 * @create 2020-02-29-22:06
 */
public class testJdkProxy {
    public static void main(String[] args) {
        JdkProxyExample jdkProxyExample = new JdkProxyExample();
        HelloWorld proxy = (HelloWorld) jdkProxyExample.bind(new HelloWorldImpl()); //调用sayHelloWorld方法
        proxy.sayHelloWorld();
    }
}
