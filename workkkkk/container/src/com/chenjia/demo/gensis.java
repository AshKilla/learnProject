package com.chenjia.demo;

/**
 * @author Ashkilla
 * @create 2020-02-29-21:28
 */
public class gensis {
    public static void main(String[] args) {
        MyCollection<String> myCollection = new MyCollection<>("chenjia");
        System.out.println(myCollection.getName());
    }
}


//泛型类
class MyCollection<E>{
    private E name;

    public MyCollection(E name){
        this.name = name;
    }

    public E getName(){
        return this.name;
    }
}
