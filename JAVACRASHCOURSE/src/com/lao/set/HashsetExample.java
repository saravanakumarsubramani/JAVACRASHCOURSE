package com.lao.set;

import java.util.HashSet;

//EXAMPLE FOR HASHSET

public class HashsetExample {
	
	public void basicexampleHashSet() {
		HashSet<String> hashSet=new HashSet<String>();
		hashSet.add("A");
		hashSet.add("D");
		hashSet.add("F");
		hashSet.add("G");
		hashSet.add("A");
		hashSet.add("NULL");
		
		System.out.println("CONTENTS OF THE HASHSET:"+hashSet);
		hashSet.remove("NULL");
		System.out.println("CONTENTS OF THE HASHSET:"+hashSet);
		System.out.println(hashSet.contains("A"));
		
		}
		
	public static void main(String[] args) {
		HashsetExample hashsetexample= new HashsetExample();
		hashsetexample.basicexampleHashSet();
		
	}
}
