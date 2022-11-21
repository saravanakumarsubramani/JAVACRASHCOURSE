package com.lao.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

//example for linkedhashmap. insertion order is maintained
public class LinkedHashMapExample {

	public static void main(String[] args) {
		
		LinkedHashMap<String,String> heros=new LinkedHashMap<String,String>();
		heros.put("iron man", "tony stark");
		heros.put("bat man", "bruce wayne");
		heros.put("super man", "clark");
		heros.put(null, "power star");
		heros.put(null, "little super star");
		heros.put("super man", "saraa");
		
		System.out.println(heros);
		
		HashMap<String,String> mapheros=new HashMap<String,String>();
		mapheros.put("iron man", "tony stark");
		mapheros.put("bat man", "bruce wayne");
		mapheros.put("super man", "clark");
		mapheros.put(null, "SUPER");
		mapheros.put(null, "SUPERman");
		
		System.out.println(mapheros);
		
		TreeMap<String,String> placesintrichy=new TreeMap<String,String>();
		placesintrichy.put("thiruvermber", "trichy");
		placesintrichy.put("srirangam", "trichy");
		placesintrichy.put("palakkarai", "trichy");
		placesintrichy.put("kaaiukuzhi", "trichy");
		placesintrichy.put("kaaiukuzhi", "trichy");
		
		System.out.println(placesintrichy);
	}

}
