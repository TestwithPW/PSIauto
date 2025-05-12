package psi_POM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Createnewdiscussionpage {
	
	
	  
		

		
		@FindBy(xpath="//input[@data-test-id=\"discussion-title-inp\"]")
		private WebElement Enter_Title;
		@FindBy(xpath="//textarea[@data-test-id=\"short-description-inp\"]")
		private WebElement Short_Discription;
		@FindBy(xpath="//div[@class=\"rdw-image-wrapper\"]")
		private WebElement Image_text;
		@FindBy(xpath="/html/body/div[1]/div/div/main/div/main/div/form/div/div[3]/div[4]/div/div[2]/div/div/div/div[1]/div[2]/div[2]/div[1]/span[2]")
		private WebElement Enter_url;
		@FindBy(xpath="/html/body/div[1]/div/div/main/div/main/div/form/div/div[3]/div[4]/div/div[2]/div/div/div/div[1]/div[2]/div[2]/div[2]/input")
		private WebElement URL_textbox;
		@FindBy(xpath="//button[contains(text(),'Add')]")
		private WebElement Add_tab;
		@FindBy(xpath="//div[@Class='public-DraftStyleDefault-block public-DraftStyleDefault-ltr']")
		private WebElement Description;
		@FindBy(xpath="/html/body/div[1]/div/div/main/div/main/div/form/div/div[4]/div[2]/div[1]/div[1]/div[2]/div[1]/div/div/div/input")
		private WebElement Date_Time; // 
		@FindBy(xpath="//td[@title=\"2025-02-17\"]")
		private WebElement date;
		@FindBy(xpath="/html/body/div[3]/div/div/div/div/div[1]/div/div[2]/div[2]/ul[1]/li[4]")
		private WebElement hours;
		@FindBy(xpath="/html/body/div[3]/div/div/div/div/div[1]/div/div[2]/div[2]/ul[2]/li[29]")
		private WebElement minutes;
		
		// /html/body/div[3]/div/div/div/div/div[1]/div[2]/div[2]/ul[1]/li[11]/div
		@FindBy(xpath="//div[contains(text(),'PM')]")
		private WebElement PM;
		@FindBy(xpath="//span[contains(text(),'Ok')]")
		private WebElement Ok_tab;
		@FindBy(xpath="/html/body/div[1]/div/div/main/div/main/div/form/div/div[4]/div[2]/div[2]/div/div[2]/div/div/div/label[1]")
		private WebElement Time_2min;
		@FindBy(xpath="/html/body/div[1]/div/div/main/div/main/div/form/div/div[4]/div[2]/div[2]/div/div[2]/div/div/div/label[2]")
		private WebElement Time_5min;
		@FindBy(xpath="/html/body/div[1]/div/div/main/div/main/div/form/div/div[4]/div[2]/div[2]/div/div[2]/div/div/div/label[3]")
		private WebElement Time_10min;
		@FindBy(xpath="/html/body/div[1]/div/div/main/div/main/div/form/div/div[4]/div[2]/div[2]/div/div[2]/div/div/div/label[4]")
		private WebElement Time_15min;
		@FindBy(xpath= "/html/body/div[1]/div/div/main/div/main/div/form/div/div[4]/div[2]/div[4]/div/div[2]/div/div/div")
		private WebElement ppt_input ;
		@FindBy(xpath= "/html/body/div[1]/div/div/main/div/main/div/form/div/div[4]/div[2]/div[4]/div/div[2]/div/div/div/div[1]/span[2]")		
		private WebElement ppt_dec_tab ;
		@FindBy(xpath= "/html/body/div[1]/div/div/main/div/main/div/form/div/div[4]/div[2]/div[3]/div/div[2]/div/div/div/label[2] ")
		private WebElement PitchTime_2min ;
		@FindBy(xpath="/html/body/div[1]/div/div/main/div/main/div/form/div/div[4]/div[2]/div[3]/div/div[2]/div/div/div/label[2]")
		private WebElement PitchTime_1min;
		@FindBy(xpath="/html/body/div[1]/div/div/main/div/main/div/form/div/div[4]/div[2]/div[3]/div/div[2]/div/div/div/label[1]")
		private WebElement PitchTime_30sec;
		@FindBy(xpath="/html/body/div[1]/div/div/main/div/main/div/form/div/div[4]/div[2]/div[5]/div/div[2]/div/div/button")
		private WebElement RecordDisc_Tab;
		@FindBy(xpath="//input[@data-test-id=\"exit-survey-typeform-id-inp\"]")
		private WebElement Exit_survey_URL_Text;
		@FindBy(xpath="//button[@data-test-id=\"survey-switch\"]")
		private WebElement EnableSurvey_tab;
		@FindBy(xpath="//button[@data-test-id=\"pitch-moderation-switch\"]")
		private WebElement PitchModeration_Tab;
		@FindBy(xpath="//input[@data-test-id=\"restricted-words-inp\"]")
		private WebElement RestrictedWords;
		@FindBy(xpath="//button[@data-test-id=\"chat-switch\"]")
		private WebElement Chat_tab;
		@FindBy(xpath="//button[@data-test-id=\"pitch-audio-switch\"]")
		private WebElement PitchAudio_tab;
		@FindBy(xpath="//button[@data-test-id=\"anonymous-participation-switch\"]")
		private WebElement PartAnonymous_tab;
		@FindBy(xpath="//button[@data-test-id=\"guest-login-switch\"]")
		private WebElement Guest_tab;
		@FindBy(xpath="//button[@data-test-id=\"late-participants-switch\"]")
		private WebElement LateParticipant_tab ;
		@FindBy(xpath="//button[@data-test-id=\"list-for-public-switch\"]")
		private WebElement ListDiscussion_tab ;
		@FindBy(xpath="/html/body/div[1]/div/div/main/div/main/div/form/div/div[6]/div[2]/button[2]") 
		private WebElement save_draft_Tab;
		@FindBy(xpath="/html/body/div[1]/div/div/main/div/main/div/form/div/div[6]/div[2]/button[1]")
		private WebElement back_Tab;
		@FindBy(xpath="/html/body/div[1]/div/div/main/div/main/div/form/div/div[6]/div[2]/button[3]")
		private WebElement Publish_Tab;

		
		@FindBy(xpath="//div[@data-test-id=\"resource-select\"]")
		private WebElement res_drpdwn_field;
		@FindBy(xpath="//div[@data-test-id=\"resource-select\"]")
		private WebElement select_res_drpdwn_field;
		@FindBy(xpath="/html/body/div[1]/div/div/main/div/main/div/form/div/div[4]/div[4]/button")
		private WebElement Add_res_Tab;
		@FindBy(xpath="/html/body/div[5]/div/div[2]/div/div[1]/div/div[2]/div[2]/div/label[1]")
		private WebElement link_res_switch;
		@FindBy(xpath="/html/body/div[5]/div/div[2]/div/div[2]/div[2]/div[2]/div/label[2]")
		private WebElement file_res_switch;
		@FindBy(xpath="//button[@data-test-id=\"upload-resource-btn\"]")
		private WebElement upload_res_tab;
		@FindBy(xpath="//input[@placeholder=\"Enter the resource title\"]")
		private WebElement resource_name_field;
		@FindBy(xpath="//input[@data-test-id=\"resource-link-inp\"]")
		private WebElement res_link_field;
		@FindBy(xpath="/html/body/div[5]/div/div[2]/div/div[1]/div/div[3]/button[2]")
		private WebElement save_res_tab;
		@FindBy(xpath="/html/body/div[5]/div/div[2]/div/div[1]/div/div[3]/button[1]")
		private WebElement cancle_res_tab;
		
		// res_drpdwn_field  // select_res_drpdwn_field // Add_res_Tab // link_res_switch // file_res_switch // upload_res_tab
		
		// resource_name_field // res_link_field // save_res_tab // cancle_res_tab
		
		
		public Createnewdiscussionpage(WebDriver driver ){
			PageFactory.initElements(driver, this);	
		}
		
		
		public void Topic_Title() {
			// TODO Auto-generated method stub
			Enter_Title.sendKeys("Discussion Name goes here");
		}	
		public void ShortDiscsription() {
			
			 Short_Discription.sendKeys("As technology continues to develop rapidly, robots are becoming increasingly prevalent in our daily lives. They can be found in factories and other industrial settings, performing dangerous or difficult tasks for humans to do. But robots are also starting to appear in more mundane environments, such as homes and hospitals. ");

		}
		public void Long_Description() {

			 Description.sendKeys("Safety\r\n"
			 		+ "Robots are able to carry out tasks in hazardous environments such as the inside of a nuclear power plant or deep underwater. They can also shield humans from dangerous situations by working alongside us, such as flying planes or driving cars.\r\n"
			 		+ "\r\n"
			 		+ "Time Saving\r\n"
			 		+ "Many repetitive and arduous tasks can be carried out by robots, which means we don’t have to do them. This can increase productivity and free up time for more critical activities.\r\n"
			 		+ "\r\n"
			 		+ "Accessibility\r\n"
			 		+ "Robots offer people access to things that we wouldn’t otherwise be able to do. For example, a robot could carry heavy objects or assist someone in moving from one place to another as a wheelchair does for those who need assistance walking.\r\n"
			 		+ "\r\n"
			 		+ "Surveillance\r\n"
			 		+ "Robots can be equipped with cameras to give us a view of places that would otherwise be inaccessible or too dangerous for humans. This includes bomb disposal robots that enter hazardous situations and gather information before experts decide how to proceed.\r\n"
			 		+ "\r\n"
			 		+ "Lessens Loneliness\r\n"
			 		+ "Artificial intelligence (AI) robotic companions can keep people company when they’re alone, providing social interaction and making those who feel lonely less likely to become depressed. Whether it’s a robot that performs tasks with the person or one that simply provides companionship, robotic “friends” can make life more fulfilling for people of all ages.\r\n"
			 		+ "\r\n"
			 		+ "Productivity\r\n"
			 		+ "Robots reduce human efforts and increase productivity within the workplace by taking on dangerous jobs that humans don’t want to do. This could be mundane activities such as vacuuming or more complex jobs like assembling components in a factory-type environment.\r\n"
			 		+ "\r\n"
			 		+ "Improved Operation\r\n"
			 		+ "Robots can also improve the operation of systems such as computer networks and electrical grids. They can repair problems without people having to step in, which means greater productivity and faster response times if there is a need to fix an issue.\r\n"
			 		+ "\r\n"
			 		+ "Less Human Errors\r\n"
			 		+ "Robots can ensure better accuracy within the workplace, which reduces the likelihood of human error. When robots work alongside humans, they can help reduce mistakes by carrying out critical tasks without humans having to risk their lives.");
			
			 Image_text.click();
			
			 Enter_url.click();
			
			 URL_textbox.sendKeys("https://images.freeimages.com/images/large-previews/398/le-tour-eiffel-3-1550405.jpg");
			
			 Add_tab.click();
		}
		
		public void SetDate_Time() throws InterruptedException  {
			Date_Time.click();
//			Thread.sleep(5000);
//			Date_Time.sendKeys(Keys.CONTROL+"a");
			Thread.sleep(3000);
//			Date_Time.sendKeys("2025-01-15 22:10");
//			Thread.sleep(5000);
			date.click();
			hours.click();
			minutes.click();
			PM.click();
			Ok_tab.click();
		}
		
		public void Set_Time15() {
			Time_15min.click();	
		}
		public void Set_Time10() {
			Time_10min.click();	
		}
		public void Set_Time5() {
			Time_5min.click();
		}
		public void Set_Time2() {
			Time_2min.click();
		}
		public void decrease_participants_per_table() {
			ppt_input.click();
			ppt_dec_tab.click();
			ppt_dec_tab.click();
			ppt_dec_tab.click();
		}

		public void setPitchTime() {	
			
			PitchTime_2min.click();
			PitchTime_1min.click();
			PitchTime_30sec.click();
		}
		
		public void Record_Tab_disable() {
			RecordDisc_Tab.click();//disable
		}
		
		public void Record_Tab_eanled() {
			RecordDisc_Tab.click();//disable
			RecordDisc_Tab.click();//enable
		}
		public void URL() {
			// TODO Auto-generated method stub
			Exit_survey_URL_Text.sendKeys("https://www.searchenginejournal.com/chrome-devtools-technical-seo-audits/344103/");
		}
		public void Enable_Surevy_disable() {		
			EnableSurvey_tab.click();   //ON	
			EnableSurvey_tab.click(); //OFF
		}
		public void Enable_Surevy_enable() {		
			EnableSurvey_tab.click();   //ON	
		}
		public void Pitch_Moderation() {
			
			PitchModeration_Tab.click();
			RestrictedWords.sendKeys("Red, Yellow, Black, Blue, Green");
			
		}
		public void Chat_Enable() {//default enabled	
			Chat_tab.click();
			Chat_tab.click();
		}
		public void Chat_disable() {//default enabled
			Chat_tab.click();
		}
		public void PitchAudio_Enable() {//default enabled
			PitchAudio_tab.click();
			PitchAudio_tab.click();
		}
		public void PitchAudio_disable() {//default enabled
			PitchAudio_tab.click();
		}
		public void Participant_Anonymous() {	//default disabled
			PartAnonymous_tab.click();
		}
		public void AllowGuest() {//default disabled
			Guest_tab.click();
		}
		public void LateParticipant() {//default disabled
			LateParticipant_tab.click();
		}
		public void DiscussionList_Org() {	
			ListDiscussion_tab.click();
		}
		
		public void Back() {	
			back_Tab.click();
		}
		public void save_as_draft() {	
			save_draft_Tab.click();
		}
	
		public void Publish() {	
			Publish_Tab.click();
		}
		
		public void res_drpdwn_click() {	
			res_drpdwn_field.click();
		}
		public void select_res_drpdwn() {	
			select_res_drpdwn_field.click();
		}
		public void Add_res_click() {	
			Add_res_Tab.click();
		}
		public void link_tab_click() {	
			link_res_switch.click();
		}
		public void file_tab_click() {	
			file_res_switch.click();
		}
		public void upload_res_click() {	
			upload_res_tab.click();
		}
		public void enter_res_name() {	
			resource_name_field.sendKeys("Resorce name entered");
		}
		public void enter_res_link() {	
			res_link_field.sendKeys("https://images.freeimages.com/images/large-previews/398/le-tour-eiffel-3-1550405.jpg");
		}
		public void save__res_click() {	
			save_res_tab.click();
		}
		public void cancle_res_click() {	
			cancle_res_tab.click();
		}
		
		// res_drpdwn_click // select_res_drpdwn // Add_res_click //  link_tab_click // file_tab_click // upload_res_click
		// enter_res_name // enter_res_link // save__res_click // cancle_res_click
}













