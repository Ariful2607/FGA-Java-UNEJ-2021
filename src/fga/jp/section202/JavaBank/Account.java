package fga.jp.section202.JavaBank;


public class Account implements InterfaceBankAccount{

	// class variables
	protected String accountName;
	protected int accountNum;
	protected int balance;
	    
	//default constructor for Account
	Account()
	{
	  	this.accountName="EMPTY";
	   	this.accountNum=0;
	   	this.balance=0;
	}//end constructor method
	    
	//overloaded constructor for Account
	Account(String name, int num, int amt)
	{
		accountName=name;
	    accountNum=num;
	    balance=amt;
	}//end constructor method
	
	//make a deposit to the balance
	public void deposit(int amt)
	{
		balance=balance+amt;
	}//end method deposit
	
	//make a withdrawal from the balance
	public void withdraw(int amt)
	{
	    balance=balance-amt;
	}//end method withdraw
	
	//modifier to set the account name
	public void setAccountName(String name)
	{
	    accountName = name;
	}//end method setAccountName
	
	//modifier to set the account number
	public void setAccountNum(int num)
	{
	    accountNum = num;
	}//end method setAccountNum
	
	//modifier to set the balance
	public void setBalance(int num)
	{
	    balance = num;
	}//end method setBalance
	
	//accessor to get the account name
	public String getAccountName ( ) 
	{
    	return accountName;
    }//end method getAccountName
	    
	//accessor to get the account number
	public int getAccountNum ( ) 
	{
    	return accountNum;
    }//end method getAccountNum

	//accessor to get the account balance
	public int getBalance ( ) 
	{
		return balance;
	}//end method getBalance

	public String getBankName() {
		return InterfaceBankAccount.BANK;
	}//end method getBankName
	
	//print method 
	public void print() 
	{
	   System.out.println("\nBank Name      : " + getBankName() + 
			              "\nAccount Holder : " + accountName + 
			              "\nAccount Number : " + accountNum +
			              "\nAccount balance: " + balance);
	}//end method print

}//end class Account
