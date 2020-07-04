package interview;

public class TwoStringsAreEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "Best of Luck";
		String b = "Best of Luck";
		
		if(a.equals(b)) {
		  System.out.println("a&b are equal");
		}else {
			System.out.println("String"+a+" and String "+b+" are not equal");
			
		if(a.compareTo(b) == 0){
			System.out.println("are equal");
		}else {
			System.out.println("not equal");
			
		}
		}
	}

}
