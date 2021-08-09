package vehiclesystem;

public class VehicleFrame implements Chassis {
	// Instance variables.
	private String vehicleFrameType;

	public VehicleFrame() {
	   this.vehicleFrameType = "Unibody"; 
	}//end constructor
	    
	public VehicleFrame(String vehicleFrameType) {
	   this.vehicleFrameType = vehicleFrameType; 
	}//end constructor 

	public Chassis getChassisType() {
	   return this; 
	}//end method getChassisType
	    
	public void setChassisType(String vehicleFrameType) {
	   this.vehicleFrameType = vehicleFrameType; 
	}//end method setChassisType

	@Override
	public String toString() {
	   // Print instance description.
	   return "Chassis             : " + Chassis.chassis + "\n" +
	          "Vehicle Frame       : " + this.vehicleFrameType;    
	  }//end method toString
	  
}//end class VehicleFrame
	  


