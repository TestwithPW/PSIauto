package psi_POM;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Add_idea_b15 {
	
	@FindBy(xpath="//button[@data-test-id=\"join-btn\"]")
	private WebElement join_disc;
	@FindBy(xpath="/html/body/div[5]/div/div[2]/div/div[2]/div/div/div/button")
	private WebElement ok_button;
	@FindBy(xpath="//span[contains(text(),'All good')]")
	private WebElement All_good_tab;
// 	               /html/body/div[4]/div/div[2]/div/div[2]/div/div/div[3]/div/div[2]/div[1]/button
	@FindBy(xpath="//span[contains(text(),'Record')]") // //button[@data-test-id=\"record-btn\"]
	private WebElement Record_tab; // /html/body/div[5]/div/div[2]/div/div[2]/div/div/div[3]/div/div[2]/div[1]/button
	
	// //span[contains(text(),'Record')]
	       
	@FindBy(xpath="//span[contains(text(),'I prefer to type my answer')]") 
	private WebElement I_will_add_desc; 
	
	//              // /html/body/div[3]/div/div[2]/div/div[2]/div/div/div[3]/span/textarea
	@FindBy(xpath="//textarea[@data-test-id=\"idea-description-inp\"]") //  textarea[placeholder='Describe your idea...']
	private WebElement type_description;
	
	
	
	@FindBy(xpath="//button[@data-test-id=\"stop-btn\"]")
	private WebElement done_tab;
	@FindBy(xpath="//span[contains(text(),'Continue')]")
	private WebElement Continue_tab;
	//      
	// /			 /html/body/div[4]/div/div[2]/div/div[2]/div/div/div[2]/span/textarea
	@FindBy(xpath="/html/body/div[4]/div/div[2]/div/div[1]/div/div/div/div[2]/span/textarea")
	private WebElement enter_title_tab;
	@FindBy(xpath="//span[contains(text(),'Submit')]")
	private WebElement submit_tab;

	
	
	// //span[contains(text(),'Continue to next idea')]
	
	

	public Add_idea_b15(WebDriver driver) {			
	PageFactory.initElements(driver,this);
	}
	
	public void join_disc_click(WebDriver driver) {	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(join_disc));
		join_disc.click();
	}
	public void ok_button_click(WebDriver driver) {	// /html/body/div[5]/div/div[2]/div/div[2]/div/div/div/button
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(ok_button));
		ok_button.click();
	}
	public void All_good_tab_click(WebDriver driver) {	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(All_good_tab));
		All_good_tab.click();
	}
	public void record_click(WebDriver driver) {	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(Record_tab));
		Record_tab.click();
	}
	
	public void I_will_add_desc_click(WebDriver driver) {	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(I_will_add_desc));
		I_will_add_desc.click();
	}
	public void Type_desc(WebDriver driver) {	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.visibilityOf(type_description));
		type_description.sendKeys("This is the Idea description for the idea from the Automated test user");
	}

	public void done_tab_click(WebDriver driver) {	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(done_tab));
		done_tab.click();
	}
	public void Continue_tab_click(WebDriver driver) {	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(Continue_tab));
		Continue_tab.click();
	}
	public void enter_title_tab_click(WebDriver driver) {	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(enter_title_tab));
		enter_title_tab.sendKeys("Rushikesh is my friend");
	}
	public void submit_tabclick() {	
		submit_tab.click();
	}
	
	
}
