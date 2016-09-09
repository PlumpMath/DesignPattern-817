package com.ashish.design.behavioural.strategy;

public class Dogs extends Animals{

	public Dogs(){
		
		super();
		
		setSound("Bark");
		
		flyingType =  new CantFly();
	}
	
}
