package fga.jp.section202.JavaBank;


public class CreditAccount extends Account{

	private int creditLimit;
	
	//default constructor for CreditAccount
	CreditAccount()
    {
    	super();
    	this.creditLimit=100;
    }//end constructor method
	
	//overloaded constructor for CreditAccount
	CreditAccount(String name, int num,int amt,int credit)
    {
        super(name,num,amt);
        this.creditLimit=credit;
    }//end constructor method

	//modifier to set the account creditlimit
	public void setCreditLimit(int num)
    {
  	    creditLimit = num;
    }//end method setCreditLimit
	 
	//accessor to get the account creditlimit
	 public int getCreditLimit ( ) 
	 {
    	return creditLimit;
     }//end method getCreditLimit
	 
	 //print method 
	 public void print() 
	 {
	    System.out.println(accountName + " " + accountNum + " " + balance + " " + creditLimit);
	 }//end method
}//end class CreditAccount
