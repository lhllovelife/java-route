package course;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.ResourceBundle;
/*
    使用IDEA工具进行jdbc的连接，连接数据库的信息均写在配置文件中
 */
public class JDBCTest04 {

    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("jdbc");
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs  = null;
        String driver = bundle.getString("driver");
        String url = bundle.getString("url");
        String user = bundle.getString("dbname");
        String password = bundle.getString("dbpwd");
        try {
            //1. 注册驱动
            Class.forName(driver);
            //2. 获取连接
            conn = DriverManager.getConnection(url, user, password);
            //3. 获得数据库操作对象
            String sql = "select empno as '员工编号', ename as '员工姓名', sal as '薪资' from emp";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            //5. 处理查询结果集
            //rs.next() 向下移动一行，有数据返回true, 没数据返回 false
            while (rs.next())
            {
                String empno = rs.getString("员工编号");
                String ename  = rs.getString("员工姓名");
                String sal  = rs.getString("薪资");
                System.out.println(empno + "    " +  ename + "    " +  sal);
            }


        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //6.关闭资源
            if(rs != null)
            {
                try {
                    rs.close();
                }
                catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(ps != null)
            {
                try {
                    ps.close();
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
        }
    }
}
