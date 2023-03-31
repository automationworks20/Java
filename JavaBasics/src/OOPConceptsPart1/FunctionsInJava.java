package OOPConceptsPart1;

public class FunctionsInJava {

	public static void main(String[] args) {

		FunctionsInJava obj = new FunctionsInJava();
		// one object will be created and obj is the reference variable referring to this object
		// after creating the object, a copy of all non static methods will be given to this object
		
		obj.test();
		int l = obj.pqr();
		System.out.println(l);
		String k = obj.qa();
		System.out.println(k);
		int div = obj.div(20, 10);
		System.out.println(div);
		
	}
	
	// Non static methods
	
	// void -- does not return any value
	
	public void test() { // No input no output
		System.out.println("Test Method");
	}
	
	// return type needs to be mentioned i.e int
	public int pqr() { // No input and some output
		System.out.println("PRQ Method");
		int a = 10;
		int b = 20;
		int c = a+b;
		
		return c;
 	}
	
	public String qa() { // No input and some output
		System.out.println("QA Method");
		String s = "Selenium";
		
		return s;
	}
	
	public int div(int x, int y) { // x and y are input arguments/parameters
		System.out.println("Division Method");
		int d = x/y;
		
		return d;
		
	}
	
}
	