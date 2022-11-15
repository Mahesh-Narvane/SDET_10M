package PracticeProgram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Particular_Info_From_table {

	public static void main(String[] args) {

		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		 driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/odi");
		
		  String ele = driver.findElement(By.xpath("//tbody/tr[3]/td[4]")).getText();
         System.out.println(ele);
	}

}
