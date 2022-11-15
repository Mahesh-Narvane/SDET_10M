package PracticeProgram;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class get_ICC_Table {

	public static void main(String[] args) {
		
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		 driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/odi");
		
			
		List<WebElement> allRows = driver.findElements(By.xpath("//div[@class='rankings-block__container full rankings-table']")); 

	
		for (WebElement row : allRows) 
		{ 
		    List<WebElement> cells = row.findElements(By.tagName("td")); 

		  
		    for (WebElement cell : cells)
		    {         

		    System.out.println(cell.getText());
		    
		    }
	}

	}
}
