package com.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Connect {

    /*
    执行SELECT语句
     */
    public void demoSelect(String sql) throws Exception{
        //1.注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2.获取连接
        Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/zb_db?useSSL=false", "root", "a1234567890");
        //3.获取预处理对象
//        String sql1 = "SELECT * FROM user WHERE nickname = ?";
        PreparedStatement state = conn.prepareStatement(sql);
//        //4.设置占位符
//        state.setString(1,"lisi1");
////        state.setString(2,"lisi1");
        //5. 执行sql
        ResultSet rs = state.executeQuery();
        System.out.println("返回sql执行结果" + rs.toString());
        //6.处理结果
        while(rs.next()){
            String username = rs.getString("username");
            System.out.println("返回的结果username= " + username);
        }
        rs.close();
        state.close();
        conn.close();
    }
    /*
    增、删、改sql记录
     */
    public void demoInsert(String sql) throws Exception{
        //1.注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2.获取链接
        Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/zb_db?useSSL=false","root","a1234567890");
        //3.获取预处理对象
        PreparedStatement state = conn.prepareStatement(sql);
        //执行sql
        int line = state.executeUpdate();
        System.out.println("新增加的sql记录:" + line);
        state.close();
        conn.close();
    }
//    public void demoJdbc(){
//        try{
//            //获取queryRunner
//            QueryRunner qr = new QueryRunner();
//            String sql = "INSERT INTO `zb_db`.`user`(`username`, `password`, `mobile`, `email`, `sex`, `nickname`) " +
//                    "VALUES (?, ?, '13918891675', 'mmc@163.com', 'm', 'lisi1')";
//            Object[] params = {"lisi16","654321"};
//            Connection conn = JDBCUtils.getConnection();
//        }
//    }
//

}
//执行测试
class TestConn{
    public static void main(String[] args) throws Exception{
        Connect c = new Connect();
        //1.SELECT sql
        String sql1 = "SELECT * FROM user WHERE nickname = 'lisi1'";
        String sql2 = "INSERT INTO `zb_db`.`user`(`username`, `password`, `mobile`, `email`, `sex`, `nickname`) " +
                "VALUES ('lisi15', '123456', '13918891675', 'mmc@163.com', 'm', 'lisi1')";

        //执行
        c.demoSelect(sql1);
        c.demoInsert(sql2);
    }
}
