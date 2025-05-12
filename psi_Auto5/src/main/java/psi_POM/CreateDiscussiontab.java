package psi_POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateDiscussiontab {
	
	
    public CreateDiscussiontab(WebDriver driver ){
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="//button[@data-test-id=\"new-discussion-btn\"]") private WebElement NewDiscussions;
	
	@FindBy(xpath="/html/body/div[3]/div/div[2]/div/div[2]/div/div/div[2]/button[1]") private WebElement okay_tab;
	
	
	// /html/body/div[3]/div/div[2]/div/div[2]/div/div/div[2]/button[1]
	
	public void NewDiss_btn() {	
		NewDiscussions.click();
	}
	
	public void Okay_btn(WebDriver driver) {	
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
		wait.until(ExpectedConditions.visibilityOf(okay_tab));
		
		boolean okay_tab_visible = okay_tab.isDisplayed();
		if(okay_tab_visible==true) {
			System.out.println("Trail ending modal is displayed");
			okay_tab.click();
		}
		if(okay_tab_visible==false) {
			System.out.println("Trail ending modal is not displayed");
		}
	}
}
