import java.sql.*;
import java.util.*;
			 
public class JDBCTest02{
	public static void main(String[] args){
		Connection conn = null;
		Statement stmt = null;
		
		try{
			ResourceBundle bundle = ResourceBundle.getBundle("db");
			
			String driver = bundle.getString("driver");
			String url = bundle.getString("url");
			String user = bundle.getString("user");
			String password = bundle.getString("password");
			System.out.println(password);
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			String sql = "update dept set dname = 'AAAAA', loc = 'TianJin' where deptno = 50";
			int count = stmt.executeUpdate(sql);
			System.out.println(count == 1 ? "update success" : "update failed");
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
}