package INTERVIEW;

public class getMaxWithoutBubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int[] a= {2,0,1,9,5};
		int max=0;
		
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]>max) 
			{
				max=a[i];
			}
			
		}
		System.out.println(max);
	}

}
