package sbi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Delete_query {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/sbi?useSSL=false";
		String uname="root";
		String pass="1234";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		String findMax="Delete from customer where cust_name='ugtj'";
		Statement st=con.createStatement();
		int rs=st.executeUpdate(findMax);
		System.out.println(rs);
		System.out.println("Deleted row successfully");
		
		st.close();
		con.close();
		

	}

}
