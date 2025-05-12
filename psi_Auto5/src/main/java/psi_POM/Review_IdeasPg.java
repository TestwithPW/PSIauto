package psi_POM;


import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Review_IdeasPg {// //button[@data-test-id="join-disc-btn"]
	
	@FindBy(xpath="/html/body/div[1]/div/div/div/main/div/div/div[1]/h1") private WebElement Review_pageheader;
	
	
	// /html/body/div[1]/div/div/div/main/div/div/div[1]/span    // Click on an idea to review what other people thought about the discussion topic. Once you’ve reviewed all of them, you can continue to your discussion table.
	@FindBy(xpath="/html/body/div[1]/div/div/div/main/div/div/div[1]/span") private WebElement Review_page_subheader;
	
	@FindBy(xpath="//button[@data-test-id=\"join-disc-btn\"]") private WebElement joindiscR;// join-disc-btn
	@FindBy(xpath="/html/body/div[4]/div/div[2]/div/div[2]/div[2]/div/div[1]/div/div[1]/button") private WebElement close_modal;
	
	// /html/body/div[3]/div/div[2]/div/div[2]/div[2]/div/div[1]/div/div[6]/button
	@FindBy(xpath="//button[@data-test-id=\"all-done-btn\"]") private WebElement All_done;   // //button[@data-test-id="all-done-btn"]
	@FindBy(xpath="/html/body/div[1]/div/div/div/main/div/div/div[2]/div[1]/div[1]/div/div[2]/div[3]/button") private WebElement Listen_tab;
//               
//  //button[@data-test-id="continue-pitch-btn"]  continue to next idea
	public Review_IdeasPg(WebDriver driver) {	

	PageFactory.initElements(driver,this);
	
	}
	public void Review_idea_subheader(WebDriver driver) {  // These are the ideas moving forward  // /html/body/div[1]/div/div/div/main/div/div/div/span[2]
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.visibilityOf(Review_page_subheader));
		
		boolean review_pg_subheader = Review_page_subheader.isDisplayed();
		if(review_pg_subheader==true) {
			System.out.println("Review Idea page subheader is displayed");
		}
		else {
			System.out.println("Review Idea page subheader is not displayed");
		}
	}
	public void Review_idea_header(WebDriver driver) {  // These are the ideas moving forward  // /html/body/div[1]/div/div/div/main/div/div/div/span[2]
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(15));
		wait.until(ExpectedConditions.visibilityOf(Review_pageheader));
		
		boolean review_pg_header = Review_pageheader.isDisplayed();
		if(review_pg_header==true) {
			System.out.println("Review Idea page header is displayed");
		}
		else {
			System.out.println("Review Idea page header is not displayed");
		}
	}
	
	public void play_audio_click(WebDriver driver) {	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.visibilityOf(Listen_tab));

		List<WebElement> play = driver.findElements(By.xpath("/html/body/div[1]/div/div/div/main/div/div/div[2]/div[1]/div[1]/div/div[2]/div[3]/button"));
		WebElement playaudio1 = play.get(0);
		
		boolean playdisp = playaudio1.isDisplayed();	
		
		if (playdisp == true) {
			System.out.println("Listen or Read tab are present on cards");
		playaudio1.click(); 
		}
		else {
			System.out.println("Listen or Read tab are not present on cards");
		}
	}
	public void close_modal_click(WebDriver driver) throws InterruptedException {	
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(joindiscR));

		
		boolean joinEnabled = joindiscR.isEnabled();	
				if (joinEnabled == true) {
					
//					boolean all_dn_pre = false;
//					try {
//						WebElement All_dn = driver.findElement(By.xpath("//span[contains(text(),'All done!')]"));
//						if(All_dn.isDisplayed()) {
//							all_dn_pre =true;
//							System.out.println("All done is present");
//							close_modal.click(); 
//						}
//					}
//					catch (NoSuchElementException e){
//						System.out.println("All done is not present");
//					}
					
					boolean all_done_disp = All_done.isDisplayed();
					if(all_done_disp==true) {
						System.out.println("Join discussion is clickable");
						All_done.click(); 
					}
					else {
						System.out.println("All done tab is not present & Modal got closed all already");
					}
					
				}
				
		}
		
	
	
	public void join_disc_click(WebDriver driver) throws InterruptedException {	// /html/body/div[1]/div/div/div/main/div/div/div[2]/div/div[1]/div/div[2]/div[1]/button
		
		
		boolean joinEnabled = joindiscR.isEnabled();

		if (joinEnabled==true) {
			System.out.println("Modal has been closed & Join discussion is now clickable");
			joindiscR.click(); 
		}
		else {
			System.out.println("Cannot click on join discussion button because join discussion was not enalbed and audio was being played");
		}
	}				
			
}


// /html/body/div[1]/div/section/section/main/div/div/div[2]/div[2]/div/div[2]/div[2]/div[3]/span vote -
// /html/body/div[1]/div/section/section/main/div/div/div[2]/div[2]/div/div[2]/div[2]/div[1]/span vote + 
// //button[@data-test-id="discussion-table-unmute"] mute-unmute 
// /html/body/div[1]/div/section/section/main/div/div/div[4]/div[2]/div[2]/button
// /html/body/div[1]/div/section/section/main/div/div/div[4]/div[2]/div[2]/div[2]/button[4] reaction btn
// /html/body/div[1]/div/section/section/main/div/div/div[4]/div[1]/div[1]/div/span[1] avatar 
// /html/body/div[4]/div/div[2]/div/div/div/div[5]/div/button report participant

// /html/body/div[1]/div/section/section/main/div/div/div/div[4]/button viewotherdiscussion