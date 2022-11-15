package PracticeProgram;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Org_Vtiger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().minimize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.get("http://localhost:8888/index.php?module=Accounts&action=index");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
	     
		
		List<WebElement> data = driver.findElements(By.xpath("//a[text()='Organization Name']"));
		
		for(WebElement data1: data) {
			System.out.println(data1.getText());
		}
	
	}

}
