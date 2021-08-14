package fga.jp.section402;

import java.util.Scanner;

public class SsnCheck {

	public static void main(String[] args) {
	      Scanner in = new Scanner(System.in);
	      String ssn;


	      ssn = getSsn(in);
	      if(validSsn(ssn))
	         System.out.println(ssn + " is a valid Social Security Number!"); 
	      else
	         System.out.println("This ssn is not valid! must be in the format of (999-99-9999)");
	      //endif
	      in.close();
	}//end method main

    static String getSsn(Scanner in){
	   System.out.print("Please enter your Social Security Number: ");
	   return in.next();
    }//end method getSsn
    
	static  boolean validSsn(String ssn){
	   return ssn.matches("[0-9]{3}-[0-9]{2}-[0-9]{4}");
	}//end method rhymningAnimal

}//end class SsnCheck
