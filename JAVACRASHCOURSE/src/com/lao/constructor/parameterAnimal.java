package com.lao.constructor;

public class parameterAnimal {
	//example for parameter
	
	String animal_name;
	String animal_type;
	
	parameterAnimal(String name,String type){
		animal_name=name;
		animal_type=type;
	}
	public void sayAboutAnimal() {
	System.out.println("Animal name is " + animal_name+" and animal type is " + animal_type);
	}
	
	public static void main(String[] args) {
		// parameter constructor has arguments (parameter) 
		
	parameterAnimal animal1=new parameterAnimal("duck","omnivores");
	animal1.sayAboutAnimal();
	parameterAnimal animal2=new parameterAnimal("karadi","omnivores");
	animal2.sayAboutAnimal();

	}
}
