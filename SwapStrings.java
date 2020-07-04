package interview;

public class SwapStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x = "Hello";
		String y = "TekSchool";
		
		x = x + y; // HelloTekSchool
		System.out.println(x);
		System.out.println(x.substring(4));
		System.out.println(x.substring(0,4));
		
		System.out.println("----------------------");
		y = x.substring(0,(x).length() - y.length());
		x = x.substring(y.length());
		
			System.out.println(x);	
			System.out.println(y);
			
  System.out.println("*********************************************");	
  
			String a = "Waheeda";
			String b = "Seiar";
			
			a = a + b ;
			System.out.println(a);
			System.out.println(a.substring(0));
			System.out.println(a.substring(2,5));
			
			b = a.substring(0,(a).length() - b.length());
			a = a.substring (b.length());
			
			System.out.println(b);
			System.out.println(a);
	}

}
