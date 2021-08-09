/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fga.jp.section101;

/**
 *
 * @author Ay
 */
public class Animal {
    private String breed;
    private String colour;
	   
    public Animal(String breed, String colour) {
	this.breed = breed;
	this.colour = colour;
    }//end constructor method
	   
    public String getBreed() {
        return breed;
    }//end method getBreed

    public void setBreed(String breed) {
        this.breed = breed;
    }//end method setBreed

    public String getColour() {
        return colour;
    }//end method getColour

    public void setColour(String colour) {
        this.colour = colour;
    }//end method setColour
}
