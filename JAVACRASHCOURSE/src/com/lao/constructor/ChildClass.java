package com.lao.constructor;

public class ChildClass extends Parentclass{
	
	public ChildClass() {
		super();
		System.out.println("child constructor");
	}

	public static void main(String[] args) {
		ChildClass childclass=new ChildClass();
		

	}

}
