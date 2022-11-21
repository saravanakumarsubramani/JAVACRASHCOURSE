package com.lao.conditional_statements;

public class SuperheroOrNot {
	
	String hero="captain america";
	
	public void heroOrNot() {
		// switch condition example
		switch (hero) {
		case "captain america":
			System.out.println("captain america is super hero");
			break;
		case "spider man":
			System.out.println("spider man is super hero");
			break;
		case "iron man":
			System.out.println("iron man is super hero");
			break;
		default:
			System.out.println(hero+ " sorry i dont know about this person ");
		}
	}

	public static void main(String[] args) {
		
		SuperheroOrNot heroornot=new SuperheroOrNot();
		heroornot.heroOrNot();
		
	}
}
