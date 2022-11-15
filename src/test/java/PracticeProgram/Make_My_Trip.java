package PracticeProgram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Make_My_Trip {

	public static void main(String[] args) {
		
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://www.makemytrip.com/");
		 
		 WebElement ele = driver.findElement(By.xpath("//label[@for=\"fromCity\"]"));
		 //driver.findElement(By.xpath("//div[text()='PNQ']")).click();
		// ele.clear();
		ele.sendKeys("Pune");
		// WebElement ele1 = driver.findElement(By.xpath("//span[@for=\"toCity\"]"));
		// ele1.clear();
		 //ele1.sendKeys("Goa");
	}

}

