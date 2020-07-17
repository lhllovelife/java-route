package userlogin;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=======欢迎使用XXXX系统=========");
        System.out.print("注册账号指令：0 ");
        System.out.print("登录账号指令：1 ");
        System.out.println("退出系统指令：2");
        while(true)
        {
            System.out.print("请输入指令：");
            String tag = sc.next();
            if("0".equals(tag))
            {
                //注册账号
                System.out.println("请您按接下来的步骤注册账号");
                System.out.print("注册账号: ");
                long userid = sc.nextLong();
                System.out.print("密码: ");
                String password = sc.next();
                System.out.print("请输入您的真实姓名: ");
                String realname = sc.next();
                int t = register(userid, password, realname);
                if( t == 0){
                    System.out.println("注册成功");
                }
                else if (t == 1){
                    System.out.println("注册失败 该账户已经被注册，请您换个账号");
                }
                else {
                    System.out.println("注册失败");
                }
            }
            else if("1".equals(tag))
            {
                System.out.println("请依次输入您的账号，密码，进行登录");
                System.out.print("账号: ");
                long userid = sc.nextLong();
                System.out.print("密码: ");
                String password = sc.next();
                int ret = login(userid, password);
                if( ret == 0){
                    System.out.println("登录成功");
                }
                else if (ret == 1){
                    System.out.println("登录失败，账号不存在");
                }
                else {
                    System.out.println("登录失败，密码错误");
                }
            }
            else if("2".equals(tag)){
                System.out.println("退出系统成功，欢迎下次使用！");
                System.exit(0);
            }
            else {
                System.out.println("您的输入有误，系统自动退出");
                System.exit(0);
            }
        }

    }

    //注册账号
    public static int register(long userid, String password, String realname){
        //0 注册成功
        //1 注册失败 该账户已经被注册，请您换个账号
        //2 注册失败
        int flag = 2;
        ResourceBundle bundle = ResourceBundle.getBundle("jdbc");
        String driver = bundle.getString("driver");
        String url = bundle.getString("url");
        String dbname = bundle.getString("dbname");
        String dbpwd = bundle.getString("dbpwd");

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            //1. 注册驱动
            Class.forName(driver);
            //2. 连接数据库
            conn = DriverManager.getConnection(url, dbname, dbpwd);
            //3. 获取数据库操作对象
            stmt = conn.createStatement();
            //4. 执行sql语句
            //判断该账户是否被注册过
            String sql1 = "select userid from t_user";
            rs = stmt.executeQuery(sql1);
            while (rs.next())
            {
                long dataUserid = rs.getLong("userid");
                if (userid == dataUserid)
                {
                    flag = 1;
                    break;
                }
            }
            if(flag != 1)
            {
                //将用户信息录入数据库中
                StringBuilder sql2 = new StringBuilder();
            /*
                insert into t_user (userid, password, realname) values (
                userid + "," + password + "," + realname + ")"
             */
                sql2.append("insert into t_user (userid, password, realname) values (");
                sql2.append(String.valueOf(userid) + "," + "\"" + password + "\"," + "\""+ realname + "\"" + ")");
//                System.out.println(sql2);
                int count = stmt.executeUpdate(sql2.toString());
                if (count == 1 ) flag = 0;
            }

        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (rs != null)
            {
                try {
                    rs.close();
                }
                catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(stmt != null)
            {
                try {
                    stmt.close();
                }
                catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(conn != null)
            {
                try {
                    conn.close();
                }
                catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            return flag;
        }
    }
    //登录账号
    public static int login(long userid, String password){
        //0 登录成功 u == 1 && p == 1
        //1 账号不存在  u == 0
        //2 账号存在 密码错误 u == 1 && p == 0

        int u = 0;
        int p = 0;
        ResourceBundle bundle = ResourceBundle.getBundle("jdbc");
        String driver = bundle.getString("driver");
        String url = bundle.getString("url");
        String dbname = bundle.getString("dbname");
        String dbpwd = bundle.getString("dbpwd");

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, dbname, dbpwd);
            stmt = conn.createStatement();
            //执行sql语句
            /*
            select userid from t_user;
             */
            String sql = "select userid, password from t_user";
            rs = stmt.executeQuery(sql);
            while (rs.next())
            {
                long dbUserid = rs.getLong("userid");
                String dbPassword = rs.getString("password");
                if(userid == dbUserid)
                {
                    //证明存在账号
                    u = 1;
                    if (dbPassword.equals(password))
                    {
                        //证明密码相同
                        p = 1;
                        break;
                    }
                }
            }

        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if(rs != null)
            {
                try {
                    rs.close();
                }
                catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(stmt != null)
            {
                try {
                    stmt.close();
                }
                catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(conn != null)
            {
                try {
                    conn.close();
                }
                catch (SQLException e) {
                    e.printStackTrace();
                }
            }
//            System.out.println("u：" + u + "  p: " + p );
            //0 登录成功 u == 1 && p == 1
            //1 账号不存在  u == 0
            //2 账号存在 密码错误 u == 1 && p == 0
            if (u == 1 && p == 1) return 0;
            else if (u == 0 && p == 0) return 1;
            else if (u == 0 && p == 1) return 1;
            else return 2;
        }
    }
}
/*
driver=com.mysql.jdbc.Driver
url=jdbc:mysql://127.0.0.1:3306/bjpowernode
dbname=root
dbpwd=017213
 */
