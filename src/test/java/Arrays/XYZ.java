package Arrays;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class XYZ {



	public static void main(String[] args) {



		//		
		//		int a [] = {1,1,2,2,3,3,1,4,5,5,8};
		//		Arrays.sort(a);
		//		int fcount=0;
		//		
		//		for (int i = 0; i < a.length; i++) {
		//			
		//			int count=1;
		//			
		//			for (int j = i+1; j < a.length; j++) {
		//				
		//				if(a[i]==a[j]) 
		//				{
		//					count++;
		//				
		//				}
		//				
		//			}
		//			if(count>1) 
		//			{
		//				fcount++;
		//			}
		//		}
		//		System.out.println(Arrays.toString(a)+" "+fcount);
		//		



		//		String s= "aaacccbbbddd";
		//		int fcount=0;
		//		
		//		
		//		for (int i = 0; i < s.length(); i++) {
		//			
		//			int count=0;
		//			
		//			for (int j = i+1; j < s.length(); j++) {
		//				
		//				if(s.charAt(i)==s.charAt(j)) 
		//				{
		//					count++;
		//				}
		//			}
		//			if(count>1) 
		//			{
		//				fcount++;
		//			}
		//		}
		//		
		//		System.out.println(s+" "+fcount);
		//		





		//		String s="aabbcchhffsddsaa";
		//    	char[]ch=s.toCharArray();
		//		String s1="";
		//		
		//		
		//		
		//		for (int i = 0; i < ch.length; i++) {
		//			
		//			char cha =ch[i];
		//			
		//			if(s1.indexOf(cha)==-1) 
		//			{
		//				s1=s1+cha;
		//			}
		//		}
		//		System.out.println(s1);
		//		

		// remove duplicate from array

		//		int a[]= {0,1,1,2,3,4,2,1,5};
		//		
		//		
		//		for (int i = 0; i < a.length; i++) {
		//			
		//			for (int j = i+1; j < a.length; j++) {
		//				
		//				if(a[i]>a[j]) 
		//				{
		//					int temp=a[i];
		//					a[i]=a[j];
		//					a[j]=temp;
		//					
		//				}
		//			}			
		//		}
		//		for (int i = 0; i < a.length; i++) {
		//			
		//			//System.out.println(a[i]);
		//		}
		//		
		//		
		//		
		//		int k=0;
		//		
		//		for (int i = 0; i < a.length-1; i++) {
		//			
		//			if(a[i]!=a[i+1]) 
		//			{
		//				a[k]=a[i];
		//				k++;
		//			}
		//		
		//		}
		//		a[k]=a[a.length-1];
		//		
		//		for (int i = 0; i <=k; i++) {
		//			
		//			System.out.print(a[i]);
		//		}
		//		



		//		int a[]= {1,2,3,4,5,6,7,8,9};
		//		
		//		
		//		for (int i = 0; i < a.length; i++) {
		//			boolean isprime =true;
		//			
		//			for (int j = 2; j < i; j++) {
		//				
		//				if(i%j==0) 
		//				{
		//					isprime=false;
		//					break;
		//				}
		//			}
		//			if(isprime) 
		//			{
		//				System.out.println(a[i]);
		//			}
		//			
		//		}






		//		int a[] ={1,1,2,2,3,4,1,5,2};
		//		//Arrays.sort(a);
		//		
		//		for (int i = 0; i < a.length; i++) {
		//		
		//			for (int j = i+1; j < a.length; j++) {
		//				
		//				if(a[i]>a[j]) 
		//				{
		//					int temp=a[i];
		//					a[i]=a[j];
		//					a[j]=temp;
		//					
		//				}
		//			}			
		//		}
		//		for (int i = 0; i < a.length; i++) {
		//			
		//			//System.out.println(a[i]);
		//		}
		//				
		//		int k=0;
		//		
		//	      for (int i = 0; i < a.length-1; i++) {
		//			
		//	    	  if(a[i]!=a[i+1]) 
		//	    	  {
		//	    		a[k]=a[i];
		//	    		k++;
		//	    	  }
		//	    	  a[k]=a[a.length-1];
		//			}
		//	      
		//	      for (int i = 0; i <=k; i++) {
		//			
		//	    	  System.out.print(a[i]);
		//		}
		//	      
		//		}
		//	






		//		int a[] = {1,2,3,5,4};
		//		boolean status=true;
		//		for (int i = 0; i <=10; i++) {
		//			
		//			for (int j = 0; j < a.length; j++) {
		//				
		//				if(i==a[j]) 
		//				{
		//					status=false;
		//					break;
		//				}
		//				
		//			}
		//			
		//			if(status==true) 
		//			{
		//				System.out.println(i);
		//			}
		//			status=true;
		//		}




		//		String s="aabshdvkjaac";
		//		
		//		char[] ch=s.toCharArray();
		//		
		//		for (int i = 0; i < ch.length; i++) {
		//			int count=0;
		//			
		//			for (int j = i+1; j < ch.length; j++) {
		//				
		//				if(ch[i]!=ch[j]) 
		//				{
		//					count++;
		//				}
		//			}
		//			if(count<=1) 
		//			{
		//				System.out.println(ch[i]);
		//			}
		//	}



		//		 String s ="welcome to india welcome to goa";
		//		 String [] ch=s.split(" ");
		//		
		//		
		//		LinkedHashSet<String> l = new LinkedHashSet();
		//		
		//		for (int i = 0; i < ch.length; i++) {
		//			
		//			l.add(ch[i]);
		//		}
		//		
		//		
		//		for (String str : l) {
		//			
		//			 int count=0;
		//			for (int i = 0; i < ch.length; i++) {
		//				
		//				if(str.equals(ch[i])) 
		//				{
		//					count++;
		//				}
		//			}
		//			if(count==1) 
		//			{
		//				System.out.println(str+" "+count);
		//			}
		//			
		//		}



		//		int a[] = {1,2,3,4};
		//		int b[] = {1,2,3};
		//		
		////		int length=b.length;
		////		if(a.length>b.length) 
		////		{
		////			length=a.length;
		////		}
		//	
		//		for (int i = 0; i < a.length; i++) {
		//			
		//			try 
		//			{
		//				System.out.println(a[i]+b[i]);
		//			}
		//			catch(Exception e) 
		//			{
		//				if(a.length>b.length) 
		//				{
		//		             System.out.println(a[a.length-1]);			
		//				}
		//			}
		//		}
		//		


		//		String s="i am from hyd";
		//		char[] ch=s.toCharArray();
		//		
		//		String sub = s.substring(0, 1);
		//		String sub1 = s.substring(10, 13);
		//		
		//		for (int i = 0; i < ch.length; i++) {
		//			
		//			for (int j = 0; j < ch.length; j++) {
		//				
		//
		//				if(i==0 || i==10) 
		//				{
		//					char temp=ch[i];
		//					ch[i]=ch[j];
		//					ch[j]=temp;
		//				}
		//		}
		//			System.out.print(ch[i]+" ");
		//		
		//		}
		//		


		//		            String s="i am from hyd";
		//		            String []sp=s.split(" ");
		//		
		//
		//                   for (int i = 0; i < sp.length; i++) {
		//					
		//                	  // System.out.print(sp[i]);
		//				}
		//		            
		//		            
		//		            for (int i = 0; i < sp.length; i++) {
		//						
		//		            	for (int j = 0; j < sp.length; j++) {
		//							
		//		            		
		//		            		if(i==0  || i==7 ) 
		//		            		{
		//		            			String temp=sp[i];
		//		    					sp[i]=sp[j];
		//		    					sp[j]=temp;
		//		            		}
		//		            		
		//						}
		//		            	System.out.print(sp[i]+" ");
		//					}








		//		       String s1="abc";
		//		       String s2="abc";
		//		       
		//		       System.out.println(s1==s2);
		//		


		//		   		try {
		//		   			throw new IOException("Hello");
		//		   		} catch( Exception e) {
		//		   			System.out.println(e.getMessage());
		//		   		}
		//		   	}




		//		      foo(1000);
		//	}
		//		public static void foo(Object o) 
		//		{
		//			System.out.println("object");
		//		}
		//		
		//		public static void foo(String s) 
		//		{
		//			System.out.println("String");
		//		}
		//		


		//		     int a =10;
		//		     int b =20;
		//		    
		//		     a=a^b;
		//		     b=a^b;
		//		     a=a^b;
		//		
		//		     System.out.println(a+" "+b);


		//		int num=5;
		//		
		//		for (int i = 1; i <=10; i++) {
		//			
		//			
		//			System.out.println(num+"*"+i+" = "+(num*i));
		//			
		//		}
		//		







		//		int n=12;
		//		boolean flag=true;
		//		for (int i = 2; i <n; i++) {
		//			
		//			if(n%i==0) 
		//			{
		//				flag=false;
		//				break;
		//			}
		//			
		//		}
		//		if(flag==true) 
		//		{
		//			System.out.println("is prime");
		//		}
		//		else 
		//		{
		//			System.out.println("not prime");
		//		}



		//		int i =30;
		//		
		//		while(i>=5) 
		//		{
		//			System.out.println(i);
		//			i--;
		//		}


		// palindrome no

		//		int num=1221;
		//		int rev=0;
		//		int rem=0;
		//		int temp=num;
		//		while(num!=0) 
		//		{
		//			rev=num%10;  // 1
		//			num=num/10;  //122
		//			rem=rem*10+rev;  // 0+1
		//		}
		//		if(temp==rem) 
		//		{
		//			System.out.println("is palindrome");
		//		}
		//		else 
		//		{
		//			System.out.println(" is not palindrome");
		//		}


		// armstrong no


		//		
		//		int num=153;
		//		int temp=num;
		//		int rem=0;
		//		int rev=0;
		//		
		//		while(num!=0) 
		//		{
		//			rem=num%10;
		//			num=num/10;
		//			rev=rev+(rem*rem*rem);
		//		}
		//		if(temp==rev) 
		//		{ 
		//			System.out.println("is armstrong");
		//		}
		//		else {
		//			System.out.println("is not armstrong");
		//		}
		//		

		// do while loop



		//		int num=100;
		//		do 
		//		{
		//			System.out.println(num);
		//			num++;
		//		}
		//		while(num<110) ;
		//		



		// print the middle element of a integer




		//		int a =1231456;
		//		
		//		String s = Integer.toString(a);
		//		
		//		int m = s.length()/2;
		//		
		//		System.out.println(s.charAt(m));
		//		
		//		

		//		
		//		String s = "testyantra";
		//		
		//		LinkedHashSet<Character> l = new LinkedHashSet();
		//		
		//		for (int i = 0; i < s.length(); i++) {
		//			
		//			l.add(s.charAt(i));
		//		}
		//		
		//		for (Character ch : l) {
		//			
		//			int count=0;
		//			for (int i = 0; i < s.length(); i++) {
		//				
		//				if(ch.equals(s.charAt(i))) 
		//				{
		//					count++;
		//				}
		//			}
		//			
		//			if(count>1) 
		//			{
		//				System.out.println(ch+" "+count);
		//			}
		//			



		//		     String s = "aabbddaa";
		//		    char[]ch= s.toCharArray();
		//		     int Frecount=0;
		//		 
		//		     for (int i = 0; i < ch.length; i++) {
		//		    	int count=1;
		//		    	 for (int j = i+1; j < ch.length; j++) {
		//					
		//		    		 
		//		    		 if(ch[i]==ch[j]) 
		//		    		 {
		//		    			 count++;
		//		    			 i++;
		//		    		 }
		//		   	 
		//				}
		//		    	
		//		    	 if(count>1) 
		//			     {
		//			    	 Frecount++;
		//			     }
		//		    	 
		//			}
		//		     
		//		    
		//		System.out.println(s+" "+Frecount);
		//		




		//		     int a[]= {1,2,3,3,4,4,5,5,0,1,1,6};
		//		     int fcount=0;
		//		
		//		
		//		     for (int i = 0; i < a.length; i++) {
		//				int count=0;
		//				for (int j = i+1; j < a.length; j++) {
		//					
		//					if(a[i]==a[j]) 
		//					{
		//						count++;
		//					}
		//				}
		//				if(count>1) 
		//				{
		//					fcount++;
		//				}
		//			}
		//		     System.out.println(Arrays.toString(a)+" "+fcount);
		//		



		// print prime no from 1 to 15



		//		    for (int i = 1; i <=15; i++) {
		//		    	 int count=0;
		//		    	for (int j =1; j <=i; j++) {
		//					
		//		    		if(i%j==0) 
		//		    		{
		//		    			count++;
		//		    		}
		//				}
		//		    	if(count==2) 
		//		    	{
		//		    		System.out.println(i);
		//		    	}
		//			}



		//		 int a []= {1,2,3,4,5,6};  //  {1,6,2,5,3,4}
		//		
		//		 for (int i = 0; i < a.length; i++) { // 163452 //162453
		//			
		//			 for (int j = i+1; j < a.length; j++) {
		//				
		//			 if(a[i]>a[j]) 
		//			 {
		//				 int temp=a[i];
		//				 a[i]=a[j];
		//				 a[j]=temp;
		//				 break;
		//				
		//			 }
		//			 else if (a[i]<a[j]) 
		//			 {
		//				 int temp=a[i];
		//				 a[i]=a[j];
		//				 a[j]=temp;
		//				
		//				 
		//			 }
		//		}
		//			 System.out.print(a[i]+" ");
		//		 }


		String s= "shubham";
		char [] ch=s.toCharArray();

		char temp=ch[0];
		ch[0]=ch[4];
		ch[4]=temp;

		for (int i = 0; i < ch.length; i++)
		{
			System.out.print(ch[i]+" ");
		}

		






















	}

}





