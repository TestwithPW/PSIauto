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

public class Voting_round {
	
	
	
	@FindBy(xpath="//span[contains(text(),'Welcome to your first discussion table!')]") private WebElement Discussion_header;
	
	@FindBy(xpath="//span[contains(text(),'Start Voting')]") private WebElement Start_voting;
	
	//  /html/body/div[3]/div/div[2]/div/div[2]/div/div/div/div[3]/div[1]/div[2]/div[3]/button[2]
	
	//        /html/body/div[3]/div/div[2]/div/div[2]/div/div/div/div[3]/div[1]/div[2]/div[3]/button[2]     // //button[@data-test-id="vote-incr-btn"]
	@FindBy(xpath="//button[@data-test-id=\"vote-incr-btn\"]") private WebElement inc_voting; // vote-incr-btn
	//
	//             //button[@data-test-id="vote-decr-btn"]
	@FindBy(xpath="//button[@data-test-id=\"vote-decr-btn\"]") private WebElement dec_voting; // vote-decr-btn
	
	@FindBy(xpath="//span[contains(text(),'Submit votes')]") private WebElement submit_votes;
	
// 					/html/body/div[3]/div/div[2]/div/div[2]/div/div/div/div[2]/div[1]
	@FindBy(xpath="//div[@data-test-id=\"vote-completed-header\"]") private WebElement Vote_comp_header;
	// /html/body/div[4]/div/div[2]/div/div[2]/div/div/div[2]/div/div[2]/button[1]
	
	//  vote counter header /html/body/div[4]/div/div[2]/div/div[2]/div/div/div/div[2]/div[1]
	


    //  /html/body/div[4]/div/div[2]/div/div[2]/div/div/div/button start voting button on modal
	
	public Voting_round(WebDriver driver) {	

	PageFactory.initElements(driver,this);
	
	}
	
	public void start_vote_click(WebDriver driver) {	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(10));
		wait.until(ExpectedConditions.elementToBeClickable(Start_voting));
		Start_voting.click();	
	}
	
	public void inc_vote_click(WebDriver driver) {	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(inc_voting));
		List<WebElement> vote_plus = driver.findElements(By.xpath("//button[@data-test-id=\"vote-incr-btn\"]"));
		WebElement vote_plus1 = vote_plus.get(0);
		
		boolean votedisp = vote_plus1.isDisplayed();	
		
		if (votedisp == true) {
			System.out.println("There are few ideas with vote + button");
			vote_plus1.click(); 
		}
		else {
			System.out.println("There is no idea with vote + button");
		}
	}
	
	
	public void dec_vote_click(WebDriver driver) {	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(dec_voting));

		List<WebElement> vote_dec = driver.findElements(By.xpath("//button[@data-test-id=\"vote-decr-btn\"]"));
		WebElement vote_dec1 = vote_dec.get(0);
		
		boolean votedisp = vote_dec1.isDisplayed();	
		
		if (votedisp == true) {
			System.out.println("There are few ideas with vote - button");
			vote_dec1.click(); 
		}
		else {
			System.out.println("There is no idea with vote - button");
		}
	}
	
	
	public void submit_vote_click(WebDriver driver) {	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(submit_votes));
		submit_votes.click();	
	}
	
	public void voting_comlpleted(WebDriver driver) {	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.visibilityOf(Vote_comp_header));
			boolean votedisp = Vote_comp_header.isDisplayed();	
		
		if (votedisp == true) {
			System.out.println("Voting Completed header is displayed"); 
		}
		else {
			System.out.println("Voting completed header is not displayed");
		}
	}
	
	// vote button /html/body/div[3]/div/div[2]/div/div[2]/div/div/div/div[3]/div[1]/div[2]/div[3]/button[2]/span/span  increment tab  /html/body/div[3]/div/div[2]/div/div[2]/div/div/div/div[3]/div[1]/div[2]/div[3]/button[2]
	// vote button /html/body/div[3]/div/div[2]/div/div[2]/div/div/div/div[3]/div[2]/div[2]/div[3]/button[1]  // decrement button
	
}



