package OOPS;



public class Encap_Demo_Code {

	
	private String str;
	private int id;

	 Encap_Demo_Code()  // if we make a constructor as a final then its objects are only accessible within the class 
	{
		this.str=str;
		this.id=id;

	}
	public String getStr() 
	{
		return str;
	}

	public int getId() 
	{
		return id;
	}

	public void setStr(String str) 
	{
		this.str=str;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
	public static void main(String[] args) {
		
		
		Encap_Demo_Code e = new Encap_Demo_Code();
		e.setId(100);
		e.setStr("mahesh");
		
		
		System.out.println("ID of the candidate    "+e.getId());
		System.out.println(" Name of candidate   "+e.getStr());
		
	}
	
	
	
}
