package com.ashish.design.behavioural.strategy;

public class AnimalPlay {
	
	public static void main(String args[]){
		
		Animals sheru = new Dogs();
		
		Animals tweety = new Birds();
		
		System.out.println("Dog: " + sheru.tryToFly());
		
		System.out.println("Bird: " + tweety.tryToFly());
		
		// Give sheru flying ability...
		
		sheru.setFlyingAbility(new ItFlys());
		
		System.out.println("Dog: " + sheru.tryToFly());
		
	}

}
