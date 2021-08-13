package recursionexample;

public class RecursionExample {

	public static void main(String[] args) {
		recurseMethod(4);
		System.out.println(factorial(5));
	}//end method main
	
	public static double fibonacci(double d) {
	  // Sort elements by title case.
	  if (d < 2) {
	    return d; 
	  } 
	  else {
	    return fibonacci(d - 1) + fibonacci(d - 2); 
	  }//endif
	}//end method fibonacci

	
	public static double factorial(double d) {
	  // Sort elements by title case.
	  if (d <= 1) {
	    return 1; 
	  } 
	  else {
	    return d * factorial(d - 1); 
	  }//endif
	}//end method factorial
	
	static void recurseMethod(int num){ 
		if(num == 0)
		      return;
		else{
		   System.out.println("hello " + num);
		   recurseMethod(--num);
		   System.out.println(""+num);
		   return;
		}//endif
	}//end method recurseMethod  
	


}//end class RecursionExample
