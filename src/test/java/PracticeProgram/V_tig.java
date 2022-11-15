package PracticeProgram;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class V_tig {

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
		
		driver.findElement(By.id("2")).click();
		driver.findElement(By.linkText("del")).click();
		
		driver.switchTo().alert().accept();
		Alert a = driver.switchTo().alert();
		a.accept();
	}

}
