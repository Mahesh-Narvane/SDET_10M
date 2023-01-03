package Arrays;

public class EvenAndOddPositionSumProgram {

	public static void main(String[] args)
	{


		int a[]= {1,2,3,4,5};
		int Esum=0;
		int Osum=0;


		for (int i = 0; i < a.length; i++) {

			if(i%2==0)
			{
				Esum=Esum+a[i];
			}
			else 
			{
				Osum=Osum+a[i];
			}

		}

		System.out.println("Even sum is  "+Esum+" "+"Odd sum is  "+Osum);

		}

	}


