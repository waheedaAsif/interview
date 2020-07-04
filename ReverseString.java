package interview;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "Waheeda";
		
		StringBuffer sb = new StringBuffer(a);
		 System.out.println(sb.reverse());
		 
		 String w = "waheeda";
		 String reverse = "";
		 for(int i = w.length()-1;i>=0;i-- ) {
			reverse = reverse+w.charAt(i); 
			 
		 
			  
		 }
		 System.out.println(reverse);
		 
		 
		 String reverse1 = "";
		 
		 for(int i = a.length()-1;i>=0;i--) {
			 reverse1 = reverse1+a.charAt(i);
			 System.out.println("2nd :" +reverse1);
		 }
		 
		 String b = "America";
		 String revers2 = "";
		 for (int y = 0; y < b.length(); y--) {
			 revers2 = revers2+a.charAt(y);
			 System.out.println("My new code"+ revers2);
		}
		
		 
	}

}
