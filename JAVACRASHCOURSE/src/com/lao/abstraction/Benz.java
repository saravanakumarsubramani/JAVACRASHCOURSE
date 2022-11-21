package com.lao.abstraction;

public class Benz extends Car10 implements UpcomingProjects , Interface2 {

	// example for abstraction
	
	@Override
	public void enginesecret() {
		System.out.println("benz engine secret");
	}
	
	@Override
	public void companyvault() {
		System.out.println("benz company vault");
	}
	
	public static void main(String[] args) {
		//dianamic polymorphism
		Car10 car=new Benz();
		car.enginesecret();
		car.companyvault();
	}

	@Override
	public void employees() {
		System.out.println("this is employee");
		
	}

	@Override
	public void method2() {
		System.out.println("this is method2");
	}

	@Override
	public void method3() {
		System.out.println("this is method3");
		
	}
}
