package com.chenjia;

import javax.sound.midi.SoundbankResource;
import java.sql.*;

/**
 * @author Ashkilla
 * @create 2020-03-01-16:58
 */
public class demo {

    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/studysql?useSSL=false&serverTimezone=UTC";
    static final String USER = "root";
    static final String PASS = "root";

    public static void main(String[] args) {
        Connection con  = null;
        Statement statement = null;

        try{
            Class.forName(JDBC_DRIVER);     //加载驱动
            System.out.println("链接数据库..");
            con = DriverManager.getConnection(DB_URL,USER,PASS);    //链接数据库

            System.out.println("实例化statement对象..");
            statement =  con.createStatement();
            String sql = "select * from websites";
            ResultSet re = statement.executeQuery(sql);

            while (re.next()){
                System.out.println(re.getInt("id"));
                System.out.println(re.getString("name"));
                System.out.println(re.getString("url"));
                System.out.println(re.getString("conuntry"));
            }
            re.close();
            statement.close();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            // 关闭资源
            try{
                if(statement!=null)
                    statement.close();
            }catch(SQLException se2){
            }// 什么都不做
            try{
                if(con!=null)
                    con.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
    }


}
