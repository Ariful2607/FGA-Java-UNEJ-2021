package fga.jp.section303;

import java.util.LinkedList;

public class LettersS {

	public static void main(String[] args) {
		//This will be implemented as a stack
        LinkedList<String> letterStack = new LinkedList<String>(); 
        
        // Adding elements to the top of the stack 
        letterStack.push("A"); 
        letterStack.push("B"); 
        letterStack.push("C"); 
        letterStack.push("D"); 

        //display the contents of the linked list
        System.out.println("Linked list : " + letterStack); 
        //display the size of the linked list
        System.out.println("Stack Size: " + letterStack.size());
        
        //while the stack is not empty remove each element
        while(!letterStack.isEmpty()) {
        	System.out.println(letterStack.pop());
        }//endwhile
        //display the contents of the linked list
        System.out.println("Linked list : " + letterStack); 
	}//end method main
}//end class Letters
