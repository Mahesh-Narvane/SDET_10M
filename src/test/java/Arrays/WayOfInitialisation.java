package Arrays;

import java.util.Iterator;

public class WayOfInitialisation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [] b= {2,1,0,0,5,3};  // Initialization && declaration  1
		
		int [] c= new int[5];  // using new keyword
		c[0]=1;
		c[1]=2;                                          //  length of array = 5
		c[2]=3;                                          // index of the array is always  length-1
		c[3]=4;
		c[4]=5;
		
//		System.err.println(c[0]);          //System.out.println(c); == we cant print array by using reference cause it will show adress only
//		System.err.println(c[1]);
//		System.err.println(c[2]);
//		System.err.println(c[3]);
//		System.err.println(c[4]);
		
	     for (int i = 0; i < c.length; i++) {
			
	    	 System.out.print(c[i]+" ");
		}
		
		
	}

}
