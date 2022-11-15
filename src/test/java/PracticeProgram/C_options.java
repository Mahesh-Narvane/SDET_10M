package PracticeProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class C_options {

	public static void main(String[] args) {

           
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		
		
		options.addArguments("version--");
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("http://www.google.com/");
		
		
	}

}
