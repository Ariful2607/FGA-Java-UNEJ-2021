package vehiclesystem;

public class VehicleChassis implements Chassis {
	  // Declare generic chassis variable.
	  private String chassisName;

	  public VehicleChassis() {
	    this.chassisName = Chassis.chassis; 
	  }//end constructor 

	  public VehicleChassis(String chassisName) {
		    this.chassisName = chassisName; 
	  }//end constructor 

	// Implement interface methods.
	  public Chassis getChassisType() {
	    return this; 
	  }//end method getChassisType  
	  
	  // Implement interface methods.
	  public void setChassisType(String vehicleChassis) {
	    this.chassisName = vehicleChassis; 
	  }//end method setChassisType

	  @Override
	  public String toString() {
	    return "Chassis Name        : " + this.chassisName; 
	  }//end method toString
	  
}//end class VehicleChassis

