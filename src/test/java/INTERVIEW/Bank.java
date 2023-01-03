package INTERVIEW;

class Parent
{     
	
	void car() 
	{
		System.out.println(" blue car");
	}
	
	
}

class child extends Parent 
{
       
	 void car() 
	{
		System.out.println("white car");
	}
	
	 public static void main(String[] args) {
		
		 child c = new child();
		 c.car();
	}

}




















