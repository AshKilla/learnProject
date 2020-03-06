package com.chenjia.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Ashkilla
 * @create 2020-03-05-11:37
 */
public class Stringdemo {
    public static void main(String[] args) {
        //了解String 不同的声明方式，jvm处理机制的不同
        String s1 = "chenjia";  //常量池
        String s2 = new String("chenjia");  //通过堆来链接常量池的chenjia
        String s3 = s1 + "666";         //包含引用变量，堆变量 独立

        //了解 == 和 equals();


        //String 常用函数

        int length = s1.length();       // 字符串长度
        char c = s1.charAt(2);          //返回索引处的字符
        boolean isEmpty = s1.isEmpty(); // 是否为空
        String s4 = s1.toLowerCase();   //所有字符转为小写
        String s5 = s1.toUpperCase();   //所有字符转为大写
        String s6 = s1.trim();          //返回字符串的副本
        boolean isSame = s1.equals(s4);  //内容是否相同
        boolean isSameIgnoreCase = s1.equalsIgnoreCase(s5); //忽略大小写的
        String s7 =s1.concat(" is a boy");   //加载在字符串末尾
        String s8 = s7.replace(" ","&20");      //给定替代字符
        String[] stringsArray = s7.split(" ");
        int i = s1.compareTo(s5);       //比较字符串的大小
        String substring = s4.substring(3);         //生成一个子字符串
//        boolean endsWith(String suffix); //：测试此字符串是否以指定的后缀结束
//        boolean startsWith(String prefix);  //测试此字符串是否以指定的前缀开始
//        boolean startsWith(String prefix, int toffset); //测试此字符串从指定索引开始的
//        boolean contains(CharSequence s)：当且仅当此字符串包含指定的 char 值序列 时，返回 true
//        int indexOf(String str)：返回指定子字符串在此字符串中第一次出现处的索引

        System.out.println("length:"+length);
        System.out.println("index:"+c);
        System.out.println(s4+s5+s6+s7);
        System.out.println(s4.hashCode());
        System.out.println(s8);
        List<String> list = new ArrayList<String>();
        for (String s:stringsArray){
            System.out.println(s);
            list.add(s);
        }
        System.out.println(list);



        //字符串包装类
        String parseInt = "123";
        int you = Integer.parseInt(parseInt);
        System.out.println(you);

        String parseString = String.valueOf(you);
        System.out.println(parseString);

        //获取“ ab”在 “abkkcadkabkebfkabkskab” 中出现的次数
        String demo1 = "ab";
        String demo2 = "abkkcadkabkebfkabkskab";
        int cs = count2(demo2,demo1);

        System.out.println(cs);
        String s11 = reverse(demo2,1,3);
        System.out.println(s11);
    }

    //计算字符串 在另外一个字符串里出现的次数
    public static int count(String srcText, String findText) {
        String[] array = srcText.split(findText);

        //bug ：如果匹配的字符串在最后一个就少了一个
        return array.length - 1;
    }

    public static int count2(String target,String split){
        int count = 0;
        int i;
        while ((i = target.indexOf(split)) != -1){
            count++;
            target = target.substring(i + split.length());
        }
        return count;
    }

    //将一个字符串进行反转
    public static String reverse(String str,int startIndex,int endIndex){
        if(str !=null && str.length() !=0){
            char[] arr = str.toCharArray();
            for(int x = startIndex,y = endIndex;x<y;x++,y--){
                char temp = arr[x];
                arr[x] = arr[y];
                arr[y] = temp;
            }
            return new String(arr);
        }
        return null;
    }

    //获取两个字符串中，最大相同字串

    public static String getMaxSameString(String str1 ,String str2){
        if(str1 !=null && str2 !=null){
            //看哪个更大
            String maxStr = (str1.length()>=str2.length())?str1:str2;
            String minStr = (str1.length()< str2.length())?str1:str2;

            int length = minStr.length();
            for(int i = 0;i<length;i++){

                for(int x = 0,y=length-i;y<=length;x++,y++){
                    String subStr = minStr.substring(x,y);
                    if(maxStr.contains(subStr)){
                        return subStr;
                    }
                }
            }

        }
        return null;
    }

}
