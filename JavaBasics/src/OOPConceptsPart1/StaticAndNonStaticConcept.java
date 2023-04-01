package OOPConceptsPart1;

public class StaticAndNonStaticConcept {
	
	String name = "Jhon"; // Non static global variable
	static int age = 25; // Static global variable

	public static void main(String[] args) {
		//2 ways to call static methods and variables -
		sum(); // Direct calling 
		StaticAndNonStaticConcept.sum(); // Calling by class name
		System.out.println(StaticAndNonStaticConcept.age);
		
		//How to call non static method
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		System.out.println(obj.name);
		obj.sendMail();
	}

	public void sendMail() { // Non static method
		System.out.println("Send mail method");
	}

	public static void sum() { // Static method
		System.out.println("Sum method");
	}
	
}
