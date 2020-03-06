package com.chenjia.demo;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author Ashkilla
 * @create 2020-03-05-15:46
 */
public class comparedemo {
    public static void main(String[] args) {
        good[] all = new good[4];
        all[0] = new good("《红楼梦》", 100);
        all[1] = new good("《西游记》", 80);
        all[2] = new good("《三国演义》", 140);
        all[3] = new good("《水浒传》", 120);
        Arrays.sort(all);
        System.out.println(Arrays.toString(all));
    }

}

class good implements Comparable{
    private String name;
    private double price;

    public good(String name,double price){
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof good){
            good other = (good) o;
            if(this.price>other.price){
                return 1;
            }else if (this.price < other.price){
                return -1;

            }
            return 0;
        }
        throw new RuntimeException("输入的数据类型不一致");
    }
}