package Arrays;

public class RotateArrayWithKeyValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]= {1,2,3,4,5};  
		int key=4;  //{5,1,2,3,4}       // key=4 is nothing but it will iterate that loop 4 times

		for (int i = 0; i < key; i++) {

			int temp=a[0];                        // storing the first value in a temp varaible
			for (int j = 1; j <a.length; j++) {

				a[j-1]=a[j];            //     here we are passing previous value to the next index

			}
			a[a.length-1]=temp;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}

		
	}

}
