package online_B_A;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import GenericUtilities.BaseClass;

public class demo extends BaseClass{

	
	
	@Test
	public void creatcontact() 
	{
		System.out.println(" contact get created");
		Assert.assertEquals(false, true);
		
		throw new SkipException("skip");
	}
	
	
	public void creatcontactwithemail() 
	{
		System.out.println(" contact get created with email");
		Assert.assertEquals(true, true);
	}
}
