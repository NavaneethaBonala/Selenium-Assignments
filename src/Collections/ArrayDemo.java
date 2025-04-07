package Collections;

public class ArrayDemo {
	
	public static void main(String[] args) {
		
		int id[];
		//int[] a;
		
		id = new int[5];
		
		id[0]= 4;
		id[2]= 4;
		id[3]= 4;
		id[1]= 4;
//	System.out.println(id[0]);		
//	System.out.println(id[2]);		
//	System.out.println(id[3]);	
//	
//	System.out.println(id[4]);
//	System.out.println(id[5]); index outof bound error exception
	
	System.out.println("Length of an array "+ id.length);
	
	//print all elements of the array using a loop
	System.out.println("printing all the elements using for loop");
	
	//create an array of size 10 assign value as 0 to 9
	System.out.println("size 10 assign value as 0 to 9");
	int id1[] = new int[10];
	
	for (int i = 0; i< id1.length; i++)
	{
//		System.out.println(id1[i] = i);
	}
	//create an array of size 10 assign value as 1 to 10
	System.out.println("size 10 assign value as  1 to 10");

	for (int i = 0; i< id1.length; i++)
	{
		id1[i] = i+1;
//		System.out.println(id1[i]);
	}
	
	//create an array of size 10 assign value as 10, 20, 30 to 100
	System.out.println("size 10 assign value as  10, 20, 30 to 100");

	for (int i = 0; i< id1.length; i++)
	{
		id1[i]= (i+1)*10;
//		System.out.println(id1[i]);
	}
	
	// find the total count of elements of the array

	int[] c = {12, 44 , 34, 45, 3};
	int max = c[0];
	int total = 0;
	for (int i=0; i < c.length; i++)
	{
		total = total +c[i];
	}
	System.out.println(total);
	
	// find the max no of the array
	
	for (int i=0; i < c.length; i++)
	{
		
		if(c[i]>max) {
			max = c[i];
		}
	}
	System.out.println(total);
	
	// find the min no of the array
	// find the avg  of the array
	
	}

}
