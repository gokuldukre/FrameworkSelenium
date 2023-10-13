package Com.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPom {
	@FindBy (how=How.XPATH, using="//*[@id=\"twotabsearchtextbox\"]") private WebElement txt_search;
	@FindBy (how=How.XPATH, using="//*[@id=\"nav-search-submit-button\"]") private WebElement Btn_search;
	@FindBy (how=How.XPATH, using="//span[@class='a-size-medium a-color-base a-text-normal'][contains(text(),'Samsung Galaxy M34 5G (Prism Silver,8GB,128GB)|120')]") private WebElement img_Mobile;
	public WebElement getTxt_search() {
		return txt_search;
	}
	
	public WebElement getBtn_search() {
		return Btn_search;
	}
	
	public WebElement getImg_Mobile() {
		return img_Mobile;
	}
	

}
