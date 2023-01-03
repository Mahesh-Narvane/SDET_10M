package J_A_V_A_1;

public class TwoMaxFromArrayUsingBubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] a = {5,0,8,1,9,14,7};
		
		int Fmax=a[0];
		int Smax=a[0];
		
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]>Fmax) {
				
				Smax=Fmax;
				Fmax=a[i];
			}
			else if (a[i]>Smax) {
				
				Smax=a[i];
				
			}
			
		}
		System.out.println(Smax+ "\n"+Fmax);
		
	}

}
