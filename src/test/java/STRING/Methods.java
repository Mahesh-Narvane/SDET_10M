package STRING;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		String s ="Mahesh";

		//	System.out.println(s.charAt(4));    // to string method is use to fetch character from string


		char[] ch = s.toCharArray();
		//	System.out.println(ch[1]);         // to print single value

		for (int i = 0; i < ch.length; i++) {

			//	System.out.print(ch[i]+" ");     // it will print whole array
		}

		String str = "i am from pune";
		//System.out.println(str.length());     // it will print the length of the string  [** length Method **]


		String ss ="mahesh";
		String sss="Mahesh";
		//System.out.println(ss.equalsIgnoreCase(sss));    // it will only compare the data ignoring cases
		//System.out.println(ss.compareTo(sss));           // it will compare ascii value  if first value is larger than second it will give +ve integer and vice Versa


		String a=" I am from Pune ";
		String t=s.trim();                 // this method will trim the whiteSpaces of string from start and end only
		//System.out.println(t);



		String m="TestYantra";
		String sub=m.substring(0, 5);      // it will gives a string which you want with the help of index (5 will act as a boundry)
		//	System.out.println(sub);
		String su=m.substring(5);          // it will gives onward string from the index we have given
		//	System.out.println(su);



		String o ="TestYantran";
		//		System.out.println(o.indexOf("Y"));       // this method will return the index of that character
		//		System.out.println(o.indexOf("an"));      // this method will also return the index of the string but it will start searching from left side only 		
		//		System.out.println(o.indexOf("a", 6));    // it will search the character from the given index only
		//		System.out.println(o.indexOf("an", 6));   // this method will also search the string from the given index only


		String lc ="TestYantra";
		//		System.out.println(lc.toLowerCase());
		//		System.out.println(lc.toUpperCase());


		String x="Testyantra";
		//		System.out.println(x.startsWith("T"));
		//		System.out.println(x.endsWith("a"));
		//		System.out.println(x.contains("y"));



		String z=" ";
		//		System.out.println(z.isEmpty());   // it will consider the space
		//		System.out.println(z.isBlank());   // and blank will not consider the spaces


		String b= "shubham";
		//		System.out.println(b.replace("h", "a"));
		//		System.out.println(b.replace("am", "oo"));
		//		System.out.println(b.replaceAll("[a-z]", "@"));
		//		System.out.println(b.replaceAll("[aeiou]", "1"));
		//		System.out.println(b.replaceFirst("h", "q"));



		String n ="shubham is in love";
		String[] xx = n.split("s");

		//	            for (int i = 0; i < xx.length; i++) {
		//					System.out.println(xx[i]);
		//				}



		int p= 10;
		String pt = String.valueOf(p);    // we can convert any data type into string by using valueOf method  
		System.out.println(pt+10);
  


		StringBuffer sb= new StringBuffer("mahesh");
		StringBuffer sb1= new StringBuffer("mahesh");
		// to compare to string in stringBuffer and StringBuilder  we use CompareTo method
		//	            System.out.println(sb.equals(sb1));                 //   .equals method and == are working same in StringBuilder and StringBuffer
		//	            System.out.println(sb.compareTo(sb1));





		
	}

}
