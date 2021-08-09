package fga.jp.section204.JavaBank;


public class Account extends AbstractBankAccount{

	// Instance Fields
	private int bonusValue;
	
	//constructor for Account
	Account(String name, int num, int amt)
	{
		super(name, num, (amt + calculateInitialBonusValue(amt)));
	}//end constructor method
	
	private static int calculateInitialBonusValue(int amt) {
		if(amt >= 1 && amt <= 100)
			return 10;
		else if(amt <= 300)
			return 20;
		else
		   return 30;
		//endif
	}//end method calculateInitialBonusValue
	
	//make a deposit to the balance
	public void deposit(int amt)
	{
		if(amt>100)
		   balance=balance+(amt + (int)(bonusValue * 0.1));
		else
			balance=balance+amt;
		//endif
	}//end method deposit
	
	//print method 
	public void print() 
	{
	   System.out.println("\nBank Name      : " + getBankName() + 
			              "\nAccount Holder : " + accountName + 
			              "\nAccount Number : " + accountNum +
			              "\nAccount balance: " + balance);
	}//end method print

	
	
	
}//end class Account
