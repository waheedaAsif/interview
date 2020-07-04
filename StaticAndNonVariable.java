package interview;

public class StaticAndNonVariable {

	
	/*
     * Class Variables In Java : 
     * 1) Class variables, also called as static
     * variables, are declared with the keyword static. 
     * 2) Class variables are
     * common to all instances of that class i.e these variables will be shared by
     * all objects of that class. Hence, changes made to these variables through one
     * object will reflect in all objects. 
     * 3) Class variables can be referred through class name as well as object reference.
     * 
     * Instance Variables In Java : 
     * 1) Instance variables, also called as non-static
     * variables are declared without static keyword. 
     * 2) Instance variables are not
     * common to all instances of a class. Each object will maintain it’s own copy
     * of instance variables. Hence, changes made to instance variables through one
     * object will not reflect in another object. 
     * 3) Instance variables can be
     * referred only through object reference.
     */
     

	
	static int count = 10;
	
	public  StaticAndNonVariable() {// constructor- everytime we creat a new object if the variable is static
		                          // it will increment to the number of object created
		
		count++;
		System.out.println(count);
	}
	public static void main (String[] args) {

	StaticAndNonVariable one = new StaticAndNonVariable();
	StaticAndNonVariable two = new StaticAndNonVariable();
	StaticAndNonVariable three = new StaticAndNonVariable();
	StaticAndNonVariable four = new StaticAndNonVariable();
	}
}
