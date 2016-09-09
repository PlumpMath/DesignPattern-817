package com.ashish.design.behavioural.strategy;

public class Animals {
	
	private String name;
	private String sound;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSound() {
		return sound;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
	
	public Flys flyingType;
	
	public String tryToFly(){
		return flyingType.fly();
	}
	
	public void setFlyingAbility(Flys newFlyType){
		flyingType = newFlyType;
	}
	
}