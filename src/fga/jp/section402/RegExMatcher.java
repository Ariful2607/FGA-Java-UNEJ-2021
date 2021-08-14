package fga.jp.section402;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExMatcher {

	public static void main(String[] args) {
	      //create the pattern
	      Pattern p = Pattern.compile("(J|j)ava");
	      //create the initial String
	      String str = 
	         "Java courses are the best! You have got to love java.";
	      //print the contents of the string to screen
	      System.out.println(str);
	      //initialise the matcher
	      Matcher m = p.matcher(str);
	      //replace all pattern occurrences with the new substring 
	      str = m.replaceAll("Oracle");
	      //print the contents of the string to screen
	      System.out.println(str);
	   }//end method main
}//end class RegExMatcher
