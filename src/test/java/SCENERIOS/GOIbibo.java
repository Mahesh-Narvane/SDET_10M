package SCENERIOS;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GOIbibo {

	public static void main(String[] args) throws InterruptedException, AWTException {

		ChromeDriver driver;
		String str="Pune (PNQ)";
		String s="Kolkata, India ";
		int seats =3;

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


		driver.get("https://www.goibibo.com/");

		//driver.findElement(By.xpath("//p[@class=\"sc-jlwm9r-1 dRQhOp\"]")).click();
		driver.findElement(By.xpath("//span[.='From']")).click(); 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys(str);
		Thread.sleep(2000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);

		WebElement elem = driver.findElement(By.xpath("//input[@type='text']"));
		elem.sendKeys(s);
		Thread.sleep(2000);

		List<WebElement> list = driver.findElements(By.xpath("//ul[@id='autoSuggest-list']//span[@class='autoCompleteTitle ']"));

		for (int i = 0; i < list.size(); i++) 
		{
			String test=list.get(i).getText();	
			System.out.println(test);
			if(test.equalsIgnoreCase(s)) 
			{
				System.out.println(test);
				list.get(i).click();
				break;
			}
		}
		driver.findElement(By.xpath("//span[text()='Cancel']")).click();


		//			WebElement to=driver.findElement(By.xpath("//span[.='Kolkata, India']"));
		//			JavascriptExecutor	js= (JavascriptExecutor)driver;
		//			js.executeScript("arguments[0].click();",to);
		//	 Robot r = new Robot();
		//	 r.keyRelease(0);


		//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[.='1 Adult']"))).click();
		driver.findElement(By.xpath("")).click();
		for (int i = 1; i < seats; i++) 
		{
			driver.findElement(By.xpath("(//p[.='Adults']/parent::div//span[@class='sc-ehCJOs kujlZU']//*[name()='svg'])[last()]")).click();
		}
		driver.findElement(By.xpath("//a[.='Done']")).click();

		//	 Thread.sleep(2000);
		//	 Robot r = new Robot();
		//	 r.keyPress(KeyEvent.VK_ENTER);



	}

}
