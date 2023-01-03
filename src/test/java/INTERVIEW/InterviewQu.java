package INTERVIEW;

import java.util.Arrays;

public class InterviewQu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		char ch[]= {'a','b','$','x','*','y','y'};
        int start=0;
        int end=ch.length-1;
        
        for (int i = 0; i < ch.length; i++) {
			
        	if(start<end)
        	{
        		char temp=ch[start];
        		ch[start]=ch[end];
        		ch[end]=temp;
        		start++;
        		end--;
        	}
		}
        System.out.print(Arrays.toString(ch));
	}

}
