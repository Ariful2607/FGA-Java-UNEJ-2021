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
public class Lesson101Dog extends Lesson101Animal{
   //instance field declarations
   private String name;
   private String barkNoise = "Woof";
   private double weight;

    public Lesson101Dog(String name, String breed, double weight, String colour) {
        super(breed, colour);
	this.name = name;
        this.weight = weight;
    }//end constructor method
   
    public Lesson101Dog(String name, String breed, String noise, double weight, String colour) {
	super(breed, colour);
	this.name = name;
	barkNoise = noise;
	this.weight = weight;
    }//end constructor method

    public String getName() {
	return name;
    }//end method getName

    public void setName(String name) {
	this.name = name;
    }//end method setName

    public double getWeight() {
	return weight;
    }//end method getWeight

    public void setWeight(double weight) {
	this.weight = weight;
    }//end method setWeight
   
    public void bark(){ 
	System.out.println(barkNoise);
    }//end method bark

    public void bark(String barkNoise){ 
	System.out.println(barkNoise);
    }//end method bark
}
