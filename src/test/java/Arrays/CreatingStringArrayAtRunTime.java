package Arrays;

import java.util.Scanner;

public class CreatingStringArrayAtRunTime 
{

	public static void main(String[] args) 
	{
	
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter the size");

		int size = sc.nextInt();
		String a[]= new String[size];
		System.out.println("enter the String values inside array");


		for (int i = 0; i < a.length; i++) 
		{

			a[i]=sc.next();
		}

		System.out.println(" The values of the String array are");

		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+"  ");
		}

	}

}
