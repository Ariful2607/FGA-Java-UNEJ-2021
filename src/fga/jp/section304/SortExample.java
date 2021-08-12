package fga.jp.section304;

public class SortExample {

	public static void main(String[] args) {
        int[] numbers = {40, 7, 59, 4, 1};
  
        displayValues(numbers);
        //sequentialSearch(numbers, 13);
        //sequentialSearch(numbers, 7);
        //binarySearch(numbers, 7);
        selectionSort(numbers);
        int found = binarySearch(numbers, 7);
        if(found!= -1)	
            System.out.println("THe value is found at position " + found);
        else
        	System.out.println("THe value is not found");
        //endif
        //if(binarySearch(numbers, 7))
        //	System.out.println("THe value is found");
        //else
        //	System.out.println("THe value is not found");
        //endif
        //bubbleSort(numbers);
        //bubbleSortOptimized(numbers);
        //displayValues(numbers);
   }//end method main
	
	static int binarySearch(int[] numbers, int value){   
		   int low = 0;   
		   int high = numbers.length - 1; 
		      
		   while(high >= low){      
		      int middle = (low + high)/2; // Middle index   

		      if(numbers[middle] == value){         
		         return middle;  // Target value was found   
		      }//endif
		      if(numbers[middle] < value){         
		         low = middle + 1;      
		      }//endif  
		      if(numbers[middle] > value){         
		         high = middle - 1;      
		      }//endif   
		   }//endwhile  
		   return -1; // The value was not found
	}//end method binarySearch
	
/*	
	static public void binarySearch(int[] numbers, int value){   
	   int low = 0;   
	   int high = numbers.length - 1; 
	      
	   while(high >= low){      
	      int middle = (low + high)/2; // Middle index   

	      if(numbers[middle] == value){         
	    	  System.out.println("The number "+ value + " is at position " 
                      + middle + " in the list");
	    	  return;  // Target value was found   
	      }//endif
	      if(numbers[middle] < value){         
	         low = middle + 1;      
	      }//endif      
	      if(numbers[middle] > value){         
	         high = middle - 1;      
	      }//endif   
	   }//endwhile   
	   System.out.println("The number "+ value + " is not in the list"); // The value was not found
	}//end method binarySearch

	*/
	/*
	static boolean binarySearch(int[] numbers, int value){   
		   int low = 0;   
		   int high = numbers.length - 1; 
		      
		   while(high >= low){      
		      int middle = (low + high)/2; // Middle index   

		      if(numbers[middle] == value){         
		         return true;  // Target value was found   
		      }//endif
		      if(numbers[middle] < value){         
		         low = middle + 1;      
		      }//endif  
		      if(numbers[middle] > value){         
		         high = middle - 1;      
		      }//endif   
		   }//endwhile  
		   return false; // The value was not found
	}//end method binarySearch
	*/
	static void sequentialSearch(int[] numbers, int value) {
		  for(int i = 0; i < numbers.length; i++) {
		     if(numbers[i] == value) {
		        System.out.println("The number "+ value + " is at position " 
		                           + i + " in the list");
		        return;
		     }//endif
		  }//endfor
	      System.out.println("The number "+ value + " is not in the list");
	  }//end method sequentialSearch
	
   static void bubbleSort(int[] numbers) {
       for(int j =0 ; j < numbers.length; j++){
            for(int i = 0; i < numbers.length-1; i++){
                 //if the numbers are not in order
                if(numbers[i] > numbers[i+1]){
                      //swap the numbers
                      int temp = numbers[i];
                      numbers[i] = numbers[i+1];
                      numbers[i+1] = temp;
                }//endif
            }//endfor
       }//endfor
   }//end method bubbleSort
   

   
   static void bubbleSortOptimized(int[] numbers){
	   for(int i=0; i<numbers.length; i++)
	   {  
	     boolean flag = false;
	      for(int j=0; j<numbers.length-i-1; j++)
	      {
	         if(numbers[j]>numbers[j+1])
	         {
	            flag = true;
	            int temp = numbers[j+1];
	            numbers[j+1] = numbers[j];
	            numbers[j] = temp;
	         }//endif
	      }//endfor
	     // No Swapping happened, array is sorted.  Exit.
	     if(!flag){
	    	 return; 
	     }//endif
	  }//endfor
   }//end method bubbleSortOptimized
   
   static void selectionSort(int[] numbers) {
      int indexMin = 0; //the index of the smallest number
      for(int i = 0; i< numbers.length; i++){
         indexMin = i;
         for(int j = i + 1; j < numbers.length; j++){
	        if(numbers[j] < numbers[indexMin]){//if we find a smaller int, set it as the min
  	           indexMin = j;
            }//endif
         }//endfor
         //we now have the index of the smallest int and can swap the values
         int temp = numbers[i];  //use temp to store the value
         numbers[i] = numbers[indexMin];
         numbers[indexMin] = temp; 
       }//endfor
   }//end method selectionSort
	
   static void displayValues(int[] numbers) {
      for(int i = 0; i< numbers.length; i++){
         System.out.print(numbers[i] + " ");
      }//endfor
      System.out.println("\n");
   }//end method displayValues
   
}//end class SearchExample
