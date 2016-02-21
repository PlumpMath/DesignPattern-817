package com.ashish.design.creational.singleton;

import java.lang.reflect.Constructor;

public class Singleton {
	private static Singleton soleInstance = new Singleton();
	// private constructor...
	private Singleton(){
		System.out.println("Creating Singleton object...");
	}
	// global access to singleton object...
	public static Singleton getInstance(){
		return soleInstance;
	}
}

class TestClass {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String... args) throws Exception{
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		print("s1", s1);
		print("s2", s2);
		
		// Reflection to violate singleton...
		Class clazz = Class.forName("com.ashish.design.creational.singleton.Singleton");
		Constructor<Singleton> constr =  clazz.getDeclaredConstructor();
		constr.setAccessible(true);    // changes the access modifier of the constructor...
		Singleton s3 = constr.newInstance();
		print("s3", s3);
	}

	private static void print(String name, Singleton object) {
		System.out.println(String.format("Object: %s, Hashcode: %d", name, object.hashCode()));
	}
}

/**
 * Basic example of Singleton. Only one object is created and shared across the application.
 * All the references will be given the object instances. Proof same hash code.
 * We can violate this rule by using reflection.(it creates instances of class without using the new keyword)
 * Can also change the access modifier of the constructor.
 */