package com.chenjia.demo;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ashkilla
 * @create 2020-03-02-16:24
 */
public class MapImpl {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String, String>();
        map.put("1","chenjia");
        map.put("2","chenbin");
        map.put("3","fangzheng");
        System.out.println(map);
        System.out.println("map的大小"+map.size());
        System.out.println(map.get("2"));
        System.out.println("map的keyset："+map.keySet());
        System.out.println("map的value："+map.values());
    }
}
