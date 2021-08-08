/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fga.jp.section1;

/**
 *
 * @author Ay
 */
public class Lesson101Fish extends Lesson101Animal{
    private String waterType;
	
    public Lesson101Fish(String breed, String waterType, String colour) {
	super(breed, colour);
	this.waterType = waterType;
    }//end constructor method

    public String getWaterType() {
	return waterType;
    }//end method getWaterType

    public void setWaterType(String waterType) {
	this.waterType = waterType;
    }//end method setWaterType
}
