package psi_POM;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GetStartedpage_RegisterUser {
	
	
	@FindBy(xpath="/html/body/div[1]/div/div/div[1]/div/div[2]/div/div[2]/div/button/span") private WebElement ThenLoginHere;
	
	public GetStartedpage_RegisterUser(WebDriver driver) {	
		
			PageFactory.initElements(driver,this);
		

	}
	
	public void Thenlgnhere_btn() {		
//		parentElement.click();
		ThenLoginHere.click();
	}

}
