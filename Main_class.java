package sbi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Main_class {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Connection con=Connect.getConnection();
		Scanner sc=new Scanner(System.in);
		int ch;
		
		System.out.println("1.Login as admin");
		System.out.println("2.Login as user");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:Adminn a=new Adminn();
		       a.adminn();
		       break;
		
		case 2:System.out.println("Enter the User name");
		String username=sc.next();
		System.out.println("Enter the password");
		String password=sc.next();
		String displayquery="Select c_uname,c_passwd from customer";
	    Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(displayquery);
        int flag=0;
        while(rs.next())
        {
        	if(username.equals(rs.getString(1)) && password.equals(rs.getString(2)))
        	{
        		//System.out.println("Successsul login");
        		flag=1;
        		
        	}
        	else
        	{
        		continue;
        	}
        }
        if(flag==0)
        {
        	System.out.println("Invalid credentials");
        }
        else
        {
        	System.out.println("Successsul login");
		BankInfo obj=new BankInfo("sbi","aaa","www","aaa",8888);
		obj.display();
		obj.menu();
		
        }
break;
		}
	}
}


