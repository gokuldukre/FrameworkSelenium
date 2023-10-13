package Com.Utility;

import java.io.File;

import javax.lang.model.element.Element;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.utility.RandomString;

public class Library {
	public static void custom_SendKeys(WebElement element,String value) {
		try {
			element.sendKeys(value);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public static void custom_click(WebElement element) {
		try {
			element.click();
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
			}
		}
	public static void custom_Handle_DropDown(WebElement element, String txt ) {
		try {
			Select sel=new Select(element);
			sel.selectByVisibleText(txt);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void custom_Mouse_Movement(WebDriver driver,WebElement element) {
		try {
			Actions act=new Actions(driver);
			act.moveToElement(element).click().build().perform();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void get_custom_Capture(WebDriver driver) {
		try {
			
			String path="C:\\Users\\DELL\\eclipse-workspace\\FrameWorkSelenium\\Screenshoots";
			TakesScreenshot ts = (TakesScreenshot) driver;
			String rm=RandomString.make(5);
			File src=ts.getScreenshotAs(OutputType.FILE);
			File destn= new File (path+""+"rm.png");
			FileUtils.copyDirectory(src, destn);		
			}
		catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
	}
	public static Alert custom_Alert(WebDriver driver) {
		try {
			Alert alt=driver.switchTo().alert();
			return alt;
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

}
