package OOPConceptsPart1;

public class LocalVsGlobalVariables {

	//Global variables -- Class Variable
	String name = "Jhon";
	int age = 24;
	
	public static void main(String[] args) {
	
		int i = 10; // Local variable for main method
		System.out.println(i);
		LocalVsGlobalVariables obj = new LocalVsGlobalVariables();
		System.out.println(obj.name);
		System.out.println(obj.age);
		
	}
	
	public void sum() {
		int i = 15; // Local variable for sum method
		int j = 20;
		int age = 24;
	}

}
