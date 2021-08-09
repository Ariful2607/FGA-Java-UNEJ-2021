package fga.jp.section203.JavaBank;


public class TestBank {
	
	public static void main(String[] args) {
     
	// Instantiate 3 accounts
	// Using constructor with values
    Account a1 = new Account("Sanjay Gupta",11556,300);
	Account a2 = new Account("He Xai",22338,500);
	Account a3 = new Account("Ilya Mustafana",44559,1000);
	
	// Print accounts
	a1.print();
	a2.print();
	a3.print();
	
   }//end method main
}//end class testBank
