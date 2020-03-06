package com.chenjia.demo;

/**
 * @author Ashkilla
 * @create 2020-02-29-20:10
 */
public class Clerk {
    private int product = 0;

    //从生产者那里提取产品
    public synchronized void addProduct(){
        if(product >= 20 ){
            try{
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }else{
            product++;
            System.out.println("生产者生产了第"+product+"产品");
            notifyAll();
        }
    }

    //给消费者售卖产品，消费者从这那产品
    public synchronized void getProduct(){
        if (product <= 0){
            try{
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }else {
            System.out.println("消费者提取了第"+product+"产品");
            product--;
            notifyAll();
        }

    }
}
