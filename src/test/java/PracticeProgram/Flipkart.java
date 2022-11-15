package PracticeProgram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.linkText("Cart")).click();
		String acttext= "Missing Cart items?";
		
		WebElement ele = driver.findElement(By.xpath("//div[text()='Missing Cart items?']"));
		
		if(acttext.equals(ele)) {
			System.out.println("pass"  + ele);
		}
		else {
			System.out.println("fail");
		}
		

	}

}
