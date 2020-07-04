package interview;

public class StringToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		 String s = "TEKSCHOOL";
//		 System.out.println(s.toLowerCase());
//		 System.out.println(s.toUpperCase());
//		 
//		  // type casting
//		 int a = 10;  int b=20;
//		 System.out.println(a+b);
//		 String s1 = String.valueOf(a); // method valueOf is static method thats y we can call it directly
//		 // with String class
//		 String s2 = String.valueOf(b);
//		 System.out.println(s1+s2); // Because we change this to string in this case its concatanting it.
//		 
//		 char[] c = s.toCharArray();
//		 System.out.println(c);
//		 
//		 
//		 String w = "TekschoolAmerica";
//		 char[] array = w.toCharArray();
//		 System.out.println(array);
//		 for(int i= 0;i<array.length; i++) { 
//		 }
//		 System.out.println(array.length);
		 
		 String mylife = "Iliveinuseforyears";
		 char[] myarraylife = mylife.toCharArray();
		 for (int p = 0; p < myarraylife.length; p++) {
			System.out.println(myarraylife[p]);
		}
		 
	 }
	}


