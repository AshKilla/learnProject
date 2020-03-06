package com.chenjia.demo;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * @author Ashkilla
 * @create 2020-03-01-20:51
 */
public class connectNetwork {
    public static void main(String[] args) throws IOException {
        //url connect 创建url对象请求url，有三种构造器
        URL url = new URL("https://www.baidu.com/");
//        URL url1 = new URL("http","www.baidu.com","index.html");
//        URL url1 = new URL("http","www.baidu.com",80,"index.html");

        System.out.println("getProtocol() :"+url.getProtocol());        //获取协议名
        System.out.println("getHost() :"+url.getHost());                //获取主机名
        System.out.println("getPort() :"+url.getPort());                //获取端口号
        System.out.println("getPath() :"+url.getPath());                //获取路径
        System.out.println("getFile() :"+url.getFile());
        System.out.println("getQuery() :"+url.getQuery());

        //URL的方法 openStream()：能从网络上读取数据

        //针对http协议的URLConnection类
        URL url2 = new URL("https://www.book900.com/4_4078.html");
        URLConnection urlConnection = url2.openConnection();
        int length = urlConnection.getContentLength();
        long longg = urlConnection.getDate();
        System.out.println(length+" "+longg);
        System.out.println("结束");

    }
}
