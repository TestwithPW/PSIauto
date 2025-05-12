package psi_POM;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GetStartedpage_Guestlogin {
	
	
	@FindBy(xpath="//button[@data-test-id=\"get-started-guest-btn\"]") private WebElement getstarted;
	
	public GetStartedpage_Guestlogin(WebDriver driver) {	//button[@data-test-id="get-started-account-btn"]
		
			PageFactory.initElements(driver,this);

	}
	
	public void getstarted_btn() {		//span[contains(text(),'Get started')]
		getstarted.click();
	}

}

