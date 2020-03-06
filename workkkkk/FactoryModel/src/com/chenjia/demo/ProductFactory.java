package com.chenjia.demo;

/**
 * @author Ashkilla
 * @create 2020-03-01-9:00
 */
public class ProductFactory {

    public static IProduct createProduct(String ProductNo){
        switch (ProductNo){
            case "1" : return new Product();
            case "2" : return new Product1();
            case "3" : return new Product2();
            case "4" : return new Product3();
            case "5" : return new Product4();
        }
    }

}
