package PracticeProgram;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PlayerRanking_Table {

	public static void main(String[] args) {
		
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		 driver.get("https://www.icc-cricket.com/rankings/mens/player-rankings/t20i");
		 
	}

}
