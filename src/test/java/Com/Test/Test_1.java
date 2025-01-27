package Com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com.PageObject.LoginPom;
import Com.Utility.BaseClass;

public class Test_1 extends BaseClass {
	@Test 
	public void test_1() {
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		login.getTxt_search().sendKeys(excel.getData("Sheet1", 0, 0));
		login.getBtn_search().click();
		login.getImg_Mobile().click();
		//Testing Git
		// New testing as per the master
		
		
	}

}
