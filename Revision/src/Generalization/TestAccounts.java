package Generalization;

public class TestAccounts extends SavingAccount
{

	public static void main(String[] args) 
	{
		BankAccount obj = new SavingAccount();
		
		obj.openaccount();
		obj.deposit();
		obj.withdraw();
		obj.closeaccount();

	}

}
