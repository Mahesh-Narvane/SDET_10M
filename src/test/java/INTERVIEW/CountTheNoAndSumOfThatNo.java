package INTERVIEW;

public class CountTheNoAndSumOfThatNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num =12345;
	int	count=0;
	int sum=0;
	int rev=0;
	
	
	while(num>0) {	
		rev=num%10;
		num=num/10;
		sum=sum+rev;
		count++;
	}
	
		System.out.println(sum+" "+count);
	}

}
