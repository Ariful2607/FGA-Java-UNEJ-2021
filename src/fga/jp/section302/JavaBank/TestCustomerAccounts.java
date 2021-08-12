package fga.jp.section302.JavaBank;


public class TestCustomerAccounts {

	public static void main(String[] args) {
   
   		AbstractBankAccount[] bankAccount = new AbstractBankAccount[5]; 

	 	// Instantiate 3 accounts using constructor with values
		bankAccount[0] = new Account("Sanjay Gupta",11556,300, AccountType.SAVINGS);
		bankAccount[1] = new Account("He Xai",22338,500, AccountType.SAVINGS);
		bankAccount[2] = new Account("Ilya Mustafana",44559,1000, AccountType.SAVINGS);

		// Instantiate 2 credit accounts using constructor with
		bankAccount[3] = new CreditAccount("Annie Other", 88776, 500);
		bankAccount[4] = new CreditAccount("",66778,1000,500);

		showAllCustomerAccounts(bankAccount);
		showAllAccounts(bankAccount);
		showAllCreditAccounts(bankAccount);
	}//end method main

	public static void showAllCreditAccounts(AbstractBankAccount[] bankAccount) {
		System.out.print("\nAll Credit Account types******");                                              
		for(AbstractBankAccount act:  bankAccount)
		   if (act instanceof CreditAccount)          
		      System.out.println(act); 
		   //endif
		//endfor                  
	}//end method getAllCreditAccounts
		
	public static void showAllAccounts(AbstractBankAccount[] bankAccount) {
		System.out.print("\nAll Account types******");                                            
		for(AbstractBankAccount act:  bankAccount)
		   if (act instanceof Account)          
		      System.out.println(act); 
		   //endif
		//endfor                  
	}//end method getAllAccounts
		
	public static void showAllCustomerAccounts(AbstractBankAccount[] bankAccount) {
	   System.out.print("\nAll Customer Accounts******");
	   for(AbstractBankAccount act:  bankAccount)
		  System.out.println(act); 
		//endfor	                
	}//end method showAllCustomerAccounts
}//end class TestCustomerAccounts
