package fga.jp.section402;

public class RegularExpressionExample {

   public static void main(String[] args) {
	   if(getAnimal("cat"))
		   System.out.println("This is a Valid Animal");
	   else
		   System.out.println("This is not a Valid Animal");
	   //endif
	}//end of method main

	public static boolean getAnimal(String animal){
		return animal.matches("[Cc]at|[Dd]og");
	}//end of method getAnimal
}//end of class

