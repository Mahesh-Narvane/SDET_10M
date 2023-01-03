package INTERVIEW;

import java.util.Iterator;

public class pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int row = 1; row <5; row++) {
			
			
			for (int spaces = 0; spaces<row-1; spaces++) {
				
				System.out.print("  ");
			}
			for (int col = row; col>=1; col--) {
				
				System.out.print(col+"");
				
			}
			for (int col = 2; col <=2; col++) {
				
				System.out.print(col);
			}
			
		}
		System.out.println("");
 
	}

}
