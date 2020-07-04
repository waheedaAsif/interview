package interview;

public class ReverseNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int a = 123456;
//		String b = String.valueOf(a);
//	    StringBuilder c = new StringBuilder();
//		System.out.println(new StringBuilder(b).reverse());
		
		int data = 123456789;
		String number = String.valueOf(data);
		System.out.println(new StringBuffer(number).reverse());
	}

}
