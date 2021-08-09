package fga.jp.section202.vehiclesystem;

import java.time.LocalDate;

public class ManufacturedEngine implements Engine
{
	  private String     engineManufacturer;
	  private LocalDate  engineManufacturedDate;
	  private String     engineMake;
	  private String     engineModel;
	  private int        engineCylinders;
	  private String     engineType;
	  private String	 driveTrain;

	  /*
	   *  Constructor for objects of class Engine.
	   */
	  public ManufacturedEngine() {
	  
	    // Initialize vehicle.
	    this.engineManufacturer = "Generic";
	    this.engineManufacturedDate = LocalDate.now();
	    this.engineMake = "Generic";
	    this.engineModel = "Generic";
	    this.engineCylinders = 0;
	    this.engineType = "85 AKI";
	    this.driveTrain = "2WD: Two-Wheel Drive"; 
	   }//end consructor

	  /*
	   *  Override constructor for objects of class Engine.
	   */
	  public ManufacturedEngine( String engineManufacturer, LocalDate engineManufacturedDate
	                           , String engineMake, String engineModel
	                           , String driveTrain, int engineCylinders
	                           , String engineType ) {
	  
	    // Initialize vehicle.
	    this.engineManufacturer = engineManufacturer;
	    this.engineManufacturedDate = engineManufacturedDate;
	    this.engineMake = engineMake;
	    this.engineModel = engineModel;
	    this.driveTrain = driveTrain;
	    this.engineCylinders = engineCylinders;
	    this.engineType = engineType; 
	    }//end consructor

	  /**
	   *  Declare method definitions.
	   */
	  public final void setEngineManufacturedDate(LocalDate date) {
	    this.engineManufacturedDate = date; 
	  }//end method setEngineManufacturedDate
	  public final void setEngineManufacturer(String manufacturer) {
	    this.engineManufacturer = manufacturer; 
	    }//end method setEngineManufacturer
	  public void setEngineMake(String engineMake) {
	    this.engineMake = engineMake; 
	    }//end method setEngineMake
	  public void setEngineModel(String engineModel) {
	    this.engineModel = engineModel; 
	    }//end method setEngineModel
	  public final void setEngineType(String fuel) {
	    this.engineType = fuel; 
	    }//end method setEngineType
	  public void setEngineCylinders(int engineCylinders) {
	    this.engineCylinders = engineCylinders; 
	    }//end method setEngineCylinders
	  public void setDriveTrain(String driveTrain) {
	    this.driveTrain = driveTrain; 
	    }//end method setDriveTrain

	  /*
	   *  Override the toString() method.
	   */
	  public String toString() {
	    // Print instance description.
	    return "Engine Manufacturer : " + this.engineManufacturer + "\n" +
	        "Engine Manufactured : " + this.engineManufacturedDate.toString() + "\n" +
	        "Engine Make         : " + this.engineMake + "\n" +
	        "Engine Model        : " + this.engineModel + "\n" +
	        "Engine Type         : " + this.engineType + "\n" +
	        "Engine Cylinders    : " + this.engineCylinders + "\n" +
	        "Drive Train         : " + this.driveTrain; 
	    }//end method toString

}//end class ManufacturedEngine
