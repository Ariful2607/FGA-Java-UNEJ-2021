package fga.jp.section303;

import java.util.Collections;
import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<String,String> fruitBowl = new HashMap<String, String>();

		addElements(fruitBowl);
		displayElements(fruitBowl);
		findElement(fruitBowl, "Banana");
	}//end method main
	
	static void findElement(HashMap<String, String> fruitBowl, String fruit) {
		if(fruitBowl.containsKey(fruit))
		   System.out.println("The " + fruit + " is " + fruitBowl.get(fruit));
		else
			System.out.println("There is no " + fruit + " in the bowl");
		//endif
	}//end method findElement
	
	static void displayElements(HashMap<String, String> fruitBowl) {
		//System.out.println(fruitBowl);
		for (HashMap.Entry<String, String> fruit : fruitBowl.entrySet()) {
		    System.out.println("Fruit: " + fruit.getKey()
		                       +" - Color: "+fruit.getValue());
		}//endfor
	}//end method displayElements
	
	static void addElements(HashMap<String, String> fruitBowl) {
		fruitBowl.put("Apple", "Green");
		fruitBowl.put("Cherry", "Red");
		fruitBowl.put("Orange", "Orange");
		fruitBowl.put("Banana", "Yellow");
		fruitBowl.put("Apple", "Red");
	}//end method addElements
}//end class HashMapExample
