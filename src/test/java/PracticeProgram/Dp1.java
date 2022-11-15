package PracticeProgram;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
public class Dp1 {

	
            
		   @Test(dataProvider = "getdata3")
		   public void test1(String src)
		   {
			   System.out.println(src+ " ");
		   }
		  
		   
		   @DataProvider
		   public Object[] [] getdata1(){
			   
			   Object[][] data = new Object[3][2];
			   
			   data[0] [0] = "hyd";
			   data[0] [1] = "del";
			   
			   data[1] [0] = "bom";
			   data[1] [1] = "cnn";
			   
			   data[2] [0] = "goi";
			   data[2] [1] = "kol";
			   
			   return data;
		   } 
		   
		   @DataProvider
		   public String[][] getdata2() {
			   
			   String[][] data=new String[][] {  {"bom","cnn"}, {"pune","goa"}   };  
				 return data;  
			   
		   }
		   
		   @DataProvider
		   public String[] getdata3() {
			   
			   String[] data=new String[] {  "bom","cnn","pune","goa"  };  
				 return data;  
			   
		   }
		
		}
	
 

