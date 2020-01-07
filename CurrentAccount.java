package sbi;

public class CurrentAccount extends Account {
	boolean overdraftfacility;
	public void withdraw() {
		System.out.println("Money is debited from current account");
	}
	public void deposit() {
		System.out.println("Money is credited to current account");
	}
	public void withdraww() {
		System.out.println("Insufficient Balance");
	}
	public void balancecheck(float balance) throws  MinimumBalanceException
	{
		if (balance<10000)
		{
			throw new  MinimumBalanceException("Please Maintain Balance");
			
		}
		else {
			System.out.println("Balance is maintain");
		}
	}

}
