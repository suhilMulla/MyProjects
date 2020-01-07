package sbi;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {
	public static Connection getConnection() throws Exception{
		String url="jdbc:mysql://localhost:3306/sbi?useSSL=false";
	String uname="root";
	String pass="1234";
    Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection(url,uname,pass);
	return con;
	
		
		
	}

}
