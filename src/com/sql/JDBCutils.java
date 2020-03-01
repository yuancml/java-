package com.sql;

import org.apache.commons.dbutils.QueryRunner;

import java.io.FileReader;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCutils {
    private static String driver;
    private static String url;
    private static String user;
    private static String password;
    static{
        try{
            Properties props = new Properties();
            String path = System.getProperty("user.dir");
            System.out.println(path + "/src/com/sql/db.properties");
            Reader is = new FileReader(path + "/src/com/sql/db.properties");
            props.load(is);
            driver = props.getProperty("driver");
            url = props.getProperty("url");
            user = props.getProperty("user");
            password = props.getProperty("password");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    void Syst(){
        System.out.println(driver);
        System.out.println(url);
        System.out.println(user);
        System.out.println(password);
    }
    public static Connection getConnection(){
        try{
            //1.注册驱动
            Class.forName(driver);
            //2.链接
            Connection conn = DriverManager.getConnection(url,user,password);
            return conn;
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
    public void demoInsert(){
        try{
            //1.注册
            Connection conn = JDBCutils.getConnection();
            //2.sql
            String sql = "INSERT INTO `zb_db`.`user`(`username`, `password`, `mobile`, `email`, `sex`, `nickname`) " +
                    "VALUES (?, ?, ?, 'mmc@163.com', 'm', 'lisi1')";
            //3.获取sql执行对象preparStatement
            PreparedStatement ppstat = conn.prepareStatement(sql);
            //4.执行sql
            ppstat.setString(1,"name1");
            ppstat.setDouble(2,1234567890);
            ppstat.setString(3,"name3");
            int line = ppstat.executeUpdate();
            //5.处理结果
            System.out.println("执行结果是" + line);
            //
            ppstat.close();
            conn.close();
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
    public void demoInsert2(){
        try{
            QueryRunner qr = new QueryRunner();
            String sql = "INSERT INTO `zb_db`.`user`(`username`, `password`, `mobile`, `email`, `sex`, `nickname`) " +
                    "VALUES (?, ?, ?, 'mmc@163.com', 'm', 'lisi1')";
            Object[] params ={"name2",12345,"mobile1"};
            Connection conn = JDBCutils.getConnection();
            int line = qr.update(conn,sql,params);
            if(line == 1){
                System.out.println("line= " + line);
            }else {
                System.out.println("sql执行不成功");
            }
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
}
class TestJdbc{
    public static void main(String[] args){
        JDBCutils jdbc = new JDBCutils();
        jdbc.demoInsert2();
    }
}