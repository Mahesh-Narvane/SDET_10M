package INTERVIEW;

public class CountOfWordWhichHasMaxCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str=" i am a java developer";
	            String[] ch = str.split("\\s");
	            int max=0;
	            for (int i = 0; i < ch.length; i++) {
	            	
	            	if(ch[i].length()>max) 
	            	{
	            		max=ch[i].length();
	            	}
	            }
	            System.out.println(max+" ");
					
			}
}