package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//Hashmap containts key and value key should be unique
//Hashmap not a part of collection

public class HashMaps {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hs = new HashMap<>();
		
//		add values using put
		hs.put("BMW", 280);
		hs.put("Lexcus", 320);
		hs.put("Nissan", 360);
		
		Set<Map.Entry<String, Integer>> ms = hs.entrySet();
		
		for(Map.Entry<String, Integer> val : ms) {
			System.out.println("Key = " + val.getKey() + " Value = " + val.getValue());
			
//			display values using key
			System.out.println(hs.get("Nissan"));
		}

	}

}
