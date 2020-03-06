package com.chenjia.threaddemo;

/**
 * @author Ashkilla
 * @create 2020-02-29-19:10
 */
public class Android extends Thread {
    private int version;
    public Android(String and_name,int ves){
        super(and_name);
        this.version = ves;
    }

    @Override
    public void run() {

        for (int i = 0; i <version ; i+=2) {
            System.out.println(i);
        }
    }
}
