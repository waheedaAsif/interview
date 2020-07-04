package interview;

public class Howtodividewihoutusingdicisionoroperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// how to divide 30 by 15 without using division or mod operators
		int a = 30;
		int b = 15;
		
		int temp = 0;          //space complexity
		
		while (true) {
			if(!(a-b >= 0)) {
				break;
			}
		    a-=b;
			temp++;
			
		}
		
		System.out.println(temp);
		//o(n^2) means number of iteration
		
	}

}
