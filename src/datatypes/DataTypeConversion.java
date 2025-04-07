package datatypes;

public class DataTypeConversion {
	
		/* Type casting
		 * Bucket theory
		 * 
		 * B1 >> 3L
		 * B2 << 5L
		 * 
		 * 
		 * task : to transfer water from 
		 * 
		 * 1. B1 to B2, possible , no error
		 * 2. B2 to B1 , overflow, error
		 * 
		 */
		
	public static void main(String[] args) {
		//lower to higher
		short s1 = 45;
		int i1 = s1;
		System.out.println(s1);
		System.out.println(i1);
		
		
		//  higher to lower
		int i2 =23;
		short s2 = (short)i2;
		System.out.println(i2);
		System.out.println(s2);
		
		int i3 =129;
		byte s3 = (byte)i3;
		System.out.println(i3);
		System.out.println(s3);
		
		// int to float
		
		int i5 = 52;
		float f2 = i5;
		System.out.println(i5);
		System.out.println(f2);

		
		//float to int 
		
		float f1 = 12.95f;
		int i4 = (int)f1;
		System.out.println(f1);
		System.out.println(i4);
		
		
		// char to int
		char c1 = '$';
		int i6 = c1;
		System.out.println(c1);
		System.out.println(i6);
		
		// int to char
		
		int i7 = 65;
		char c2 = (char)i7;
		System.out.println(i7);
		System.out.println(c2);
		
		
		
	}
	

}
