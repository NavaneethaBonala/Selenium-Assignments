package Collections;

import java.util.ArrayList;

public class ArrayListDemo {
	
	/*
	 * ArrayList
	 * - is a class
	 * - implementing list interface
	 * - Used to store multiple elements of the similar data type
	 * 
	 * Rules
	 *  - All the elements are indexed
	 *  insertions order is maintained
	 *  
	 */
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> list1 = new ArrayList<>();
		
		list.add(43);
		list.add(12);
		list.add(1);
		list.add(23);
		
		//CRUD
		//get valued by index
		System.out.println(list);
		System.out.println(list.get(2));
		
		//set value by index
		list.set(2, 55);
		System.out.println(list.get(2));
		System.out.println( list);
		
//		delete 		//list clear

//		System.out.println(list.remove(0));
		
//		check if empty
		System.out.println(list.isEmpty());
		
		// there is a list and a number , check if the number is present inside the list
		
		for (int i = 0; i< list.size();i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println(list.contains(55));
		
		System.out.println(list.size());
		
		//to add to a specific index
		
		list.add(1, 99);
		list.add(200);
		System.out.println(list);
		
		//create a 2nd array an add the elements f that array inside the orginal array
		
		for(int i=0; i< 10; i++) {
		list1.add(i, i+3);
		}
		System.out.println(list1.size());
		
		System.out.println(list1);
		System.out.println(list);
		// adding the all the elements of the 2nd to the 1st arraylist
//		list.addAll(list1);
//		System.out.println(list);
		
		list.add(list1.get(0));
		System.out.println(list);


	}

}
