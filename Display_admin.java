package sbi;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Display_admin {
	void menu() throws Exception
	{
		System.out.println("*******************Welcome To Sapphire Bank Of India*******************");
		System.out.println("\t\t\tGovt of India Undertaking\t\t\t\t\t\t");
		System.out.println("\t\t\t\twww.sbi.com\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
		System.out.println("-----------------------------------------------------------------------");
		while(true)
		{
			
		
		System.out.println("Welcome to SBI Bank");
		System.out.println("Select Options");
		System.out.println("1. Display customers");
		System.out.println("2. Display customer transactions");
		System.out.println("3.Exit");
		 int choice;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter your choice");
		 choice=sc.nextInt();
		 switch(choice)
		 {
		 case 1:Display_Customer w=new Display_Customer();
		        w.displayall();
		        break;
		 case 2:	Connection con=Connect.getConnection();
			List<Customer> list=new ArrayList<Customer>(); 
			//Scanner sc=new Scanner(System.in);
			/*System.out.println("Enter your Account number");
			long Acc_no=sc.nextLong();*/
			
			String displayquery="Select * from transaction";
		    Statement st=con.createStatement();
		    ResultSet rs=st.executeQuery(displayquery);
		    while(rs.next())
		    {
		    	String t_Date=rs.getString(1);
			    float t_Withdraw=rs.getFloat(2);
				float t_Deposit=rs.getFloat(3);
				long t_Acc_no=rs.getLong(4);
				float t_Balance=rs.getFloat(5);	
				System.out.println(t_Date+"\t" +t_Withdraw+"\t" +t_Deposit+"\t"+t_Acc_no+"\t"+t_Balance );
		    }
		  st.close();
		  con.close();
		  break;
		 case 3:return;
		 }
	}
}
}
