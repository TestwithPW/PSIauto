package psi_POM;




import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Discuss_round {
	
	
	 // /html/body/div[3]/div/div[2]/div/div[2]/div/div/div[1]/div[2]/div[1]/span[1] second discussion round header  //  Welcome to your second discussion table!
	@FindBy(xpath="//span[contains(text(),'Welcome to your first discussion table!')]") private WebElement Discussion_header1;
	
	@FindBy(xpath="//span[contains(text(),'Welcome to your second discussion table!')]") private WebElement Discussion_header2;
	//             /html/body/div[3]/div/div[2]/div/div[2]/div/div/div[2]/div[1]/div[2]/button[1]
	@FindBy(xpath="/html/body/div[3]/div/div[2]/div/div[1]/div/div[1]/div/div[2]/div[1]/div[2]/button[1]") private WebElement mute;
	// /html/body/div[4]/div/div[2]/div/div[2]/div/div/div[2]/div/div[2]/button[1]
	
	//             /html/body/div[4]/div/div[2]/div/div[2]/div/div/div[2]/div[1]/div[2]/button[3]
	//             /html/body/div[3]/div/div[2]/div/div[2]/div/div/div[2]/div[1]/div[2]/button[3]
	//             //button[@data-test-id=\"opn-chat-btn\"]
	@FindBy(xpath="//button[@data-test-id=\"opn-chat-btn\"]") private WebElement chat_button;
	
	//  /html/body/div[3]/div/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/div/span/input
	// /html/body/div[3]/div/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/div/span/input
	//  //input[@data-test-id="modal-chat-inp"]
	@FindBy(xpath="//input[@data-test-id=\"modal-chat-inp\"]") private WebElement chat_input;
//             		 /html/body/div[4]/div/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/div/span/input	
	
	// /html/body/div[3]/div/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/div/span/span/button
	// 
	
	//          //button[@data-test-id="modal-send-msg-btn"] // //button[@data-test-id="modal-send-msg-btn"]
	@FindBy(xpath="//button[@data-test-id=\"modal-send-msg-btn\"]") private WebElement send;
	
	//             /html/body/div[3]/div/div[2]/div/div[2]/div/div/div[2]/div[1]/div[2]/button[2]
	@FindBy(xpath="/html/body/div[3]/div/div[2]/div/div[1]/div/div[1]/div/div[2]/div[1]/div[2]/button[2]") private WebElement ideas_button;
	@FindBy(xpath="/html/body/div[4]/div/div[2]/div/div[1]/div/div[1]/div/div[2]/div[2]/div/div[2]/div/div[1]/div[1]/button")
	private WebElement view_button; // 
	@FindBy(xpath="/html/body/div[4]/div/div[2]/div/div[2]/div/div/div[2]/div[1]/div[2]/button[2]") 
	private WebElement Listen_ideas_button;
	

	//            /html/body/div[3]/div/div[2]/div/div[2]/div/div/div[2]/div[1]/div[2]/button[4]
	@FindBy(xpath="/html/body/div[3]/div/div[2]/div/div[2]/div/div/div[2]/div[1]/div[2]/button[4]") 
	private WebElement Bell_button;

	
	// //button[@data-test-id="rqst-admn-btn"]
	@FindBy(xpath="/html/body/div[4]/div/div[2]/div/div[1]/div/div[1]/div/div[2]/div[2]/div/div/button") private WebElement Request_Admin_button;

	// 				//button[@data-test-id="opn-report-usr-btn"]
	@FindBy(xpath="//button[@data-test-id=\"opn-report-usr-btn\"]") private WebElement flag_button;
	
	//             /html/body/div[3]/div/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/div/div/label/span/input
	@FindBy(xpath="/html/body/div[3]/div/div[2]/div/div[1]/div/div[1]/div/div[2]/div[2]/div/div[2]/div/div") 
	private WebElement user_check_box_button;
	
	@FindBy(xpath="/html/body/div[4]/div/div[2]/div/div[1]/div/div[1]/div/div[2]/div[2]/div/button")
	private WebElement Continue_tab;
	
	@FindBy(xpath="/html/body/div[3]/div/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/div/div/label/span/input") private WebElement Reason_check_box_button;
	
	
	@FindBy(xpath="//button[@data-test-id=\"flag-usr-btn\"]") private WebElement flagthis_user_button;
	
	@FindBy(xpath="//button[@data-test-id=\"flg-got-it-btn\"]") private WebElement flag_gotit_button;
	
	

	public Discuss_round(WebDriver driver) {	

	PageFactory.initElements(driver,this);
	
	}
	
	public void Disc_modal_header1(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(5));
		wait.until(ExpectedConditions.visibilityOf(Discussion_header1));
		
		boolean Discuss_header1 = Discussion_header1.isDisplayed();
		if(Discuss_header1==true) {
			System.out.println("Discussion modal header is displayed");
		}
		else {
			System.out.println("Discussion modal header is not displayed");
		}
	}
	public void Disc_modal_header2(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(5));
		wait.until(ExpectedConditions.visibilityOf(Discussion_header2));
		
		boolean Discuss_header2 = Discussion_header2.isDisplayed();
		if(Discuss_header2==true) {
			System.out.println("Discussion modal header is displayed");
		}
		else {
			System.out.println("Discussion modal header is not displayed");
		}
	}
	public void mute_click(WebDriver driver) {	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(mute));
		mute.click();	
	}
	
	public void chat_click() {
		
		chat_button.click();
	}
	public void chat_type_message() throws InterruptedException {
		
		chat_input.sendKeys("this message is from automated test user");
		Thread.sleep(2000);
	}
	
	public void Send_message(WebDriver driver) {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
//		wait.until(ExpectedConditions.elementToBeClickable(send));
		send.click();
	}
	
	public void Bell_Request_admin() throws InterruptedException {
		
		Bell_button.click();
	}
	public void Request_admin(WebDriver driver) throws InterruptedException {
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
//		wait.until(ExpectedConditions.elementToBeClickable(Request_Admin_button));
		Thread.sleep(3000);
		Request_Admin_button.click();
	}
	
	public void Ideas_button() {	
		ideas_button.click();
	}
	
	public void View_ideas() {	
		view_button.click();
	}
	
	
	public void _Flag_click() {	
		flag_button.click();	
	}
	public void User_Check_report_click() {	
		user_check_box_button.click();	
	}
	
	public void _click(WebDriver driver) {	
		

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.visibilityOf(user_check_box_button));

		List<WebElement> play = driver.findElements(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[2]/div/div/label/span/input"));
		WebElement playaudio1 = play.get(0);
		
		boolean playdisp = playaudio1.isDisplayed();	
		
		if (playdisp == true) {
			System.out.println("There are few ideas with Audio");
		playaudio1.click(); 
		}
		else {
			System.out.println("There is no idea present with audio");
		}
	
	}	
	public void Continue_tab_click(WebDriver driver) {	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(Continue_tab));
		Continue_tab.click();
	}
	public void Flag_reason_check_click() {	
		Reason_check_box_button.click();	
	}
	
	public void Flag_this_user_click() {	
		flagthis_user_button.click();	
	}
	public void Check_Gotit_click() {	
		flag_gotit_button.click();	
	}
	
	
	
	
	
}



