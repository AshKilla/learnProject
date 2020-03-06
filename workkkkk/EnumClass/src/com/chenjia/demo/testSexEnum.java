package com.chenjia.demo;

/**
 * @author Ashkilla
 * @create 2020-03-01-22:07
 * 测试枚举类sexEnum
 */
public class testSexEnum {
    public static void main(String[] args) {
        System.out.println(sexEnum.MALE.toString());
        System.out.println(sexEnum.MALE.getSexById(1));
        System.out.println(sexEnum.FEMALE.toString());
        System.out.println(sexEnum.FEMALE.getSexById(0));
    }
}
