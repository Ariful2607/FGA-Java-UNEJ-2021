package fga.jp.section202.vehiclesystem;

import java.time.LocalDate;
import java.time.Month;

public final class Car extends Vehicle {

	  // Declare local variables.
	  private Feature[] feature = new Feature[10];
	  private int carAxle;

	  /**
	    *  Constructor for objects of class Vehicle
	    */
	  public Car() {      
	    // Initialize vehicle.
	    super();

	    // This sets the features and axles.
	    Feature[] f = {new InteriorFeature("No Interior Features")
	                 , new ExteriorFeature("No Exterior Features")};
	    this.feature = f;
	    this.carAxle =  2;
	}//end constructor

	  /**
	    *  Constructor for objects of class Vehicle
	    */
	  public Car( String     vehicleManufacturer
	            , LocalDate       vehicleManufacturedDate
	            , String     vehicleMake
	            , String     vehicleModel
	            , String     vehicleType
	            , Chassis    vehicleFrame
	            , Engine     vehicleEngine
	            , Feature[]  feature
	            , int        carAxle) {         

	    // Initialize vehicle.
	    super( vehicleManufacturer, vehicleManufacturedDate, vehicleMake
	         , vehicleModel, vehicleType, vehicleFrame, vehicleEngine);
	         
	    // This sets the number of car axles.
	    this.feature = feature;
	    this.carAxle = carAxle;
	  }//end constructor

	  /**
	    *  Declare local get list of ExteriorFeatures.
	    */
	  public String getExteriorFeatures() {

	    // Declare local variable for comma separated list.
	    String list = "";
	    
	    // Read the features into a comma separated list.
	    for (int i = 0; i < this.feature.length; i++) {
	        
	      if (this.feature[i] instanceof ExteriorFeature) {
	        if (list.length() == 0) {
	          list += this.feature[i]; }
	        else {
	          list += "\n                    : " + this.feature[i]; }}}
	    
	      // Return tokenized string.
	      return list; 
	   }//end method getExteriorFeatures
	          
	  /**
	    *  Declare local get list of InteriorFeatures.
	    */
	  public String getInteriorFeatures() {

	    // Declare local variable for comma separated list.
	    String list = "";
	    
	    // Read the features into a comma separated list.
	    for (int i = 0; i < this.feature.length; i++) {
	        
	      if (this.feature[i] instanceof InteriorFeature) {
	        if (list.length() == 0) {
	          list += this.feature[i]; }
	        else {
	          list += "\n                    : " + this.feature[i]; }}}

	      // Return tokenized string.
	      return list; 
	   }//end method getInteriorFeatures
	       
	  /*
	   *  Override the toString() method.
	   */
	  public String toString() {
	    
	    // Declare local variable for comma separated list.
	    String list = "";
	    
	    // Read the features into a comma separated list.
	    for (int i = 0; i < this.feature.length; i++) {
	       if (list.length() == 0) {
	          list += this.feature[i]; }
	        else {
	          list += "\n                    : " + this.feature[i]; }}
	      
	    // Print instance description.
	    return super.toString() + "\n" +
	           "Features            : " + list + "\n" +
	           "Car Axle            : " + carAxle;    
	  }//end method toString
	  
	  public static void main(String[] args) {
	  
	    // Test default constructor and print instance attributes.
	    Car c1 = new Car();
	    System.out.println("------------------------------------------------------------");
	    System.out.println(c1);

	    // Test overloaded constructor and print instance attributes.
	    System.out.println("-----------------------------------------------");   

	    // Seed the features with valid subclasses.
	    Feature[] f = { new InteriorFeature("AM/FM Radio")
	                  , new ExteriorFeature("Wood Panels")
	                  , new InteriorFeature("Air Conditioning")
	                  , new ExteriorFeature("Moonroof")};
	    
	    // Create an overloaded Car instance.
	    Car c2 = new Car( "Honda", LocalDate.of(2019, Month.JULY, 15)
	                    , "Honda", "Prelude", "Coupe"
	                    , new VehicleChassis("Unibody")
	                    , new ManufacturedEngine(
	                            "Honda", LocalDate.of(2019, Month.JULY, 10), "H-Series", "H23A1"
	                           , "2WD: Two-Wheel Drive", 4
	                           , "88 AKI")
	                    , f, 2);
	    System.out.println(c2);

	    // Test overloaded constructor and print instance attributes.
	    System.out.println("-----------------------------------------------");   

	    Vehicle v = (Vehicle) new Car( "Honda", LocalDate.of(2019, Month.JULY, 15)
	                                 , "Honda", "Prelude", "Coupe" 
	                                 , new VehicleChassis("Unibody")
	                                 , new ManufacturedEngine(
	                                     "Honda", LocalDate.of(2019, Month.JULY, 10)
	                                   , "H-Series", "H23A1"
	                                   , "2WD: Two-Wheel Drive", 4
	                                   , "88 AKI")
	                                 , f, 2);
	                       
	    System.out.println(((Car) v).getExteriorFeatures());
	    
	    // Test instanceof operator separates interior or exterior features.
	    System.out.println("-----------------------------------------------");   
	    System.out.println("Exterior Features   : " +
	                        c2.getExteriorFeatures());
	    System.out.println("Interior Features   : " +
	                        c2.getInteriorFeatures());
	    System.out.println("-----------------------------------------------");   
  }//end method main
}//end class Car

