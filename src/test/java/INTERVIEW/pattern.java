package INTERVIEW;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//532
 
		for (int i = 1; i <=5; i++) {
			
			for(int j=1; j<=3; j++) {
				
              if((i==3&&j==3)||(i>=4&&j>=2) ) 
              {
            	  System.out.print("");
              }
              else {
            	  System.out.print("*");
              }

			}
			
			
			System.out.println();
			
		}
		
	}

}