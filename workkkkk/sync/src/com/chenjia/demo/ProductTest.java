package com.chenjia.demo;

/**
 * @author Ashkilla
 * @create 2020-02-29-20:20
 */

public class ProductTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk(); Thread productorThread = new Thread(new Productor(clerk));
        Thread consumerThread = new Thread(new Consumer(clerk)); productorThread.start(); consumerThread.start();
} }
