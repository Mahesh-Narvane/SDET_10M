package Arrays;

public class demoq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int []a= {9,8,2,12,1};
		
		boolean status = true;
		
		for (int i = 0; i <=15; i++) {
			
			for (int j = 0; j < a.length; j++) {
				
				if(i==a[j]) 
				{
					status=false;
					break;
				}
			}
			if(status==true) 
			{
				System.out.print(i+" ");
			}
			status=true;
		}
		
		
	}
}
