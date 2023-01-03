package OOPS;

interface person 
{

	
	void display();

}

 class male implements person
 {

	 public void display() 
	 {
		 System.out.println(" print male as a output");
	 }
 
	}
 
 class female implements person
 {
	 public void display() 
	 {
		 System.out.println(" display female as output");
	 }
 }
 
 public class Interface_Demo_Code{
	 
	      public static void main(String[] args) {
			
	    	  person p1 = new male();
	    	  person p2 = new female();
	    	  
	    	  p1.display();
	    	  p2.display();
	  	  
		}
	 
	// this way we van achieve 100% abstraction by using interface 
	    
	      
	      
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 