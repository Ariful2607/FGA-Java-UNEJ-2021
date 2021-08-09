package fga.jp.section202.vehiclesystem;

public class ExteriorFeature implements Feature {

	  // Declare local variables.
	  private String exteriorFeature;

	  /**
	   *  Default constructor for ExteriorFeature
	   */
	  public ExteriorFeature() {
	    this.exteriorFeature = "Generic"; 
	    }//end constructor

	  /**
	   *  Default constructor for ExteriorFeature
	   */
	  public ExteriorFeature(String exteriorFeature) {
	    this.exteriorFeature = exteriorFeature; 
	    }//end constructor

	  /**
	   *  Implement method definitions.
	   */
	  public String getFeature() {
	    return this.exteriorFeature; 
	    }//end method getFeature
	  
	  public void setFeature(String feature) {
	    this.exteriorFeature = feature; 
	    }//end method setFeature
	      
	  /**
	   *  Override the toString() method.
	   */
	  public String toString() {
	    return "Exterior [" + this.exteriorFeature + "]"; 
	    }//end method toString

	  public static void main(String[] args) {
	  
	    // Test default constructor and print instance attributes.
	    System.out.println("----------------------------------------------------");
	    ExteriorFeature ef1 = new ExteriorFeature();
	    System.out.println(ef1);
	    
	    // Test overloaded constructor and print instance attributes.
	      System.out.println("---------------------------------------------------");
	      ExteriorFeature ef2 = new ExteriorFeature("Fog Lamps");
	      System.out.println(ef2); 

	    System.out.println("------------------------------------------------------");
	    
	}//end method main      
}//end class Exterior Features

