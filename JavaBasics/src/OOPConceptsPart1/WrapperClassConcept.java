package OOPConceptsPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		
		// Data conversion for Integer, Double, Boolean, String
		// No wrapper class for Character
		
		String x = "100";
		System.out.println(x+20); //10020
		
		// String to Integer
		int i = Integer.parseInt(x);
		System.out.println(i+20); //120
		
		//String to Double
		String y = "12.33";
		double d = Double.parseDouble(y);
		System.out.println(d+20); //32.33
		
		//String to Boolean
		String z = "true";
		Boolean b = Boolean.parseBoolean(z);
		System.out.println(b); //true
		
		// Integer from String
		
		int j = 200;
		System.out.println(j+20); //220
		
		String s= String.valueOf(j);
		System.out.println(s+20); //20020
		
		// String u = "100A";
		// Integer.parseInt(u); It will give number format exception
	}

}
