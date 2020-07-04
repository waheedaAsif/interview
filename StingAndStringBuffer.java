package interview;

public class StingAndStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "Java";
		String b = "Java";
		
		StringBuffer sb = new StringBuffer("Java Practice");
		
		a = a.concat(" Practice");
		System.out.println(a);
		
		sb = sb.append(" with my self");
		System.out.println(sb);
	}

}
