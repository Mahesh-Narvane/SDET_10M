package PracticeProgram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amezon {

	public static void main(String[] args) throws Throwable {
		
	WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		driver.get("http://www.amazon.in/");
		driver.findElement(By.id("searchDropdownBox")).click();
		
		driver.findElement(By.xpath("//option[text()='Deals']")).click();
		
		Thread.sleep(1000);
		driver.close();
	
		System.out.println("Executed Successfully");
		 
	}

}
