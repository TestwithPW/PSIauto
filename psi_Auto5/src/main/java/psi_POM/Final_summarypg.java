package psi_POM;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Final_summarypg {
	
	
	
	
	@FindBy(xpath="/html/body/div[1]/div/div/div/main/div/div/div[1]/article[2]") private WebElement Final_summary_header;

	@FindBy(xpath="//span[@data-test-id=\"summary-header\"]") private WebElement int_summary_header;
	
	@FindBy(xpath="/html/body/div[1]/div/div/div/main/div/div/div/span[2]") private WebElement int_summary_subheader;
	
	//  /html/body/div[1]/div/div/div/main/div/div/div/span[2]
	public Final_summarypg(WebDriver driver) {	

	PageFactory.initElements(driver,this);

	}
	// /html/body/div[1]/div/div/div/main/div/div/div/span[1]
	
	public void summary_header(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(10));
		wait.until(ExpectedConditions.visibilityOf(Final_summary_header));
		
		boolean summary_pg_header = Final_summary_header.isDisplayed();
		if(summary_pg_header==true) {
			System.out.println("Final Summary page header is displayed");
		}
		else {
			System.out.println("Summary page header is not displayed");
		}
		
	}
	
	public void int_summary_header(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(10));
		wait.until(ExpectedConditions.visibilityOf(int_summary_header));
		
		boolean summary_pg_header = int_summary_header.isDisplayed();
		if(summary_pg_header==true) {
			System.out.println("Intermediate Summary page header is displayed");
		}
		else {
			System.out.println("Intermediate Summary page header is not displayed");
		}
		
	}
	public void int_summary_subheader(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(10));
		wait.until(ExpectedConditions.visibilityOf(int_summary_header));
		
		boolean summary_pg_header = int_summary_header.isDisplayed();
		if(summary_pg_header==true) {
			System.out.println("Intermediate Summary page header is displayed");
		}
		else {
			System.out.println("Intermediate Summary page header is not displayed");
		}
		
	}
	
	
}
	




