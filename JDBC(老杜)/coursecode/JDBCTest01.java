import java.sql.*;

public class JDBCTest01{
	public static void main(String[] args){
		
		Connection conn = null;
		Statement stmt = null;
		try{
			//1. 注册驱动
			Class.forName("com.mysql.jdbc.Driver");
			//2. 获取连接
			String url = "jdbc:mysql://127.0.0.1:3306/bjpowernode";
			String user = "root";
			String password = "017213";
			conn = DriverManager.getConnection(url, user, password);			
			//3. 获取数据操作对象
			stmt = conn.createStatement();
			String sql = "insert into dept (deptno, dname, loc) values (60, 'CEO', 'ShangHai')";
			int count = stmt.executeUpdate(sql);
			System.out.println(count == 1 ? "success" : "failed");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
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
	/*
	D:\JDBC\mysql-connector-java-5.1.49\mysql-connector-java-5.1.49-bin.jar
	D:\JDBC\mysql-connector-java-5.1.49\mysql-connector-java-5.1.49-bin.jar
	*/
}