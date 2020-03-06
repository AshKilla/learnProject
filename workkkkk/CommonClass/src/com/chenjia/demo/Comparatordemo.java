package com.chenjia.demo;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Ashkilla
 * @create 2020-03-05-15:55
 */
public class Comparatordemo {
    public static void main(String[] args) {
        good2[] all = new good2[4];
        all[0] = new good2("War and Peace", 100);
        all[1] = new good2("Childhood", 80);
        all[2] = new good2("Scarlet and Black", 140);
        all[3] = new good2("Notre Dame de Paris", 120);

        Arrays.sort(all, new Comparator() {
            @Override public int compare(Object o1, Object o2) {
                good2 g1 = (good2) o1;
                good2 g2 = (good2) o2;
                return g1.getName().compareTo(g2.getName());
            }
        });
        System.out.println(Arrays.toString(all));
    }
}

class good2{
    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public good2(String name, double price){
        this.name = name;
        this.price = price;
    }


}
