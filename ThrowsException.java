package interview;

public class ThrowsException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// throws is used with method chaining
				/*
				 * 1) throws is used to declare the exception. it gives an information to the
				 * caller method that there may occur an exception so it is better for the
				 * caller method to provide the exception handling code so that normal flow can
				 * be maintained.
				 */
				/*
				 * 2) if we call a method that declares an exception, we must either handle the
				 * exception using try catch block or declare the exception using throws keyword
				 * or say if there is any checked exception, we will get compile time error
				 * saying”unreported exception xxx must be caught or declared to be thrown”. To
				 * prevent this compile time error we can handle the exception in two ways: 1.
				 * By using try catch 2. by using throws keyword.
				 */
				/*
				 * 3) throws keyword used to declare the checked exceptions only. if there
				 * occurs any unchecked exception such as NullPointerExcepotion, it is
				 * programmers fault that he is not performing check up before the code being
				 * used.
				 */
		
	}}	