package online_B_A;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class create_customer_account {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("http://rmgtestingserver/domain/Online_Banking_System/index.php");
	
		driver.findElement(By.xpath("//li[text()='Open Account']")).click();
		driver.findElement(By.xpath("//input[@placeholder=\"Name\"]")).sendKeys("RobertD");
		WebElement element = driver.findElement(By.xpath("//select[@name=\"gender\"]"));
		element.click();
		Select s = new Select(element);
		s.selectByVisibleText("Male");
		s.getFirstSelectedOption().click();
		driver.findElement(By.xpath("//input[@placeholder=\"Mobile no\"]")).sendKeys("8605583583");
		driver.findElement(By.xpath("//input[@placeholder=\"Email id\"]")).sendKeys("robertd@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder=\"Landline no\"]")).sendKeys("123521");
		WebElement ele = driver.findElement(By.xpath("//input[@placeholder=\"Date of Birth\"]"));
		ele.click();
		ele.sendKeys("10");
		ele.sendKeys("10");
		ele.sendKeys("2020");
		
        driver.findElement(By.xpath("//input[@placeholder=\"PAN Number\"]")).sendKeys("BTLOP0211V");
        driver.findElement(By.xpath("//input[@placeholder=\"Citizenship Number\"]")).sendKeys("D1254BC21");
        driver.findElement(By.xpath("//input[@placeholder=\"Home Address\"]")).sendKeys("High street, B13, east castle, greenland");
        driver.findElement(By.xpath("//input[@placeholder=\"Office Address\"]")).sendKeys("23v, trumph tower,us");
        WebElement ele1 = driver.findElement(By.xpath("//select[@name=\"state\"]"));
        ele1.click();
        Select sel = new Select(ele1);
        sel.selectByVisibleText("Texas");
        WebElement ele2 = driver.findElement(By.xpath("//select[@name=\"city\"]"));
        ele2.click();
        Select se = new Select(ele2);
        se.selectByVisibleText("Dallas");
        driver.findElement(By.xpath("//input[@placeholder=\"Pin Code\"]")).sendKeys("431515");
        driver.findElement(By.xpath("//input[@placeholder=\"Area/Locality\"]")).sendKeys("us");
        driver.findElement(By.xpath("//input[@placeholder=\"Nominee Name (If any)\"]")).sendKeys("Stephan");
        driver.findElement(By.xpath("//input[@placeholder=\"Nominee Account no\"]")).sendKeys("53248561257");
        WebElement ele3 = driver.findElement(By.xpath("//select[@name=\"acctype\"]"));
        ele3.click();
        Select select = new Select(ele3);
        select.selectByVisibleText("Saving");
        
        driver.findElement(By.xpath("//input[@name=\"submit\"]")).click();
        driver.findElement(By.xpath("//input[@value='Confirm']")).click();
	}

}
