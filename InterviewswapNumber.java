package interview;

public class InterviewswapNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// how to swap two numbers
		//1.
		int a = 10;        
		int b = 5;
		                                
		int temp = a;
	    a = b;                     a = b;
		b = 10;
		
		System.out.println("a" + a);
		System.out.println("b" + b);
		
		//2.
		a = a + b ;   	               
		b = a - b ;
		a = a - b ;
	
		//3.
		a = a ^ b;   
		b = a ^ b;
		a = a ^ b;
		
		System.out.println("a" + a);
	    System.out.println("b" + b);
	    
	    a = a * b; // a = 10, b = 5
	    b = a / b;
	    a = a / b;
	    
	    
	}

  
}
