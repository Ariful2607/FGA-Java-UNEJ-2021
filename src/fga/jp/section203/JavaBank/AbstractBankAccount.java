package fga.jp.section203.JavaBank;

public abstract class AbstractBankAccount {

	//Instance Fields
	public final String BANK= "JavaBank";
	protected String accountName;
	protected int accountNum;
	protected int balance;
	
	//constructor for AbstractBankAccount
	AbstractBankAccount(String name, int num, int amt)
	{
		accountName=name;
	    accountNum=num;
	    balance=amt;
	}//end constructor method
	
	public abstract void deposit(int amt);
	
	public String getBankName() {
		return InterfaceBankAccount.BANK;
	}//end method getBankName
	
	//accessor to get the account name
	public String getAccountName ( ) 
	{
    	return accountName;
    }//end method getAccountName

	//modifier to set the account name
	public void setAccountName(String name)
	{
	    accountName = name;
	}//end method setAccountName
	
	//accessor to get the account number
	public int getAccountNum ( ) 
	{
    	return accountNum;
    }//end method getAccountNum
	
	//modifier to set the account number
	public void setAccountNum(int num)
	{
	    accountNum = num;
	}//end method setAccountNum
	
	//accessor to get the account balance
	public int getBalance () 
	{
		return balance;
	}//end method getBalance
	
	//modifier to set the balance
	public void setBalance(int num)
	{
	    balance = num;
	}//end method setBalance
	
	//make a withdrawal from the balance
	public void withdraw(int amt)
	{
	    balance=balance-amt;
	}//end method withdraw
	
	//toString method
	public String toString() 
	{
	   return "\n\nBank Name      : " + getBankName() + 
			  "\nAccount Holder : " + accountName + 
			  "\nAccount Number : " + accountNum +
			  "\nAccount balance: " + balance;
	}//end method toString
	
}//end class AbstractBankAccount

