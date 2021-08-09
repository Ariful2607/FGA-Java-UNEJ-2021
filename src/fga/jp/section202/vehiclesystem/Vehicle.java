package vehiclesystem;

import java.time.LocalDate;
import java.time.Month;

public class Vehicle implements Engine,Chassis {
	LocalDate  vehicleManufacturedDate;
	String     vehicleManufacturer;	
	String     vehicleMake;
	String     vehicleModel;
	Chassis    vehicleFrame;
	String     vehicleType;	
	String     driveTrain;	
	Engine     vehicleEngine;
	
	public Vehicle() {      
	    // Initialize vehicle.
	    this.vehicleManufacturedDate = LocalDate.now();;
	    this.vehicleManufacturer = "Generic";
	    this.vehicleMake = "Generic";
	    this.vehicleModel = "Generic";
	    this.vehicleType = "None";	   
	    this.vehicleFrame = new VehicleFrame();
	    this.vehicleEngine = new ManufacturedEngine();
	    this.vehicleEngine.setEngineType("88 AKI");
	    this.vehicleEngine.setDriveTrain("2WD: Two-Wheel Drive");
	  }//end constructor

	  /**
	    *  Constructor for objects of class Vehicle
	    */
	  public Vehicle( String  vehicleManufacturer
	                , LocalDate vehicleManufacturedDate
	                , String  vehicleMake
	                , String  vehicleModel
	                , String  vehicleType
	                , Chassis vehicleFrame
	                , Engine  engine
	                ) {                 
	    // Initialize vehicle.
		 
	    this.vehicleManufacturer = vehicleManufacturer;
	    this.vehicleManufacturedDate = vehicleManufacturedDate;
	    this.vehicleMake = vehicleMake;
	    this.vehicleModel = vehicleModel;
	    this.vehicleFrame = vehicleFrame;
	    this.vehicleEngine = engine;
	  }//end constructor

	@Override
	public void setEngineCylinders(int engineCylinders) {
		vehicleEngine.setEngineCylinders(engineCylinders);
	}//end method setEngineCylinders

	@Override
	public void setEngineManufacturedDate(LocalDate date) {		
		vehicleEngine.setEngineManufacturedDate(date); 
	}//end method setEngineManufacturedDate

	@Override
	public void setEngineManufacturer(String manufacturer) {
		this.vehicleManufacturer = manufacturer; 
	}//end method setEngineManufacturer

	@Override
	public void setEngineMake(String engineMake) {
		this.vehicleEngine.setEngineMake(engineMake);

	}//end method setEngineMake

	@Override
	public void setEngineModel(String engineModel) {
		this.vehicleEngine.setEngineModel(engineModel);
	}//end method setEngineModel

	@Override
	public void setDriveTrain(String driveTrain) {
		this.vehicleEngine.setDriveTrain(driveTrain);

	}//end method setDriveTrain

	@Override
	public void setEngineType(String fuel) {
		this.vehicleEngine.setEngineType(fuel);

	}//end method setEngineType

	@Override
	public Chassis getChassisType() {		
		return vehicleFrame;
	}//end method getChassisType

	@Override
	public void setChassisType(String vehicleChassis) {
	    this.vehicleFrame.setChassisType(vehicleChassis); 
		
	}//end method setChassisType
	
	  public String toString() {
		    // Print instance description.
		    return "Manufacturer Name   : " + this.vehicleManufacturer + "\n" +
		           "Manufactured Date   : " + this.vehicleManufacturedDate.toString() + "\n" +
		           "Vehicle Make        : " + this.vehicleMake + "\n" +
		           "Vehicle Model       : " + this.vehicleModel + "\n" +
		           "Vehicle Type        : " + this.vehicleType + "\n" +
		           vehicleEngine.toString();    
		  }//end method toString
  
	  public static void main(String[] args) {
  
		  // Test default constructor and print instance attributes.
		  System.out.println("----------------------------------------------");
		  Vehicle v1 = new Vehicle();
		  System.out.println(v1);
 
		  // Test overloaded constructor and print instance attributes.
		  System.out.println("-----------------------------------------------");
		  Vehicle v2 = new Vehicle( "Honda", LocalDate.of(2019, Month.JULY, 15), "Honda", "Prelude", "Coupe"
                            , new VehicleChassis("Unibody")
                            , new ManufacturedEngine( "Honda", LocalDate.of(2019, Month.JULY, 10), "H-Series", "H23A1", "2WD: Two-Wheel Drive", 4, "88 AKI"));
		  System.out.println(v2);
		  System.out.println("-----------------------------------------------");
		  v2.setEngineCylinders(6);
		  System.out.println(v2);
		  System.out.println("-----------------------------------------------");
	  }//end method main
	  
}//end class Vehicle 

