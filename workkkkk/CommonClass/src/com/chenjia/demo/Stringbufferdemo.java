package com.chenjia.demo;

/**
 * @author Ashkilla
 * @create 2020-03-05-14:20
 * StringBuffer append(xxx)：提供了很多的append()方法，用于进行字符串拼接
 * StringBuffer delete(int start,int end)：删除指定位置的内容
 * StringBuffer replace(int start, int end, String str)：把[start,end)位置替换为str
 * StringBuffer insert(int offset, xxx)：在指定位置插入xxx StringBuffer reverse() ：把当前字符序列逆转
 * public int indexOf(String str)
 * public String substring(int start,int end)
 * public int length()
 * public char charAt(int n )
 * public void setCharAt(int n ,char ch)
 */
public class Stringbufferdemo {
    public static void main(String[] args) {

        //可变 线程安全 效率低
        StringBuffer stringBuffer =new StringBuffer("chenjia");
        stringBuffer.append(" is a good boy");
        System.out.println(stringBuffer);
        stringBuffer.delete(9,14);
        System.out.println(stringBuffer);
        stringBuffer.replace(9,14,"s handsome b");
        System.out.println(stringBuffer);
        System.out.println("字符串长度为："+stringBuffer.length());

        String str = null;
        StringBuffer sb = new StringBuffer();
        sb.append(str);
        System.out.println("sb的长度" + sb.length());
        System.out.println("sb:"+sb);

        StringBuffer sb2 = new StringBuffer(str);
        System.out.println("SB2" + sb2);

    }
}
