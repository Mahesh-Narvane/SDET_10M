package SCENERIOS;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SC_1 {

	public static void main(String[] args) throws InterruptedException {

          WebDriverManager.chromedriver().setup();
          ChromeDriver driver = new ChromeDriver();
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
          
          driver.get("https://www.amazon.in/");
          driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Apple iPhone 13 (256GB) - Pink",Keys.ENTER);
          
         driver.findElement(By.xpath("//span[text()='Apple iPhone 13 (256GB) - Pink']")).click();
         
         Set<String> wd = driver.getWindowHandles();
         for (String string : wd) {
			driver.switchTo().window(string);
		}
    
         WebElement price = driver.findElement(By.xpath("//span[@class=\"a-price aok-align-center reinventPricePriceToPayMargin priceToPay\"]"));
         String pri = price.getText();
         System.out.print("Amezon Price "+ pri);
         
         
         driver.switchTo().newWindow(WindowType.TAB);
         
         driver.get("https://www.flipkart.com/");
         driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
         driver.findElement(By.xpath("//input[@title=\"Search for products, brands and more\"]")).sendKeys("APPLE iPhone 13 (Pink, 256 GB)",Keys.ENTER);
         Thread.sleep(1000);
         driver.findElement(By.xpath("//span[text()='APPLE iPhone 13 (Pink, 256 GB)']")).click();
         
        
	}
	

}
