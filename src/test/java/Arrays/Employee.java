package Arrays;

public class Employee {
	
	
	String name;
	int id;
	double sal;
	
	Employee(String name,int id,double sal)   // constructor to initialize global values
	{
		this.name=name;
		this.id=id;
		this.sal=sal;
	}

	public static void details(Employee empdetails[])   
	
	{
		
		for (int i = 0; i < empdetails.length; i++)
		{
			
			System.out.println(empdetails[i].name+" "+empdetails[i].id+" "+empdetails[i].sal);
		}
		
	}

	public static void main(String[] args)
	{
				
		Employee e []= new Employee[3];

		e[0]=new Employee("s",001,1000.2);
		e[1]=new Employee("m",002,2000.2);
		e[2]=new Employee("t",003,3000.2);
        details(e);


//		for (int i = 0; i < e.length; i++) {
//
//			System.out.println(e[i].name+" "+e[i].id+" "+e[i].sal);
//
//		}
		
		
	}

}
