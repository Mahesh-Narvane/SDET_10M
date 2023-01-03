package COLLECTIONS;

import java.util.ArrayList;
import java.util.Collections;

public class colle {

	public static void main(String[] args) {


		ArrayList a = new ArrayList();
		a.add(2);
		a.add(10);
		a.add("mahi");
		a.add(100);
		a.add(200);
		
		System.out.println(a);
		
		
        Collections.sort(a);
        System.out.println(a);
		
		Collections.reverse(a);
		System.out.println(a);
		
		Collections.shuffle(a);
		System.out.println(a);
		
	
		System.out.println(Collections.max(a));
		
	
		System.out.println(Collections.min(a));
		
		
		
		
	}

}
