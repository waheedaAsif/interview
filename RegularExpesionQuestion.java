package interview;

public class RegularExpesionQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		// how many alphabtes exist in the below string

		//String data = "dkfjfjljflkhhlhaAYUTREWiiiprojklfk%$#";
        String point = "ajfhnvfvnj48756-*******";
        String temp = point.replaceAll("[a-zA-Z]", "");
        //String temp1 = point.replaceAll("[^a-zA-Z]", "");
        System.out.println(point);
        System.out.println(point.replaceAll("[a-zA-Z]", ""));
        System.out.println(point.length()-temp.length());
        System.out.println(point.replaceAll("[^a-zA-Z]", ""));
        //System.out.println(point.length()-temp.length());
        
		
//
//	    System.out.println("data 1 = " + data);
//		System.out.println("data 2 = " + temp);
////		System.out.println("data 1 length = " + data.length());
////	    System.out.println("data 2 length = " + temp.length());
////		System.out.println("# of chars = "  + (data.length() - temp.length()));
//
//		//String temp2 = data.replaceAll("[^a-zA-Z]", ""); // ^bytewise apply the not logical sign do reverse here.
//		//System.out.println(temp2);
//
//		System.out.println("***********************************");

		
	}

}
