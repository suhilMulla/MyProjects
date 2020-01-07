package sbi;

public class DepositAccount extends Account{
	float intrest;
	public void withdraw() {
		System.out.println("Money is debited from deposit account");
	}
	public void deposit() {
		System.out.println("Money is credited to deposit account");
	}
	public void calcInterest() {
		System.out.println("Interest is low");
	}
	public void balancecheck(float balance) throws  MinimumBalanceException
	{
		if (balance<500)
		{
			throw new  MinimumBalanceException("Please Maintain Balance");
			
		}
		else {
			System.out.println("Balance is maintain");
		}
	}

}
