package J_A_V_A_1;

public class BubbleSortMAXMIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int [] a= {2,5,1,0,9,7,12};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if(a[i]<a[j]) {  // for min value take descending order
					
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
		System.err.println(a[a.length-1]);    
	}

	}


