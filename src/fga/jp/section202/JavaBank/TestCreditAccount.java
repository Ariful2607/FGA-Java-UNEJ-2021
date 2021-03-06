package fga.jp.section202.JavaBank;


public class TestCreditAccount {
	

	public static void main(String[] args) {
	     
		// Instantiate 3 accounts
	    // Using constructor with values
	    Account a1 = new Account("Sanjay Gupta",11556,300);
	    	// Using default constructor
		Account a2 = new Account();
		Account a3 = new Account();
		
		// Instantiate 2 credit accounts
		// Using default constructor
		Account c1 = new CreditAccount();
		// Using constructor with values which will call constructor from super
		Account c2 = new CreditAccount("Another",66778,1000,500);
		
		//Set values of Instances created using default constructor
		a2.setAccountName("He Xai");
		a2.setAccountNum(22338);
		a2.setBalance(500);
		
		a3.setAccountName("Ilya Mustafana");
		a3.setAccountNum(44559);
		a3.setBalance(1000);
		
		c1.setAccountName("A.N Other");
		c1.setAccountNum(88776);
		c1.setBalance(500);
		
		// Print accounts
		a1.print();
		a2.print();
		a3.print();
		c1.print();
		c2.print();
    }//end method main
}//end class testCreditAccount

