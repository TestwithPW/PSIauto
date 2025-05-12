package psi_POM;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Topic_Details_pg {
	
	

	@FindBy(xpath="//button[@data-test-id=\"got-it-modal-btn\"]") private WebElement gotittab;
	@FindBy(xpath="//button[@class=\"ant-modal-close\"]") private WebElement closetab;
	@FindBy(xpath="/html/body/div[1]/div/section/section/main/div/div/div[2]/div[2]/div/button[2]") private WebElement Setitup_tab;
	@FindBy(xpath="//span[contains(text(),'OK')]") private WebElement Allow_OK_tab;
	@FindBy(xpath="//span[contains(text(),'All good')]") private WebElement All_good_tab;
	@FindBy(xpath="/html/body/div[5]/div/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div[1]/div") private WebElement AS_stop_rec_tab;
	@FindBy(xpath="/html/body/div[4]/div/div[2]/div/div[2]/div/div/div[2]/div/div/div[1]/div/span[2]/svg") private WebElement As_rec_tab;
	@FindBy(xpath="/html/body/div[4]/div/div[2]/div/div[2]/div/div/div[2]/div/div/div[1]/div/span[1]/svg") private WebElement pause_play_rec_tab;
	@FindBy(xpath="//span[contains(text(),'Got it')]") private WebElement gotit_tab;
	@FindBy(xpath="//button[@data-test-id=\"join-btn\"]") private WebElement join_disc_tab;
	
			
	public Topic_Details_pg(WebDriver driver) {	
		
	PageFactory.initElements(driver,this);
	
}
	public void gotittabclick(WebDriver driver ) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(30));
		wait.until(ExpectedConditions.elementToBeClickable(gotittab));
		
		gotittab.click();}
	
	
	
 	public void closetab() {closetab.click();}	
 	
 	public void Setitup_tab_click() {Setitup_tab.click();}
 	
 	public void Allow_OK_tab_click() {Allow_OK_tab.click();} // //span[contains(text(),'OK')]
 	
 	public void All_good_tab_click() {All_good_tab.click();}
 	
 	public void AS_stop_rec_tab_click() {AS_stop_rec_tab.click();}
 	
 	public void As_rec_tab_click() {As_rec_tab.click();}
 	
 	public void pause_play_rec_tab_click() {pause_play_rec_tab.click();}
 	
 	public void gotit_tab_click(WebDriver driver) {
 		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(30));
		wait.until(ExpectedConditions.elementToBeClickable(gotit_tab));
		boolean got_it_clickable = gotit_tab.isEnabled();
		if(got_it_clickable) {
			System.out.println("Got_it tab is clickable");
			gotit_tab.click();}
		
 		else{	
 			System.out.println("Got_it tab is not clickable");
 		}
 		
 	}
 	
 	public void join_disc_tab_click(WebDriver driver) {
 		
 		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(30));
		wait.until(ExpectedConditions.elementToBeClickable(join_disc_tab));
		boolean join_disc_clickable = join_disc_tab.isEnabled();
		if(join_disc_clickable) {
			System.out.println("join disc tab is clickable");
			join_disc_tab.click();}
		
 		else{	
 			System.out.println("join disc tab is not clickable");
 		}
 		
 	
 	}
 	
}
