package sbi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Update_query {

	
		public static void main(String[] args) throws Exception {
			// TODO Auto-generated method stub


			String url="jdbc:mysql://localhost:3306/sbi?useSSL=false";
			String uname="root";
			String pass="1234";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,uname,pass);

			Scanner sc=new Scanner(System.in);
			System.out.println("Enter nominee");

			String n=sc.next();
			System.out.println("Enter customer to whom it is to be updated");

			long acc=sc.nextLong();
			String findMax="Update  customer set nominee='"+n+"' where acc_no='"+acc+"';";

			Statement st=con.createStatement();
			int rs=st.executeUpdate(findMax);

			System.out.println(rs);
			System.out.println("Updated row successfully");
			
			st.close();
			con.close();
			

	}

}
