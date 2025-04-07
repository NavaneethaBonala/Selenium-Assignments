package loopingControls;

public class WhileLoop {
	public static void main(String[] args) {
		
		int temp=1;
		//entry check
		while(temp<=10)
		{
			System.out.println(temp);// infinite loop
		}
		
		//Dowhile 
		int temp1=1;
		do {
			System.out.println(temp1);
			
		}while(temp1<=10);
		
	}

}
