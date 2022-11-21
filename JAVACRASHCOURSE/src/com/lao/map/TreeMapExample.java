package com.lao.map;
import java.util.TreeMap;
public class TreeMapExample {
	
	//example for reemap.ascending order is maintained

	public static void main(String[] args) {
		
		TreeMap<String,String> placesintrichy=new TreeMap<String,String>();
		placesintrichy.put("thiruvermber", "trichy");
		placesintrichy.put("srirangam", "trichy");
		placesintrichy.put("palakkarai", "trichy");
		placesintrichy.put("kaaiukuzhi", "trichy");
		
		placesintrichy.put("trichy", "trichy toll gate");
		placesintrichy.put("trichy", "melathumpur");
		//placesintrichy.put(null, "melathumpur");
		//placesintrichy.put(null, "xyz");
		
		System.out.println(placesintrichy);
	}
}
