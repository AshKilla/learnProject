package com.chenjia.demo;

/**
 * @author Ashkilla
 * @create 2020-02-29-20:49
 */
public class Person {
    String name;
    String sub;

    public Person() {
    }

    public Person(String name,String sub){
        this.name =name;
        this.sub = sub;
    }

    public Person(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
