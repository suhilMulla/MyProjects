package sbi;

import java.util.Scanner;

public class BankInfo {
	static String bankname;
	String swift_Id;
	String url;
	String headoffice;
	long tollfreenumber;
	public BankInfo(String bankname,String swift_Id,String url,String headoffice,long tollfreenumber)
	{
		this.bankname=bankname;
		this.swift_Id=swift_Id;
		this.url=url;
		this.headoffice=headoffice;
		this.tollfreenumber=tollfreenumber;
	}
 public void showBankInfo()
{
		System.out.println(bankname);
		System.out.println(swift_Id);
		System.out.println(url);
		System.out.println(headoffice);
		System.out.println(tollfreenumber);
		
}
 public void display()
 {
	 System.out.println("*******************Welcome To Sapphire Bank Of India*******************");
		System.out.println("\t\t\tGovt of India Undertaking\t\t\t\t\t\t");
		System.out.println("\t\t\t\twww.sbi.com\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
		System.out.println("-----------------------------------------------------------------------");
}
 
 public void menu() {
	 Display_Customer d=new Display_Customer();
	 Withdraw_Deposit withdraw =new  Withdraw_Deposit();
	 while(true)
	 {
	 
		System.out.println("Welcome to SBI Bank");
		System.out.println("Select Options");
		System.out.println("1.  Profile");
		System.out.println("2.  Balance Enquiry");
		System.out.println("3.  Withdrawal");
		System.out.println("4.  Deposit");
		System.out.println("5.  Apply for Loan");
		System.out.println("6.  Transfer");
		System.out.println("7.  MiniStatement");
		System.out.println("8.  Help");
		System.out.println("9.  Display all customers");
		System.out.println("10.  Search");
		System.out.println("11. Exit");
		System.out.println("********************\"Our Service Your Success\"***********************");
	 int choice;
	 System.out.println("Enter your choice");
	 Scanner sc=new Scanner(System.in);
	 choice=sc.nextInt();
	 switch(choice)
	 { 
	 case 1:System.out.println("Profile");
	        break;
	 case 2:try{withdraw.balancecheck();}
     catch(Exception e) {System.out.println(e);};
		 //System.out.println("Balance Enquiry");
     break;
	 case 3:try{withdraw.withdraw();}
	       catch(Exception e) {System.out.println(e);};
		// System.out.println("Withdrawal");
     break;
	 case 4:try{withdraw.deposit();}
     catch(Exception e) {System.out.println(e);};
     break;
	 case 5:System.out.println("Apply for loan");
     break;
	 case 6:try{withdraw.transfer();}
     catch(Exception e) {System.out.println(e);};
		 //System.out.println("Transfer");
     break;
	 case 7://System.out.println("MiniStatement");
		 try{withdraw.mini_statement();}
	     catch(Exception e) {System.out.println(e);};
		 
     break;
	 case 8:System.out.println("Help");
     break;
	 case 9:try{d.displayall();}
     catch(Exception e) {System.out.println(e);};
	         break;
	 case 10:try{d.displaySingle();}
     catch(Exception e) {System.out.println(e);};
	         break;
	 case 11:return;
	        
	 }
	 }
	 
	 
	
 }

}
