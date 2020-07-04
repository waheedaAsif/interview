package interview;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayVsArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Array is fixed in Size but ArrayLists are dynamic
		//Array can store homogeneous elements where collections can store both,
		// In Array we can either store int, String or boolean where in ArrayLists we can store all
		//data types together.
		//To find the size of array we use method of .
		
		
		//ArrayList al = new ArrayList();
		//al.add("Seiar");
		//al.add("Waheeda");
		//al.add("Ayat");
		//al.add("Kawsar");
		//al.add(143);
		//for(int i = 0; i<al.size();i++) {
			//System.out.println(al.get(i));
		
		String[] point = new String[3];
		point[0] = "flower";
		point[1] = "tree";
		point[2] = "grass";
		
		for(int i= 0;i<point.length;i++) {
			System.out.println(point[i]);
		
		
		//String [][] num = {{"a","b","c","d"},{"w","k","n","g"}};
		
		//for( int row =0; row< num.length; row++) {
			//for(int col = 0; col<num[row].length; col++) {
					//System.out.println(num[row][col]);
		}	
			ArrayList<String> ar= new ArrayList<String>();
			
			ar.add("love");
			ar.add("life");
			ar.add("nice");	
			ar.add("flower");
			
			Iterator<String> is = ar.iterator();
				 while(is.hasNext()) {
				 String word = is.next();
				 System.out.println(word);
				 
					 
				}
				 //System.out.println(word);
			}
			
	}
		
		
	


