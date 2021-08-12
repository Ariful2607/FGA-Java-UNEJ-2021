package fga.jp.section303;

import java.util.LinkedList;

public class LettersQ {

	public static void main(String[] args) {
		//This will be implemented as a queue
		LinkedList<String> lettersQ = new LinkedList<String>(); 
        
        // Adding elements to the end of the queue 
        lettersQ.add("A"); 
        lettersQ.add("B"); 
        lettersQ.add("C"); 
        lettersQ.add("D"); 

        //display the contents of the linked list
        System.out.println("Linked list : " + lettersQ); 
        //display the size of the linked list
        System.out.println("Queue Size: " + lettersQ.size());
        
        //while the Queue is not empty remove each element
        while(!lettersQ.isEmpty()) {
        	System.out.println(lettersQ.removeFirst());
        }//endwhile
        //display the contents of the linked list
        System.out.println("Linked list : " + lettersQ); 

	   }//end method main
	}//end class LettersQ

