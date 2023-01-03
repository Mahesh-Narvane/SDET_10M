package INTERVIEW;

public class BubbleSortAssenDessen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] a= {2,0,9,4,1,3};
		
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = i+1; j < a.length; j++) {
				
				if(a[i]>a[j]) {
					
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
			
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+ " ");
			
			
		}
		System.out.println();
		System.out.println(a[a.length-1]);
		System.out.println(a[a.length-2]);
	}

}
