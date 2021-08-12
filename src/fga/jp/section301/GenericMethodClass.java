package fga.jp.section301;

import java.util.ArrayList;
import java.util.List;

public class GenericMethodClass {
	public <T> void printArray(T[] array){
		for( T arrayitem : array ){        
		   System.out.println( arrayitem );
		}//endfor
	}//end method printArray
	
	public void printList(List<?> list) {
		for (Object elem: list)
		   System.out.println(elem);
		//endfor
		System.out.println();
	}//end method printList

	public double sumOfList(ArrayList<? extends Number> arrayList) {
	    double s = 0.0;
	    for (Number n : arrayList)
	        s += n.doubleValue();
	    //endfor
	    return s;
	}//end method sumOfList

	public void addNumbers(ArrayList<? super Integer> arrayList) {
	   for (int i = 1; i <= 10; i++) {
	      arrayList.add(i);
	   }//endfor
	}//end method addNumbers
	
}//end class GenericMethodClass

