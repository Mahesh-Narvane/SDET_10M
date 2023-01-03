package J_A_V_A_1;

public class getMaxValuewithoutBubbuleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int []a= {2,0,1,5,9,8,1,60};
		
		int max=a[0];
		
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]>max) {   // to take minimum value just reverse the condition {a[i]<max}
				
				max=a[i];
				
			}
			
		}
		System.out.println(max);

	}

}
