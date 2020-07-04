package interview;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 100;
		int y = 0;
		
		try {
			int z =x/y;
	        }catch(ArithmeticException e) {
			System.out.println(e);
		
			System.out.println("************************");
			
			//NumberFormatException
		try {	
	     int a = Integer.parseInt("Hi");
	     System.out.println(a);
	     
		}catch(NumberFormatException e1) {
			System.out.println("Exception:" + e1);
		}
	
	    //ArrayIndexOutOfBoundsException
		try {
			int[][] array = new int[3][5];
			array[3][5]= 30;
			
		}catch(ArrayIndexOutOfBoundsException e2){
				System.out.println("Exception:" + e2);
				
		//NullPointerException
				
		//StrinIndexOutOfBoundsException
	}
}}}