package psi_POM;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Enter_username {
	

	@FindBy(xpath="/html/body/div[1]/div/div/div[1]/div/div[2]/div[1]/div/form/div[1]/div/div[2]/div/div/input") private WebElement enter_name;
	@FindBy(xpath="//button[@data-test-id=\"lets-go-btn\"]") private WebElement letsgo;
	
	public Enter_username(WebDriver driver) {	
		PageFactory.initElements(driver,this);
		}

	public void enter_name() {	
		enter_name.sendKeys("guest user1");
	}
	
	public void letsgo_click() {	
		letsgo.click();
	}
	
		
	
}
