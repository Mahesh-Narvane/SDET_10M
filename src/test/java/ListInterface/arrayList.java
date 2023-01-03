package ListInterface;

import java.util.ArrayList;

public class arrayList {

	public static void main(String[] args) {


		ArrayList l = new ArrayList();    // list l =  new ArrayList(); 
		
		l.add("s");
		l.add(2);
		l.add(0, true);
		l.add(null);  
		l.add(true);
		
		System.out.println(l);
		System.out.println(l.size());
		System.out.println(l.isEmpty());
		System.out.println(l.contains(true));
		System.out.println(l.remove(0));
		// l.clear();
		System.out.println(l);
		System.out.println(l.indexOf(true));      // it will print the first index of the object
		System.out.println(l.lastIndexOf(true));  // it will search up to last index of an array and the print the index
		System.out.println(l.get(2));
		System.out.println(l.set(0, false));


		ArrayList a = new ArrayList<>();
		//a.add(l);
		a.add("mahesh");
		System.out.println(a);


		ArrayList aa = new ArrayList<>(a);
		aa.add("narvane");
		//		aa.addAll(l);
		//	    System.out.println(aa);
		//	    System.out.println(aa.containsAll(a));
		//	 //   System.out.println(aa.removeAll(a)); // remove the object which are present in the array list
		//	    System.out.println(aa);
		//	    System.out.println(aa.retainAll(a));  // retain method will remove the object which are not same
		//	    System.out.println(aa);
		//	    System.out.println(aa.removeAll(l));
		//	    System.out.println(aa);


		aa.addAll(0, a);
		aa.add(l);
		System.out.println(aa);

		
		
		// generic Collection

		
		ArrayList<Integer> aaa = new ArrayList();
		aaa.add(22);
		aaa.add(2);
		aaa.add(0);
		aaa.add(null);  
		aaa.add(56);
		
	    System.out.println(aaa);
		
	    // to print it in a 1 by 1 manner we can use for each loop or for loop
		
	    // using for each loop
		for (Integer inte : aaa) {
			System.out.println(inte);
			
		// using for loop
		for (int i = 0; i <aaa.size(); i++) {
			System.out.println(aaa.get(i));
		}	
			
		}
	}

}
