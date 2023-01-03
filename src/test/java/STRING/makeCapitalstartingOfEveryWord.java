package STRING;

public class makeCapitalstartingOfEveryWord {

	public static void main(String[] args) {
	
		
		String s="welcome to india";
		String []sp = s.split(" ");
		String Capital="";
	
		for (String word : sp) {
			
			String After = word.substring(0, 1).toUpperCase()+word.substring(1);
			Capital=Capital+After+" ";
		}
		System.out.println(Capital+" ");
		
	}

}
