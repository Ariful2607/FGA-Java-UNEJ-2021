package vehiclesystem;

public class TestVehicleChassis2 {
	//Test cases for the class instances.

	public static void main(String[] args) {
		// Test default constructor and print instance attributes.
	    System.out.println("------------------------------------------------------");
	    VehicleFrame vf1 = new VehicleFrame();
	    System.out.println(vf1);
	 
	    // Test overloaded constructor and print instance attributes.
	    System.out.println("------------------------------------------------------");
	    VehicleFrame vf2 = new VehicleFrame("Ladder Frame");
	    System.out.println(vf2);
	    System.out.println("------------------------------------------------------");
	  }//end method main
}//end class TestVehicleChassis2
