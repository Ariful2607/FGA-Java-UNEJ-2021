package vehiclesystem;

import java.time.LocalDate;
import java.time.Month;

public class TestManufacturedEngine {

	public static void main(String[] args) {
	    // Test default constructor and print instance attributes.
	    System.out.println("------------------------------------------------------");
	    ManufacturedEngine me1 = new ManufacturedEngine();
	    System.out.println(me1);

	    // Test overloaded constructor and print instance attributes.
	    System.out.println("------------------------------------------------------");
	    ManufacturedEngine me2 =
	      new ManufacturedEngine( "Honda", LocalDate.of(2019, Month.JULY, 15)
	                                                   , "H-Series", "H23A1"
	                                                   , "2WD: Two-Wheel Drive", 4
	                                                   , "88 AKI");
	    System.out.println(me2);
	    System.out.println("------------------------------------------------------");   
	  }//end method main
}//end class TestManufacturedEngine
