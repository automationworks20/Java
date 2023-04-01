package Inheritance;

public class TestCar {

	public static void main(String[] args) {

		// Static or compile time polymorphism
		BMW b = new BMW();
		b.start(); // It call child class method and not parent class
		b.stop(); // It will inherit from Car Class
		b.refuel(); 
		b.theftSafety(); 
		b.engine();
		
		System.out.println("****************");
		
		// Top Casting
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		//c.theftSafety(); Cannot be called as this is BMW Class method
		
		System.out.println("****************");

		Car c1 = new BMW(); //Child can be referred by Parent class reference variable and is called Dynamic or Run Time Polymorphism
		c1.start();
		c1.stop();
		c1.engine();
		
		// Down Casting is possible but will give ClassCastException at run time
		// BMW b1 = (BMW)new Car(); 
 	}

}
