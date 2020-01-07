package sbi;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Adminn {
	void adminn() throws Exception
	{
		Connection con=Connect.getConnection();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the User name");
		String username=sc.next();
		System.out.println("Enter the password");
		String password=sc.next();
		String displayquery="Select a_uname,a_passwd from admin";
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
		Display_admin a=new Display_admin();
		a.menu();
		
        }
	}

}
