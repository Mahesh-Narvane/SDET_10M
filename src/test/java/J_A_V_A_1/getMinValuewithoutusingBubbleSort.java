package J_A_V_A_1;

public class getMinValuewithoutusingBubbleSort {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int []a= {2,0,1,5,9,8,1,60};
		
		int min=a[0];
		
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]<min) {   // to take minimum value just reverse the condition {a[i]<max}
				
				min=a[i];
				
			}
			
		}
		System.out.println(min);

	}


}
