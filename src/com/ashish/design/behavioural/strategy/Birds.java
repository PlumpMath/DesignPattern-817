package com.ashish.design.behavioural.strategy;

public class Birds extends Animals{
	
	public Birds(){
		
		super();
		
		setSound("Chirp");
		
		flyingType = new ItFlys();
	}

}
