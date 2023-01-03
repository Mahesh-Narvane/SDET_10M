package STRING;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		String s ="testyantra";
//		String s1="testyantra";		
//		String s2="tyss";
//		
//		s=s2;   // Reinitializing the value of s (so s stop referring to the older object and it will start referring to the object which has s2 reference)
//		System.out.println(s);
//		System.out.println(s1);
//		System.out.println(s2);
	
		
		String s= new String("mahesh");         // it will create an object inside heap  as well as String Constant Pool(SCP)
		String s1= new String("mahesh");
		String s2= new String("narvane");
//		
//		System.out.println(s==s1);                     //false
//		System.out.println(s1==s2);                    // false
//		System.out.println(s.equals(s1));              // true
//		System.out.println(s.equals(s2));              // false
//		
//		s=s2; // it will re initialize the values
//		System.out.println(s);
//		System.out.println(s2);
		
		System.out.println(s.concat(s1));       // it will concat  temporary

	}

}
