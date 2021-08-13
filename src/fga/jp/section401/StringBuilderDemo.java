package stringbuilderdemo;

public class StringBuilderDemo {

	public static void main(String[] args) {
		//create a new StringBuilder object named str
	    StringBuilder str = new StringBuilder("Learning Java with Oracle");
  
	    //display the value of str to screen
	    System.out.println("string = " + str);
	      
	    //shared StringBuilder and String methods
	    System.out.println("The length of the text is: " + str.length());
	    System.out.println("The character at the beginning is: " 
	                         + str.charAt(0));
	    System.out.println("The second character is: " + str.charAt(1));
	    System.out.println("The position of the start of the text \"acl\" is: " 
	                         + str.indexOf("acl"));
	    System.out.println("The following text is included within the String: " 
	                         + str.substring(1,4));

	    // reverse characters of the StringBuilder and prints it
	    System.out.println("reverse = " + str.reverse());
	        
	    // reverse characters of the StringBuilder and prints it
	    System.out.println("reverse = " + str.reverse());

	    //add Characters to the end of the existing string
	    str.append(" is fun");
	    System.out.println("Appended string = " + str);

  	    //delete characters by specifying the start and end position 
	    str.delete(8, 13);
	    System.out.println("Deleted string = " + str);

	    //insert a new string into an existing string
	    str.insert(8, " Java Programming");
	    System.out.println("Inserted string = " + str);

  	    //Replace an existing section of a string with another string 
	    str.replace(13, 25, " String Processing");
	    System.out.println("Replaced string = " + str);

	    //display the position of a given String value
        System.out.println(str.indexOf("a"));
        System.out.println(str.indexOf("Q"));
	      
	    //display the position of a given String value
        //after a specified location
        System.out.println(str.indexOf("a", 7));
        
	}//end method main
}//end class StringBuilderDemo
