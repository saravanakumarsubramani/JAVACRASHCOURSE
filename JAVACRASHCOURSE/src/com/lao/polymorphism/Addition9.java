package com.lao.polymorphism;

public class Addition9 {
	//EXAMPLR FOR OVERLOADING
	
	private int add(int n1,int n2) {
		return n1+n2;
	}
	
	public int add(int n1,int n2,int n3) {
		return n1+n2+n3;
	}
	float add(float n1,float n2) {
		return n1+n2;
	}

	public static void main(String[] args) {
		
		Addition9 add=new Addition9();
		System.out.println("sum of two number "+ add.add(20, 21));
		System.out.println("sum of three number "+add.add(20, 21, 22));
		System.out.println("sum of two number "+ add.add(212, 213));
		
	}
}
