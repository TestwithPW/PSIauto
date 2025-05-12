package psi_POM;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Add_idea_module {
	
	
	@FindBy(xpath="/html/body/div[1]/div/section/section/main/div/div/div[2]/div[2]/div/button") private WebElement Add_idea_tab;
	@FindBy(xpath="//button[@data-test-id=\"record-btn\"]") private WebElement record_tab;
	@FindBy(xpath="//button[@data-test-id=\"stop-btn\"]") private WebElement done_tab;
	@FindBy(xpath="/html/body/div[5]/div/div[2]/div/div[2]/div/div/div[3]/div/div[2]/div[1]/div/button/span") private WebElement play_tab;
	@FindBy(xpath="//span[contains(text(),'Continue')]") private WebElement Continue_tab;
	@FindBy(xpath="/html/body/div[4]/div/div[2]/div/div[1]/div/div/div/div[2]/span/textarea") private WebElement idea_title;
	@FindBy(xpath="/html/body/div[4]/div/div[2]/div/div[2]/div/div/div[3]/button[2]") private WebElement Continue2_tab;
	@FindBy(xpath="/html/body/div[5]/div/div[2]/div/div[2]/div/div/div[3]/button[2]") private WebElement submit_tab;
	//             
	public Add_idea_module(WebDriver driver) {	
		
		PageFactory.initElements(driver,this);
		
	}

    public void Add_idea_tab_click() {Add_idea_tab.click();}
 	
 	public void record_tab_click(WebDriver driver) {
 			
 		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(30));
		wait.until(ExpectedConditions.elementToBeClickable(record_tab));
		record_tab.click();	
 	}
 	
 	
 	public void done_tab_click() {done_tab.click();}
 	
 	public void play_tab_click() {play_tab.click();}
 	
 	public void Continue_tab_click() {Continue_tab.click();}
 	
 	public void idea_title_text() {idea_title.sendKeys("my idea is the best");}
 	
 	public void Continue2_tab_click() {Continue2_tab.click();}
 	
 	public void submit_tab_click() {submit_tab.click();}
	
	
	
	
}

