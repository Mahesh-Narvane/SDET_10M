package Wrapper_Class;

public class Unboxing {

	
	public static void main(String[] args) {
		
		
		Integer a =100;
		
		int i = a.intValue(); // it is unboxing converting object type to primitive type
		
		int j=a; // it is autoUnboxing no need to call method compiler implicitly call the method
		
		
		System.out.println(i+" "+j);
		
		
		
	}
	
	
	
}
