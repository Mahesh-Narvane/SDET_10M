package Arrays;

import java.util.Scanner;

public class CreatingIntArrayAtRunTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println(" enter the size ");
		int size = sc.nextInt();
		
        int a[]=new int[size];                            // Declaring the size of array
        System.out.println(" enter the values");
        
        for (int i = 0; i < a.length; i++) {
			
        	a[i]=sc.nextInt();                            // to iterate over the loop and store the values in array
		}

        System.out.println("The values of the array are");

        for (int i = 0; i < a.length; i++) {
			
        	System.out.print(a[i]+" ");
		}
		
		
	}

}
