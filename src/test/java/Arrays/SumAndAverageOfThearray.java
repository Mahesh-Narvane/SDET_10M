package Arrays;

public class SumAndAverageOfThearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] a= {1,10,2,5,8,3};
		
		int sum=0;
		double avg=0.0;
		
		for (int i = 0; i < a.length; i++) {
			
			sum=sum+a[i];
		}
		System.out.println("sum of an array is  "+sum);   // print the sum
		avg=sum/a.length;
		System.out.println("avg of an array is  "+avg);   // print the average of the array
		
		
	}

}
