package Com.Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.beust.jcommander.Parameter;
import io.github.bonigarcia.wdm.WebDriverManager;
public class BaseClass {
	ConfigDataProvider config;
	public static WebDriver driver;
	public static ExcelDataReader excel;
	@BeforeSuite
	public void BS() throws Exception {
		excel=new ExcelDataReader();
		 config=new ConfigDataProvider();
	}
	@Parameters({"BrowserName"})
	@BeforeMethod 
	public void BM (String BrowserName) {
		if (BrowserName.equalsIgnoreCase("Chrome")) {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		
		
		}
		else if(BrowserName.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver =new EdgeDriver();
			
			
		}
		driver.get(config.getBaseURL_QA2());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
	}
	@AfterMethod 
	public void TearDown() {
		driver.quit();
}
}
