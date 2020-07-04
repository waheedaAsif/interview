package interview;

public class StaticBlock {
    
	
	
	// Static block executes automatically when the class is loaded in the memory.
	// Before and with 1.6 jdk version we were able to print with out main method
	
	static
	{ 
		System.out.println("Salam");
	}
	public static void main(String[] arg) {
		
		System.out.println("Hello");
	}
	
	static {
		System.out.println("Hi");
	}
		
		
	}
	
	

