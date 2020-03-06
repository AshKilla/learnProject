package com.chenjia.demo;

/**
 * @author Ashkilla
 * @create 2020-02-29-20:16
 */
class Productor implements Runnable {
    Clerk clerk;
    public Productor(Clerk clerk) {
        this.clerk = clerk;
    }
    public void run() {
        System.out.println("生产者开始生产产品");
        while (true) {
            try {
                Thread.sleep((int) Math.random() * 1000);
             } catch (InterruptedException e) {
                     e.printStackTrace();
            }
            clerk.addProduct();
        }
    }
}
