package psi_POM;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage_RegUser {
	
	
	@FindBy(xpath="/html/body/div[1]/div/div/div[1]/div/div[2]/div/div/form/div[1]/div/div[2]/div/div/input") private WebElement username;
	@FindBy(xpath="/html/body/div[1]/div/div/div[1]/div/div[2]/div/div/form/div[2]/div/div[2]/div/div/span/input") private WebElement password;
	@FindBy(xpath="/html/body/div[1]/div/div/div[1]/div/div[2]/div/div/form/div[3]/div/div/div/div/button[1]") private WebElement login;
	
	public Loginpage_RegUser(WebDriver driver) {	
		
	PageFactory.initElements(driver,this);
	}
	
	public void Send_username() {
		username.sendKeys("testeng682@gmail.com");	
	}
	
	public void Send_Password() {	
		password.sendKeys("A62mSYSqWGjS3By@");	
	}
	
	public void loginIn_btn() {	
		login.click();
	}

}
