package com.lao.static_keyword;

public class StaticMethods7 {
	// EXAMPLE FOR STATIC METHOD ,IF YOU MAKE A TWO STATIC OR MEMBER STATIC, 
	//YOU CAN ACCESS IT WITHOUT OBJECT
	
	public static void method1() {
		System.out.println("static method");
	}
	
	public void method2() {
		method1();
		System.out.println("Non static method");
	}

	public static void main(String[] args) {
		
	method1();
	}
}
