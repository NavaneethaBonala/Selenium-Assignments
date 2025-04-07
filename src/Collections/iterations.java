package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class iterations {
	public static void main(String[] args) {
		
		
		ArrayList<Integer> list = new ArrayList<Integer>();
				for(int i= 0; i<10; i++) {
					
					list.add(i+5);
				}
		System.out.println(list);
	//using for each loop
		for(int abc : list) {
			System.out.println(abc);
		}
	
	HashSet<Integer> set = new HashSet<Integer>();
	set.add(34);
	set.add(66);
	set.add(29);
	
	System.out.println(set);
	//using for each loop
			for(int abc : set) {
				System.out.println(abc);
			}
	
			//2nd approach
		Iterator<Integer> it =set.iterator();
		
		//it.hasNext(); --informs you if there is a next element
		//it.next(); - give you yhe next element
		 while(it.hasNext()) {
			 System.out.println(it.next());
		 }
		
	}

}
