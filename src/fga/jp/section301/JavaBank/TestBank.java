
public class TestBank {
	
	public static void main(String[] args) {
     
	// Instantiate 3 accounts
	// Using constructor with values
    Account a1 = new Account("Sanjay Gupta",11556,300, AccountType.SAVINGS);
	Account a2 = new Account("He Xai",22338,500, AccountType.SAVINGS);
	Account a3 = new Account("Ilya Mustafana",44559,1000, AccountType.SAVINGS);
	
	// Print accounts to the console
	System.out.println(a1);
	System.out.println(a2);
	System.out.println(a3);
	
   }//end method main
}//end class testBank
