package com.lao.abstraction;

public class Bmw extends Car10 implements UpcomingProjects {
	
	// example for abstraction
	
	@Override
	public void enginesecret() {
		System.out.println("bmw engine secret");
	}
	
	@Override
	public void companyvault() {
		System.out.println("bmw company vault");
	}
		
	public static void main(String[] args) {
		//dianamic polymorphism
		Car10 car=new Bmw();
		car.enginesecret();
		car.companyvault();
		
	}

	@Override
	public void employees() {
		System.out.println("this is employee");
		
	}

	@Override
	public void method2() {
		System.out.println("this is method 2");
		
	}

	@Override
	public void method3() {
		System.out.println("this is method 3");
		
	}

}
