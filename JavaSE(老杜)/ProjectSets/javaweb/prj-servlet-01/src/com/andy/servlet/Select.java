package com.andy.servlet;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.Enumeration;

public class Select implements Servlet {
    private ServletConfig config;
    public Select(){
        System.out.println("Select's constructor execute");
    }
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("Select's init method execute");
        this.config = config;
    }

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        System.out.println("Select's init method execute");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        //获取ServletConfig中的信息
        ServletConfig config = this.getServletConfig();
//        Enumeration<String> enumeration = config.getInitParameterNames();
//        while (enumeration.hasMoreElements()){
//            String initName = enumeration.nextElement();
//            String initValue = config.getInitParameter(initName);
//            out.print(initName + ": " + initValue +"<br>");
//        }
        String driver = config.getInitParameter("driver");
        String url = config.getInitParameter("url");
        String username = config.getInitParameter("username");
        String password = config.getInitParameter("password");

//        out.print(driver + ":" + "<br>");
//        out.print(url + ":" + "<br>");
//        out.print(username + ":" + "<br>");
//        out.print(password + ":" + "<br>");
        //打印到浏览器上的信息
        out.print("<!DOCTYPE html>");
        out.print("<html lang='en'>");
        out.print("<head>");
        out.print("<meta charset='UTF-8'>");
        out.print("<title>员工信息</title>");
        out.print("<style type='text/css'>");
        out.print("table{");
        out.print("margin: auto;");
        out.print("width: 600px;");
        out.print(")}");
        out.print("td{");
        out.print("text-align: center;");
        out.print(")}");
        out.print("</style>");
        out.print("</head>");
        out.print("<body>");
        out.print("<table border='1px'>");
        out.print("<h3 align='center'>员工信息</h3>");
        out.print("<tr>");
        out.print("<th>序号</th>");
        out.print("<th>员工编号</th>");
        out.print("<th>员工姓名</th>");
        out.print("<th>薪水</th>");
        out.print("</tr>");

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            //1.注册驱动
            Class.forName(driver);
            //2.获取数据库连接
            conn = DriverManager.getConnection(url,username,password);
            //3.获取预编译的数据库操作对象
            String sql = "select empno, ename, sal from emp";
            ps = conn.prepareStatement(sql);
            //4.执行sql语句
            rs = ps.executeQuery();
            //5.处理查询结果集
            int cnt = 0;
            while (rs.next()){
                String empno = rs.getString("empno");
                String ename = rs.getString("ename");
                String sal = rs.getString("sal");
                out.print("<tr>");
                out.print("<td>"+ (++cnt) + "</td>");
                out.print("<td>"+ empno + "</td>");
                out.print("<td>"+ ename +"</td>");
                out.print("<td>"+ sal + "</td>");
                out.print("</tr>");
            }
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //关闭资源
            if(rs != null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(ps != null){
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    @Override
    public void destroy() {

    }
    @Override
    public ServletConfig getServletConfig() {
        return this.config;
    }

    @Override
    public String getServletInfo() {
        return null;
    }

}
/*
<!DOCTYPE html>
<html lang='en'>
<head>
<meta charset='UTF-8'>
<title>员工信息</title>
<style type='text/css'>
table{
margin: auto;
width: 600px;
}
</style>
</head>
<body>
<table border='1px'>
<h3 align='center'>员工信息</h3>
<tr>
<th>序号</th>
<th>员工编号</th>
<th>员工姓名</th>
<th>薪水</th>
</tr>

</table>
</body>
</html>
 */