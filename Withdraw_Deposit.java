package sbi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.*;

public class Withdraw_Deposit {
	


		
		void withdraw()throws BalanceException, Exception
		{
			Connection con=Connect.getConnection();
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Account number");
			long Acc_no=sc.nextLong();
			System.out.println("Enter the amount you want to withdraw");
			float b=sc.nextFloat();
			String displayquery="Select balance from customer where Acc_no='"+Acc_no+"';";
		    Statement st=con.createStatement();
	        ResultSet rs=st.executeQuery(displayquery);
	        rs.next();
	        float balance1=rs.getFloat(1);
	        if(b>balance1)
	        {
	        	throw new BalanceException("Insufficient Balance");
	        }
	        else
	        {
	        	balance1=balance1-b;
	        }
	        System.out.println(balance1);
	        System.out.println(b+"Amount has been withdrawn from your Account");
	        System.out.println("Reamining Balance is"+balance1);
	        String updatequery="Update customer set balance="+balance1+" where Acc_no='"+Acc_no+"';";
		    Statement st1=con.createStatement();
	        int rs1=st1.executeUpdate(updatequery);
	        Date x=new Date();
	        SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");
	        String myDate=format.format(x);
	        System.out.println(myDate);
	        String insertquery="insert into transaction values('"+myDate+"',"+b+",Null,"+Acc_no+","+balance1+");";
		    Statement st2=con.createStatement();
		   
		    
	       st2.executeUpdate(insertquery);
	       st.close();
	       st1.close();
			con.close();
	        /*
	        System.out.println(x.getTime());
	        String myDate="2019/12/12";
	        x=toDate(myDate);*/
	        //x.getDate();
	     
	}
		void deposit()throws Exception
		{
			Connection con=Connect.getConnection();
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Account number");
			long Acc_no=sc.nextLong();
			System.out.println("Enter the amount you want to deposit");
			float b=sc.nextFloat();
			String displayquery="Select balance from customer where Acc_no='"+Acc_no+"';";
		    Statement st=con.createStatement();
	        ResultSet rs=st.executeQuery(displayquery);
	        rs.next();
	        float balance1=rs.getFloat(1);
	      
	        	balance1=balance1+b;
	        
	        System.out.println(balance1);
	        System.out.println(b+"Amount is deposited to your Account");
	        System.out.println("Total Balance is"+balance1);
	        String updatequery="Update customer set balance="+balance1+" where Acc_no='"+Acc_no+"';";
		    Statement st1=con.createStatement();
	        int rs1=st1.executeUpdate(updatequery);
	        Date x=new Date();
	        SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");
	        String myDate=format.format(x);
	        System.out.println(myDate);
	        String insertquery="insert into transaction values('"+myDate+"',Null,"+b+","+Acc_no+","+balance1+");";
		    Statement st2=con.createStatement();
		   
		    
	       st2.executeUpdate(insertquery);
	        /*
	        System.out.println(x.getTime());
	        String myDate="2019/12/12";
	        x=toDate(myDate);*/
	        //x.getDate();
	       st.close();
			con.close();    
	}
		void balancecheck() throws Exception{
			Connection con=Connect.getConnection();
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Account number");
			long Acc_no=sc.nextLong();
			
			String displayquery="Select balance from customer where Acc_no='"+Acc_no+"';";
		    Statement st=con.createStatement();
	        ResultSet rs=st.executeQuery(displayquery);
	        rs.next();
	        float balance1=rs.getFloat(1);
	        System.out.println("Your balance is"+balance1);
	        
			
		}
		
		void transfer() throws Exception
		{
			Connection con=Connect.getConnection();
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your Account number");
			long Acc_no=sc.nextLong();
			System.out.println("Enter Reciever Account number ");
			long Acc_no1=sc.nextLong();
			System.out.println("Enter the amount you want to transfer");
			float b=sc.nextFloat();
			String displayquery="Select balance from customer where Acc_no='"+Acc_no+"';";
		    Statement st=con.createStatement();
	        ResultSet rs=st.executeQuery(displayquery);
	        rs.next();
	        float balance1=rs.getFloat(1);
	        if(b>balance1)
	        {
	        	throw new BalanceException("Insufficient Balance");
	        }
	        else
	        {
	        	balance1=balance1-b;
	        }
	        System.out.println(balance1);
	        System.out.println(b+"Amount has been transfered from your Account");
	        System.out.println("Reamining Balance is"+balance1);
	        String updatequery="Update customer set balance="+balance1+" where Acc_no='"+Acc_no+"';";
		    Statement st1=con.createStatement();
	        int rs1=st1.executeUpdate(updatequery);
	        Date x=new Date();
	        SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");
	        String myDate=format.format(x);
	        System.out.println(myDate);
	        String insertquery="insert into transaction values('"+myDate+"',"+b+",Null,"+Acc_no+","+balance1+");";
		    Statement st2=con.createStatement();
		   
		    
	       st2.executeUpdate(insertquery);
	       String depositquery="Select balance from customer where Acc_no='"+Acc_no1+"';";
		    Statement st3=con.createStatement();
	        ResultSet rs2=st.executeQuery(depositquery);
	        rs2.next();
	        float balance2=rs2.getFloat(1);
	       
	        	balance2=balance2+b;
	        
	        System.out.println(balance2);
	     //   System.out.println(b+"Amount has been transfered from your Account");
	    //    System.out.println("Reamining Balance is"+balance1);
	        String updatequery1="Update customer set balance="+balance2+" where Acc_no='"+Acc_no1+"';";
		    Statement st4=con.createStatement();
	        int rs3=st4.executeUpdate(updatequery1);
	       /* Date x1=new Date();
	        SimpleDateFormat format1=new SimpleDateFormat("dd/MM/yyyy");
	        String myDate1=format1.format(x);
	        System.out.println(myDate1);*/
	        String insertquery1="insert into transaction values('"+myDate+"',Null,"+b+","+Acc_no+","+balance2+");";
		    Statement st5=con.createStatement();
		   
		    
	       st5.executeUpdate(insertquery1);
	       st.close();
	       st1.close();
	       st2.close();
	       st3.close();
	       st4.close();
	       st5.close();
	       
			con.close();

			
		}
void mini_statement() throws Exception
{
	Connection con=Connect.getConnection();
	List<Customer> list=new ArrayList<Customer>(); 
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your Account number");
	long Acc_no=sc.nextLong();
	
	String displayquery="Select * from transaction where Acc_no='"+Acc_no+"';";
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
}

}
