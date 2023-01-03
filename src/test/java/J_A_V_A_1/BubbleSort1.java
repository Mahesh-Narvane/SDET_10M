package J_A_V_A_1;

public class BubbleSort1 {

	public static void main(String[] args) {


		int [] a= {2,5,1,0,9,7,12};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if((i==0 && j==3) || (i==5 && j==6)|| (i==3 && i==5) ) {
					
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
				
			}
			
		}
		for (int i = 0; i < a.length; i++) {
			
			System.out.print(a[i]+ " ");
			
		}
	}

}
