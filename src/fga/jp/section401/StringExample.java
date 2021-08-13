package fga.jp.section401;

public class StringExample {
	public static void main(String[] args) {
	String str = "Sample String";
	
	displayString(str);
	displayStringBackward(str);
	searchString(str, 'S');
	}//end method main

	static void searchString(String str, char c) {
		int count=0;

		for(int i=0; i<str.length(); i++){
		   if(str.charAt(i) == c)
		      count++;
		   //endif
		}//endfor
		System.out.println("The character " + c 
				           + " appears in the text " 
				           + count + " times."); 
	}//end method searchString
	
	static void displayStringBackward(String str)
	{   //create a local String variable
		String strBackwards = "";

		//read the array backwards and store the characters in strBackwards
		for(int i=str.length()-1; i>=0 ; i--){
		   strBackwards+=str.substring(i,i+1);
		}//endfor
		System.out.println(strBackwards);
	}//end method displayStringBackward
	
	static void displayString(String str)
	{
		//printing the String as it is
		System.out.println(str);
		//printing each character on a separate line 
		for(int index=0;index<str.length();index++){
		    System.out.println(str.charAt(index));}
		//endfor
	}//end method displayString
}//end class StringExample
