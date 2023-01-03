package Arrays;

public class RotationArray {

	
	public static void main(String[] args) {
		
		
		int [] a = {1,2,3,4,5};
		int k=3;
		
		for (int i = 0; i < k; i++) {
			
			int temp=a[0]; //1
			
			for (int j = 1; j < a.length; j++) {
				
				a[j-1]=a[j];
				
				k++;				
			}
			a[a.length-1]=temp;
			
		}
		for (int i = 0; i < a.length; i++) {
			
			System.out.println(a[i]);
		}
		
	}
}
