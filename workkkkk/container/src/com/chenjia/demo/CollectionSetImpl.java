package com.chenjia.demo;

import java.util.*;

/**
 * @author Ashkilla
 * @create 2020-03-02-16:02
 */
public class CollectionSetImpl {

    //使用hashset去除list中重复的元素
    public static List duplicateList(List list) {
        HashSet set = new HashSet();
        set.addAll(list);
        return new ArrayList(set);
    }

    public static void main(String[] args) {

        //hashset 实例 无序的
        HashSet<String> set = new HashSet<>();
        set.add("chenjia");
        set.add("chenbin");
        set.add("chenjiajiao");
        System.out.println(set);

        //LinkedHashset 是hashset的子类； 无序的
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.addAll(set);
        linkedHashSet.add("chenjiao");
        System.out.println(linkedHashSet);



        //TreeSet 的实现，有序的，查询速度比list块 Set唯一一个有序的set 继承自sortset
        TreeSet treeSet = new TreeSet();
        treeSet.addAll(linkedHashSet);      //字符串
        System.out.println(treeSet);
        TreeSet treeSet1 = new TreeSet();   //数值自动排序
        treeSet1.add(1);
        treeSet1.add(6);
        treeSet1.add(3);
        System.out.println(treeSet1);

        //去除重复
        List list3 = new ArrayList();
        list3.add(new Integer(1));
        list3.add(new Integer(2));
        list3.add(new Integer(2));
        list3.add(new Integer(4));
        list3.add(new Integer(4));
        List list2 = duplicateList(list3);
        for (Object integer : list2) {
            System.out.println(integer);
        }
    }
}
