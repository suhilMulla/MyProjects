package sbi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Insertt_Query {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/sbi?useSSL=false";
		String uname="root";
		String pass="1234";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		String findMax="select max(acc_no) from customer";
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(findMax);
		rs.next();
		long temp=rs.getLong(1);
		long tempAccNo=++temp;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number of customers you want to insert");
		int n=scn.nextInt();
		for(int i=0;i<n;i++)
		{
	    tempAccNo=++temp;
		System.out.println("Enter name");
		String tempName=scn.next();
		System.out.println("Enter address");
		String tempAddress=scn.next();
		System.out.println("Enter Contact");
		long tempContact=scn.nextLong();
		String c=String.valueOf(tempContact);
		if(c.length()!=10)
		{
			System.out.println("Enter 10 digit phone number");
			break;
			
		}
		
		
		
		System.out.println("Enter DOB");
		String tempDOB=scn.next();
		System.out.println("Enter Balance");
		float tempBalance=scn.nextFloat();
		System.out.println("Enter adhar");
		long tempAdhar=scn.nextLong();
		System.out.println("Enter Pan card");
		String tempPan=scn.next();
		
		System.out.println("Enter nominee");
		String tempNominee=scn.next();
		System.out.println("Enter DOJ");
		String tempdoj=scn.next();
		System.out.println("Enter uname");
		String tempUname=scn.next();
		System.out.println("Enter password");
		String tempPassword=scn.next();
		
		String inseryQuery="insert into customer values("+tempAccNo+",'"+tempName+"','"+tempAddress+"',"+tempContact+",'"+tempDOB+"',"+tempBalance+","+tempAdhar+",'"+tempPan+"','"+tempNominee+"','"+tempdoj+"','"+ tempUname+"','"+tempPassword+"','sbi001','c001','l003')";
		Statement st1=con.createStatement();
		st1.executeUpdate(inseryQuery);
		}
		System.out.println("Record inserted successfully");
		
		//st1.close();
		st.close();
		con.close();
		
		
		
	

}
}


