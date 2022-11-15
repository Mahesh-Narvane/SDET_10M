package PracticeProgram;

import java.util.Scanner;

public class Assign2 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.next();
		
		int uppercase=0;
		int lowercase=0;
		int digit=0;
		int splcharacter=0;
		char ch;
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			if(ch>='A'&& ch<='Z')
			
				uppercase++;
			
			else if(ch>='a'&& ch<='z')
			
				lowercase++;
			
			else if(ch>='0'&& ch<='9')
			
				digit++;
				else
					splcharacter++;
			}
		if(str.length()>=8&&uppercase>0&&lowercase>0&&digit>0&&splcharacter>0)
		{
			System.out.println("You enterd a valid String");
		}
		else
		{
			System.out.println("You entered a invalid String");
		}
			




	}

}
