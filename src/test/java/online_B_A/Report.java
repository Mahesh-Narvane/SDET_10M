package online_B_A;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.google.common.io.Files;

	

public class Report 
{
	ExtentSparkReporter reporter; // This class we are using for look an feel of report and giving the pathof report.

	ExtentReports reports ; // We use for attaching the reporter

	ExtentTest test; // Making entries in Report as Pass or Fail or Skip AND to add Screenshot to the report


	@Test
	public void createreport() throws IOException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		String path =System.getProperty("user.dir")+"/screenshots/fb.png";
		File dest = new File(path);
		Files.copy(src, dest);
		reporter = new ExtentSparkReporter(System.getProperty("user.dir")+"/Reports/SDET10.html");
		reporter.config().setTheme(Theme.DARK);
		reporter.config().setDocumentTitle("FACEbook");

		reports = new ExtentReports();
		reports.attachReporter(reporter);
		reports.setSystemInfo("Platform", "Windows 11");
		reports.setSystemInfo("Browseer", "Chrome");
		reports.setSystemInfo("Version", "106");
		reports.setSystemInfo("Reporter", "Pavan");

		test=reports.createTest("createreport");

		test.log(Status.PASS, "Test Got Passed");
		
		test.addScreenCaptureFromPath(path);
		
		reports.flush();

		
	}

	
}
