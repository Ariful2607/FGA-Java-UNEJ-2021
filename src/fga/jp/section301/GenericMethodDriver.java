package fga.jp.section301;

import java.util.ArrayList;
import java.util.Arrays;

public class GenericMethodDriver {

	public static void main(String[] args) {
		GenericMethodClass gmc = new GenericMethodClass();
		
		Integer[] integerArray = {1, 2, 3};
		String[] stringArray = {"This","is","fun"};

		gmc.printArray(integerArray); 
		gmc.printArray(stringArray);
		
		ArrayList<Double> array1 = new ArrayList<Double>();
		array1.add(25.5);
		array1.add(34.9);
		array1.add(45.7);
		gmc.printList(array1);
		
		ArrayList<Integer> array2 = new ArrayList<Integer>();
		array2.add(10);
		array2.add(20);
		array2.add(30);
		gmc.printList(array2);
		
		double dTotal = gmc.sumOfList(array1);
		int iTotal = (int) gmc.sumOfList(array2);
		
		System.out.println(gmc.sumOfList(array1));
		System.out.println((int) gmc.sumOfList(array1));
		
	}//end method main
}//end class GenericMethodDriver
