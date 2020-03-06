package com.chenjia.demo;

/**
 * @author Ashkilla
 * @create 2020-02-29-20:18
 */
public class Consumer implements Runnable {
    Clerk clerk;

    public Consumer(Clerk clerk) { this.clerk = clerk;
    }
    public void run() { System.out.println("消费者开始取走产品"); while (true) { try {
        Thread.sleep((int) Math.random() * 1000);
    } catch (InterruptedException e) { e.printStackTrace();
    } clerk.getProduct(); } }
}
