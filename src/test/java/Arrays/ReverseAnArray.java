package Arrays;

public class ReverseAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,3,8,2,6};
		int start=0;
		int end=a.length-1;
		
		for (int i = 0; i < a.length; i++) {
			
			if(start<end) {
					int temp=a[start];
					a[start]=a[end];
					a[end]=temp;
					start++;
					end--;
				}	
			}			
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]);
		}		
	}

}
