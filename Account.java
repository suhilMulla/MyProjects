package sbi;

public abstract class Account {
	long acc_no;
	String name;
	float balance;
	public abstract void deposit();
	public abstract void withdraw();
	public abstract void balancecheck(float f) throws MinimumBalanceException;
	

}
