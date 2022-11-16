package SCENERIOS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SC_1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.get("https://www.flipkart.com/");
		//driver.findElement(By.xpath("//div[text()='Mobiles']")).click();
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		
		driver.findElement(By.xpath("//input[@placeholder=\"Search for products, brands and more\"]")).sendKeys("iphone 13");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 (Pink, 128 GB)']")).click();
		Thread.sleep(2000);
		String ele = driver.getWindowHandle();
		System.out.println(ele);
		Thread.sleep(2000);
		driver.switchTo().window(ele);
	    driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2U9uOA _3v1-ww\"]")).click();
	}

}
