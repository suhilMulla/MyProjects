package sbi;
public class Customer {
	
	long Acc_no;
	String Name;
	String Address;
	long Phone_no;
	String dob;
	String Acc_type;
	float Balance;
	long Aadhar_card;
	String Pan_card;
	String Nominee;
	String Ifsc_code;
	String Acc_doj;
	String C_uname;
	String C_Pword;
	String Loan_id;
	
	public Customer(long Acc_no,String Name,String Address,long Phone_no,
			String dob,float Balance,long Aadhar_card,String Pan_card,
			String Nominee,String Acc_doj,String C_uname,String C_Pword,String Ifsc_code,String Acc_type,String Loan_id)
	{
		this.Acc_no=Acc_no;
		this.Name=Name;
		this.Address=Address;
		this.Phone_no=Phone_no;
		this.dob=dob;
		
		this.Balance=Balance;
		this.Aadhar_card=Aadhar_card;
		this.Pan_card=Pan_card;
		this.Nominee=Nominee;
		
		this.Acc_doj=Acc_doj;
		this.C_uname=C_uname;
		this.C_Pword=C_Pword;
		this.Ifsc_code=Ifsc_code;
		this.Acc_type=Acc_type;
		this.Loan_id=Loan_id;
		
	}
	
	
	
	public void display()
	{
		System.out.println("Acc_no:"+Acc_no);
		System.out.println("Name:"+Name);
		System.out.println("Address:"+Address);
		System.out.println("Acc_no:"+Acc_no);
	
	
}
	

}
