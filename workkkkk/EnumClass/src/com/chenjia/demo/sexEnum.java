package com.chenjia.demo;

/**
 * @author Ashkilla
 * @create 2020-03-01-15:55
 */
public enum sexEnum {

    MALE(1,"男"),
    FEMALE(0,"女");

    private int id;
    private String name;

    sexEnum(int id,String name){
        this.id = id;
        this.name = name;
    }

    public sexEnum getSexById(int id){
        for (sexEnum sex : sexEnum.values()){
            if (sex.getId() == id){
                return sex;
            }
        }

        return null;
    }

    private int getId() {
        return this.id;
    }
}


