package com.chenjia.demo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Ashkilla
 * @create 2020-03-02-15:00
 * 使用集合接口容器
 */
public class CollectionListImpl {
    //实现Collection接口的子接口List：元素都是有序可重复，JDK API中List接口的实现类常用的有：ArrayList、LinkedList和Vector

    /*
     * void add(int index, Object ele):在index位置插入ele元素
     * boolean addAll(int index, Collection eles):从index位置开始将eles中 的所有元素添加进来
     * Object get(int index):获取指定index位置的元素
     * int indexOf(Object obj):返回obj在集合中首次出现的位置
     * int lastIndexOf(Object obj):返回obj在当前集合中末次出现的位置
     * Object remove(int index):移除指定index位置的元素，并返回此元素
     * Object set(int index, Object ele):设置指定index位置的元素为ele
     * List subList(int fromIndex, int toIndex):返回从fromIndex到toIndex 位置的子集合
     * */


    public static void main(String[] args) {

        //线性表list
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        System.out.println(list);

        //链表LinkedList
        List list1 = new LinkedList();
        list1.add(1);
        list1.add(3);
        list1.add(6);
        System.out.println(list1);

        /**
         * ListedList 常见方法
         *  void addFirst(Object obj)
         *  void addLast(Object obj)
         *  Object getFirst()
         *  Object getLast()
         *  Object removeFirst()
         *  Object removeLast()
         *
         */
        LinkedList linkedList = new LinkedList();
        linkedList.add("chenjia");
        linkedList.add("chenbin");
        linkedList.getFirst();
        System.out.println(linkedList.getLast());

        //双向链表


    }
}



