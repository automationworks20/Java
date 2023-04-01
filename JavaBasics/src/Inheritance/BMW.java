package Inheritance;

public class BMW extends Car { // Has a relationship
	
	//Method overriding - When same method is present in parent as well as child class with the same name and same parameters
	
	public void start() { // Overriden Method
		System.out.println("BMW start Method");
	}
	
	public void theftSafety() {
		System.out.println("BMW theft safety method");
	}

}
