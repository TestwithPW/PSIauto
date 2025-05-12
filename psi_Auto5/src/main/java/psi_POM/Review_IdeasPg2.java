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

public class Review_IdeasPg2 {
	
	@FindBy(xpath="/html/body/div[1]/div/div/div/main/div/div/div[1]/h1") private WebElement Review_pageheader;
	@FindBy(xpath="/html/body/div[1]/div/div/div/main/div/div/div[2]/div/div[2]/button") private WebElement joindiscR;
	@FindBy(xpath="/html/body/div[4]/div/div[2]/div/div[2]/div[2]/div/div[1]/div/div[1]/button") private WebElement close_modal;
	@FindBy(xpath="/html/body/div[4]/div/div[2]/div/div[2]/div[2]/div/div[1]/div/div[6]/button") private WebElement All_done;
	@FindBy(xpath="/html/body/div[1]/div/div/div/main/div/div/div[3]/div/div[1]/div/div[2]/div[3]/button")
	private WebElement Listen_tab;
	
	@FindBy(xpath="/html/body/div[1]/div/div/div/main/div/div/div[3]/div/div[1]/div/div[2]/div[3]/button")
    private WebElement Listen_btn;
	@FindBy(xpath="/html/body/div[1]/div/div/div/main/div/div/div[3]/div/div[1]/div/div[2]/div[3]/button")
    private WebElement Read_btn;
	@FindBy(xpath="/html/body/div[1]/div/div/div/main/div/div/div[3]/div/div[1]/div/div[2]/div[3]/button")
    private WebElement AllDone_btn;
//                 /html/body/div[1]/div/div/div/main/div/div/div[3]/div/div[1]/div/div[2]/div[3]/button

	public Review_IdeasPg2(WebDriver driver) {	// /html/body/div[4]/div/div[2]/div/div[2]/div[2]/div/div[1]/div/div[6]/button

	PageFactory.initElements(driver,this);
	
	}
	public void Review_idea_header(WebDriver driver) {
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
	
	public void play_audio_click(WebDriver driver) {	// /html/body/div[1]/div/div/div/main/div/div/div[2]/div/div[1]/div/div[2]/div[1]/button
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(30));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(15));
		wait.until(ExpectedConditions.visibilityOf(Listen_tab));

		List<WebElement> play = driver.findElements(By.xpath("//html/body/div[1]/div/div/div/main/div/div/div[3]/div/div[1]/div/div[2]/div[3]/button"));
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
	public void join_disc_click(WebDriver driver) throws InterruptedException {	// /html/body/div[1]/div/div/div/main/div/div/div[2]/div/div[1]/div/div[2]/div[1]/button
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(30));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(15));
		wait.until(ExpectedConditions.elementToBeClickable(joindiscR));
		
			joindiscR.click(); 
		
	}
	
	public void Close_modal_click(WebDriver driver) throws InterruptedException {	// /html/body/div[1]/div/div/div/main/div/div/div[2]/div/div[1]/div/div[2]/div[1]/button
		
		
//		boolean close_modal_disp = close_modal.isDisplayed();
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(30));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(15));
		wait.until(ExpectedConditions.elementToBeClickable(Listen_btn));

		
//		boolean joinEnabled = joindiscR.isEnabled();
		boolean Listen = Listen_btn.isEnabled();
		boolean Read = Read_btn.isEnabled();
		
		if(Listen==true) {
			
			Listen_btn.click();
			
		}if(Read==true) {
			
			Read_btn.click();
			
		}else {
			
			AllDone_btn.click();
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