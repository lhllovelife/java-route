import java.sql.*;
import java.util.*;
public class JDBCTest04{
	public static void main(String[] args){
		ResourceBundle bundle = ResourceBundle.getBundle("db");
								
		String driver = bundle.getString("driver");
		String url = bundle.getString("url");
		String user = bundle.getString("user");
		String password = bundle.getString("password");
		
		// String driver = "com.mysql.jdbc.Driver";
		// String url = "jdbc:mysql://127.0.0.1:3306/bjpowernode";
		// String user = "root";
		// String password = "017213";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try{
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			String sql = "select e.deptno, e.ename, e.sal, t.avgsal from (select deptno, avg(sal) as avgsal from emp group by deptno) t join emp e on e.deptno = t.deptno and e.sal > t.avgsal order by e.deptno, e.sal";
			rs = stmt.executeQuery(sql);
			while(rs.next())
			{
				String deptno = rs.getString("e.deptno");
				String ename = rs.getString("e.ename");
				String sal = rs.getString("e.sal");
				String avgsal = rs.getString("t.avgsal");
				System.out.println(deptno + " " + ename + " " + sal  + " " + avgsal);
			}
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			if(rs != null)
			{
				try{
					rs.close();
				}
				catch(Exception e){
					e.printStackTrace();
				}
			}
			if(stmt != null)
			{
				try{
					stmt.close();
				}
				catch(Exception e){
					e.printStackTrace();
				}
			}
			if(conn != null)
			{
				try{
					conn.close();
				}
				catch(Exception e){
					e.printStackTrace();
				}
			}
		}
	}
}