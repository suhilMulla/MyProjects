package sbi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Display_Customer {

	public void displayall() throws Exception {
		// TODO Auto-generated method stub
		//Customer customer=new Customer();
		List<Customer> list=new ArrayList<Customer>(); 
		Connection con=Connect.getConnection();
		//Scanner sc=new Scanner(System.in);
		
		String displayquery="Select * from customer";
		Statement st=con.createStatement();
	     ResultSet rs=st.executeQuery(displayquery);
	  while(rs.next())
	  {
		    long tempAccno=rs.getLong(1);
		    String tempName=rs.getString(2);
			String tempAddress=rs.getString(3);
			long tempPhone_no=rs.getLong(4);
			String tempdob=rs.getString(5);
			float tempBalance=rs.getFloat(6);
			long tempAadhar_card=rs.getLong(7);
			String tempPan_card=rs.getString(8);
			String tempNominee=rs.getString(9);
			String tempdoj=rs.getString(10);
			String tempC_uname=rs.getString(11);
			String tempC_Pword=rs.getString(12);
			String tempIfsc_code=rs.getString(13);
			String tempAcc_type=rs.getString(14);
			String tempLoan_id=rs.getString(15);
			
			list.add(new Customer(tempAccno,tempName,tempAddress,tempPhone_no,
					tempdob,tempBalance,tempAadhar_card,tempPan_card,tempNominee,
					tempdoj,tempC_uname,tempC_Pword,tempIfsc_code,tempAcc_type,
					tempLoan_id));
			
	  }
	  list.stream().forEach(Customer->System.out.println(Customer.Acc_no+"\t"+
		 Customer.Name+"\t"+Customer.Address+"\t"+Customer.Phone_no+"\t"+Customer.dob+"\t"+
		 Customer.Balance+"\t"+Customer.Aadhar_card+"\t"+Customer.Pan_card+"\t"+Customer.Nominee+"\t"+
		Customer.Acc_doj+"\t"+Customer.C_uname+"\t"+Customer.C_Pword+"\t"+ Customer.Ifsc_code+"\t"+
		Customer.Acc_type+"\t"+Customer.Loan_id));
	  
		
		st.close();
		con.close();

	}
	void displaySingle() throws Exception
	{
		List<Customer> list=new ArrayList<Customer>();
		Connection con=Connect.getConnection();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Account number");
		long Acc_no=sc.nextLong();
		
		String displaySquery="Select * from customer where Acc_no="+Acc_no+"";
		Statement st=con.createStatement();
	     ResultSet rs=st.executeQuery(displaySquery);
	     rs.next();
	     long tempAccno=rs.getLong(1);
		    String tempName=rs.getString(2);
			String tempAddress=rs.getString(3);
			long tempPhone_no=rs.getLong(4);
			String tempdob=rs.getString(5);
			float tempBalance=rs.getFloat(6);
			long tempAadhar_card=rs.getLong(7);
			String tempPan_card=rs.getString(8);
			String tempNominee=rs.getString(9);
			String tempdoj=rs.getString(10);
			String tempC_uname=rs.getString(11);
			String tempC_Pword=rs.getString(12);
			String tempIfsc_code=rs.getString(13);
			String tempAcc_type=rs.getString(14);
			String tempLoan_id=rs.getString(15);
	     
	     list.add(new Customer(tempAccno,tempName,tempAddress,tempPhone_no,
					tempdob,tempBalance,tempAadhar_card,tempPan_card,tempNominee,
					tempdoj,tempC_uname,tempC_Pword,tempIfsc_code,tempAcc_type,
					tempLoan_id));
	     list.stream().forEach(Customer->System.out.println(Customer.Acc_no+"\t"+
	    		 Customer.Name+"\t"+Customer.Address+"\t"+Customer.Phone_no+"\t"+Customer.dob+"\t"+
	    		 Customer.Balance+"\t"+Customer.Aadhar_card+"\t"+Customer.Pan_card+"\t"+Customer.Nominee+"\t"+
	    		Customer.Acc_doj+"\t"+Customer.C_uname+"\t"+Customer.C_Pword+"\t"+ Customer.Ifsc_code+"\t"+
	    		Customer.Acc_type+"\t"+Customer.Loan_id));
	 	st.close();
		con.close();

	     

	}

}
