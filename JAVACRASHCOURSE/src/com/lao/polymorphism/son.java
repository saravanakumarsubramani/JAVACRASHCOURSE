package com.lao.polymorphism;

public class son extends Parents {
	
	@Override
	public void marriage() {
		System.out.println("MY LIFE MY RULE");
	}
	
	@Override
	public void properties() {
		System.out.println("never no thanks");
	}

	public static void main(String[] args) {
		
		Parents parents=new son();
	// parentclass ref =new childclass(); this is called dianamic polymorphism
		parents.properties();
		parents.marriage();
		
	}
}
