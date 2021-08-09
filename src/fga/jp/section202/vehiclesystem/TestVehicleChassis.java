package vehiclesystem;

public class TestVehicleChassis {
   /*  Test Driver */
   public static void main(String[] args) {
	  
      // Test default constructor and print instance attributes.
	  System.out.println("------------------------------------------------------------");
	  VehicleChassis vc1 = new VehicleChassis();
	  System.out.println(vc1);
	    
	  // Test overloaded constructor and print instance attributes.
	  System.out.println("------------------------------------------------------------");
	  VehicleChassis vc2 = new VehicleChassis("Test Chassis");
	  System.out.println(vc2); 
	  System.out.println("------------------------------------------------------------"); 
   }//end method main
}//end class TestVehicleChassis
