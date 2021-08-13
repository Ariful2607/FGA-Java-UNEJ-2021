package rhyminggame;

import java.util.Scanner;

public class RhymeGame {

	   public static void main(String[] args) {
		      Scanner in = new Scanner(System.in); 
		      String animal;
		      animal = getAnimal(in);
		      if(rhymningAnimal(animal))
		         System.out.println("This animal rhymes with cat!"); 
		      else
		         System.out.println("This animal doesn't rhyme!");
		      //endif
		      in.close();
		   }//end method main

		   private static  boolean rhymningAnimal(String animal){
 		      return animal.matches("[a-zA-Z]{1,2}(at|AT)");
		   }//end method rhymningAnimal

		   private static String getAnimal(Scanner in){
		      System.out.print("Please enter the name of the animal: ");
		      return in.next();
		   }//end method getAnimal

}//end class RyhmeGame
