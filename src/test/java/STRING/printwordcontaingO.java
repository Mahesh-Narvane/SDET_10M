package STRING;

public class printwordcontaingO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="hello who are you";
	    String[] sp = s.split(" ");
		
		for (int i = 0; i < sp.length; i++) {
			
			if(sp[i].contains("o")) 
			{
				System.out.println(sp[i]);
			}
		}
	
		
	}

}
