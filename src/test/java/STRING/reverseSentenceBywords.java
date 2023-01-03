package STRING;

public class reverseSentenceBywords {

	public static void main(String[] args) {

           String s=" khatm ta ta bye bye";
          String[] sp = s.split(" ");
           String ss="";

           for (int i = 0; i < sp.length; i++) {
			
        	   ss=sp[i]+" "+ss;
		}
           System.out.println(ss);
	}

}
