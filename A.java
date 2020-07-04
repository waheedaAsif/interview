package interview;

public class A {

	
		String s;
		int i;
		
	public A () {
		s = "";
		i = 0;
			
	}
	public A(String news, int newi) {
		s = news;
		i = newi;
			
	}
	public String gets() {
		return s;
	}
		
	public int geti() {
		return i;
		
	}
	
	public void sets(String news) {
		this.s = news;
		
	}
	public void seti(int newi) {
		this.i = newi;
	}
	}


