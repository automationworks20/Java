package OOPConceptsPart1;

public class MethodOverloading {

	// Duplicate methods are not allowed in Java. We cannot create method inside a method.
	// Methods with same name but different input parameters or different data types is allowed
	
	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(4, 6);

	}
	
	// Method Overloading -- When the method name is same with different arguments or input parameters within the same class.
	public void sum() {
		System.out.println("Sum method -- zero parameter");
	}
	
	public void sum(int i) {
		System.out.println("Sum method -- one parameter");	
		System.out.println(i);
	}
	
	public void sum(int i, int j) {
		System.out.println("Sum method -- two paramters");
		System.out.println(i+j);
	}

}
