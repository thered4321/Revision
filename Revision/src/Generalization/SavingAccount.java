package Generalization;

public class SavingAccount implements BankAccount
{
	double totalbalance =0;
	double initialbalance = 500;
	double amount;

	@Override
	public void openaccount() 
	{
		System.out.println("The Total balance is:" +initialbalance );
	}

	@Override
	public void deposit() 
	{
		totalbalance = totalbalance + amount;
		System.out.println("The Total balance is:" +totalbalance);
		
	}

	@Override
	public void withdraw() 
	{
		totalbalance = totalbalance - amount;
		System.out.println("The Total remaining balance after withdraw is:" +totalbalance);
		
	}

	@Override
	public void closeaccount() 
	{
		System.out.println("Close Account");
	}

}
