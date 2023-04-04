package JavaBase;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList(); // No need to define the size. Values of any Data Type can be added
		
		ar.add(100);
		ar.add(200);
		ar.add(300);
		
		System.out.println(ar.size());
		
		ar.add("Tom"); 
		ar.add('c');
		ar.add(12.33);
		
		
		System.out.println(ar.size()); //6
		ar.remove(5);
		System.out.println(ar.size()); //5
		
		System.out.println(ar.get(4));
		// System.out.println(ar.get(7)); IndexOutOfBoundsException
		
		// Print all the values of Array
		
		for(int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		// Integer Array List
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar.add(100);
		
		// String Array List
		ArrayList<String> ar2 = new ArrayList<String>();
		ar.add("Jhon");
				
	}

}
