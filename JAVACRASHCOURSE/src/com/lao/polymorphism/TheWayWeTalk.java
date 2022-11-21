package com.lao.polymorphism;

public class TheWayWeTalk {
	
	// example for overloading.it can do a different task at different object
	// it can be done in a same class
	
	public void talk(Parents styleofTalking) {
		System.out.println("polite");
	}
	public void talk(Partner styleofTalking) {
		System.out.println("love");
	}
	public void talk(Boss styleofTalking) {
		System.out.println("nothing personal");
	}
	
	public static void main(String[] args) {
		
		TheWayWeTalk talk=new TheWayWeTalk();
		
		Parents parents=new Parents();
		talk.talk(parents);
		
		Partner partner=new Partner();
		talk.talk(partner);
		
		Boss boss=new Boss();
		talk.talk(boss);

	}
}
