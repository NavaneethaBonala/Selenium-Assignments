package Collections;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
		/*
		 *  it is not a part of the collections
		 * is a class implementing Map interface
		 * 
		 * 
		 */
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
	
	map.put(1, "Apple");
	map.put(2, "Orange");
	map.put(3, "Banana");
	map.put(1, "Grapes");// Overrides the data and Updates with the new one
	map.put(4, null);
	System.out.println(map);
	map.put(null, "ABC");
	System.out.println(map);

	
	System.out.println(map.keySet());
	Set<Integer> keys = map.keySet();
	
	System.out.println(map.entrySet());
	
	//print key and value
	for(Entry<Integer, String>abc : map.entrySet()) {
		System.out.println(abc.getKey());
		System.out.println(abc.getValue());
	}
	
	
	
	
	}
}
