package com.lao.map;

import java.util.HashMap;
import java.util.Map;

//example for hashmap 

public class HashMapExample {
	
	public static void main(String[] args) {
		HashMap <Integer,String> employeemap= new HashMap <Integer,String>();
		
		//TO INSERT AN ELEMENT PUT METHOD IS USED
		employeemap.put(1,"agni");
		employeemap.put(2,"aRYA");
		employeemap.put(3,"SIYA");
		employeemap.put(4,"MUUNIMS");
		employeemap.put(5,"DUCK");
		employeemap.put(6,"RIYA");
		employeemap.put(6,"sara");
		System.out.println("EMPLOYYEE MAP:"+employeemap);
		
		//TO MAKE A COPY OF THE EXISTING MAP
		Map<Integer,String> duplicateMap=new HashMap<Integer,String>();
		duplicateMap.putAll(employeemap);
		System.out.println("duplicate map:"+duplicateMap);
		
		//clear to delete the map contents
		duplicateMap.clear();
		System.out.println("after clearing"+duplicateMap);
		
		// to check if a key is present or not in the map
		System.out.println("does this map has key 1?"+employeemap.containsKey(1));
		
		// to check if a value is present or not
		System.out.println("does this map has value aRYA?"+employeemap.containsValue("aRYA"));
		
		//CLONE THE MAP
		System.out.println("CLONED MAP"+employeemap.clone());
		
		//CHECK IF THE MAP IS EMPTY OR NOT
		System.out.println("IS EMPTY?"+duplicateMap.isEmpty());
		
		// FETCH THE SET OF KEYS IN THE MAP (NOTE:HERE IT NOT LIST OF KEYS,
		//IT SET OF KEY,
		//BECAUSE LIST WILL ALLOW DUPLICATE BUT SET WONT.KEYS SHOULD BE UNIQUE
		System.out.println("KEY SET:"+employeemap.keySet());
		
		//FETCH THE VALUE
		System.out.println(employeemap.get(1));
		
		//FETCH ALL THE VALUES
		System.out.println("ALL VALUES:"+employeemap.values());
		
		//entry set
		System.out.println(employeemap.entrySet());
	}
}
