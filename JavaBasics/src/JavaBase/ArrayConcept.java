package JavaBase;

public class ArrayConcept {

	public static void main(String[] args) {

	//array: to store similar data types in array variable
	//lowest boundary = 0
	//highest boundary = n-1 (where n is size of array)
	
	//1. int array
	int i[]= new int[4]; //4 is size of array
	i[0]=10;
	i[1]=20;
	i[2]=30;
	i[3]=40;
	
	System.out.println(i[2]);
	//System.out.println(i[4]); IndexOutOfBoundException
	 
	System.out.println(i.length);
	
	for(int j=0; j< i.length; j++) {
		System.out.println(i[j]);
	}
	
	
	//2. double array
	double d[]= new double[3];
	d[0]=11.12;
	d[1]=32.12;
	d[2]=44.32;
	
	System.out.println(d[1]);
	
	//3. char array
	char c[]= new char[2];
	c[0] = 'a';
	c[1] = '$';
	
	//4. boolean array
	boolean b[] = new boolean[2];
	b[0] = true;
	b[1] = false;
	
	//5. string array
	String s[] = new String[2];
	s[0] = "Hello World";
	s[1] = "Jane Doe";
	
	System.out.println(s.length);
	
	//6. object array (Used to store different data types values)
	Object ob[] = new Object[6];
	ob[1] = "Jhon";
	ob[2] = 25;
	ob[3] = 12.33;
	ob[4] = "Doe";
	ob[5] = "Male";
	
	System.out.println(ob[5]);
	
 }

}
