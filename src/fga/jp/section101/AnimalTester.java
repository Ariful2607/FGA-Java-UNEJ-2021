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
public class AnimalTester {
    public static void main(String[] args) {
        Dog dog = new Dog("Bailey", "Boerboel", "arf-arf", 80.2, "brown");;
	Fish fish = new Fish("Goldfish", "cold", "red");

	System.out.println("Dog name  : " + dog.getName());
	System.out.println("Dog breed : " + dog.getBreed());
	System.out.print("Bark noise: ");
	dog.bark();
	System.out.println("Dog weight: " + dog.getWeight());
	System.out.println("Dog colour: " + dog.getColour());
		
	System.out.println("Fish breed : " + fish.getBreed());
	System.out.println("Water type : " + fish.getWaterType());
	System.out.println("Fish colour: " + fish.getColour());
		
    }//end method main
}
