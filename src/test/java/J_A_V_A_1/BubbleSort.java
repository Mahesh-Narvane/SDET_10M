package J_A_V_A_1;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a= {2,5,1,8,12,4,3};
		
		for(int i=0; i<a.length; i++) {
			
			for(int j=i+1; j<a.length; j++) {
				
				if(a[i]>a[j]) {
					
					int temp= a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
				
			}
			
		}
           for(int i=0;i<a.length;i++) {
        	   
        	   System.out.println(a[i]+ " ");
           }
	}

}
