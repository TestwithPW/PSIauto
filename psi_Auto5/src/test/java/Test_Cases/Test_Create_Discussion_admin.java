package Test_Cases;


import org.testng.annotations.Test;

import BASE2.BaseClass;
import psi_POM.CreateDiscussiontab;
import psi_POM.Createnewdiscussionpage;
import psi_POM.Loginpage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;


@Listeners(Utilities.Test_Listeners.class)
public class Test_Create_Discussion_admin extends BaseClass{
	
	@Test()
	public void lgn() {//org admin loign 
		Loginpage lp = new Loginpage(driver);
		lp.Send_username();
		lp.Send_Password();
		lp.SignIn_btn();
	}
	@Test(priority=2)
	public void clickokayfortrailpopup() {//navigate to create new discussion page
		CreateDiscussiontab cd= new CreateDiscussiontab(driver);
		cd.Okay_btn(driver);
	}

	
	@Test(priority=3)
	public void cretenewdiscussionclick() {//navigate to create new discussion page
		CreateDiscussiontab cd= new CreateDiscussiontab(driver);
		cd.NewDiss_btn();
	}
	
	@Test(priority=4)
	public void entertitle() {//enter discussion details 
		Createnewdiscussionpage cnd =new Createnewdiscussionpage(driver);
		cnd.Topic_Title();
	}
	@Test(priority=5)
	public void entershortd() {//enter discussion details 
		Createnewdiscussionpage cnd =new Createnewdiscussionpage(driver);
		cnd.ShortDiscsription();
	}
	@Test(priority=6)
	public void enterdescrption() {//enter discussion details 
		Createnewdiscussionpage cnd =new Createnewdiscussionpage(driver);
		cnd.Long_Description();
	}
	
	@Test(priority=7)
	public void setdatetime() throws InterruptedException {//enter discussion details 
		Createnewdiscussionpage cnd =new Createnewdiscussionpage(driver);
		cnd.SetDate_Time();
	}
	@Test(priority=8)
	public void set_pitch_time() {//enter discussion details 
		Createnewdiscussionpage cnd =new Createnewdiscussionpage(driver);
		cnd.Set_Time2();
		cnd.setPitchTime();
	}
	
	@Test(priority=9)
	public void set_partcipant_per_tbl() {//enter discussion details 
		Createnewdiscussionpage cnd =new Createnewdiscussionpage(driver);
//		cnd.Set_Time2();		
		cnd.decrease_participants_per_table();	
	}
	
	
	@Test(priority=10)
	public void click_record_disc() {//enter discussion details 
		Createnewdiscussionpage cnd =new Createnewdiscussionpage(driver);	
		cnd.Record_Tab_eanled();
	}
	
	@Test(priority=11)
	public void exit_survey_URL() {//enter discussion details 
		Createnewdiscussionpage cnd =new Createnewdiscussionpage(driver);	
		cnd.URL();
	}
	
	@Test(priority=12)
	public void Enable_disable_syrvey() {//enter discussion details 
		Createnewdiscussionpage cnd =new Createnewdiscussionpage(driver);	
		cnd.Enable_Surevy_disable();
	}
	
	
	@Test(priority=13)
	public void Enable_disable_pitch_moderation() {//enter discussion details 
		Createnewdiscussionpage cnd =new Createnewdiscussionpage(driver);	
		cnd.Pitch_Moderation();
	}
	
	@Test(priority=14)
	public void Enable_disable_chat() {//enter discussion details 
		Createnewdiscussionpage cnd =new Createnewdiscussionpage(driver);	
		cnd.Chat_Enable();
	}
	
	@Test(priority=15)
	public void Enable_disable_pitch_audio() {//enter discussion details 
		Createnewdiscussionpage cnd =new Createnewdiscussionpage(driver);	
		cnd.PitchAudio_Enable();
	}
	@Test(priority=16)
	public void Enable_disable_Anonymous() {//enter discussion details 
		Createnewdiscussionpage cnd =new Createnewdiscussionpage(driver);	
		cnd.Participant_Anonymous();
	}
	@Test(priority=17)
	public void Enable_disable_Guest() {//enter discussion details 
		Createnewdiscussionpage cnd =new Createnewdiscussionpage(driver);	
		cnd.AllowGuest();
	}
	@Test(priority=18)
	public void Enable_disable_late_user() {//enter discussion details 
		Createnewdiscussionpage cnd =new Createnewdiscussionpage(driver);	
		cnd.LateParticipant();
	}
	@Test(priority=19)
	public void Enable_disable_Disc_listing() {//enter discussion details 
		Createnewdiscussionpage cnd =new Createnewdiscussionpage(driver);	
		cnd.DiscussionList_Org();
	}
	@Test(priority=20)
	public void selecting_res_from_drpdwn() throws InterruptedException {//enter discussion details 
		Createnewdiscussionpage cnd =new Createnewdiscussionpage(driver);	
		cnd.res_drpdwn_click();
		Thread.sleep(2000);
		cnd.select_res_drpdwn();
		
	}
	
	@Test(priority=21)
	public void adding_link_res() throws InterruptedException {//enter discussion details 
		Createnewdiscussionpage cnd =new Createnewdiscussionpage(driver);	
		cnd.Add_res_click();
		Thread.sleep(3000);
		cnd.link_tab_click();
		cnd.enter_res_name();
		cnd.enter_res_link();
		cnd.save__res_click();
	}

	// res_drpdwn_click // select_res_drpdwn // Add_res_click //  link_tab_click // file_tab_click // upload_res_click
			// enter_res_name // enter_res_link // save__res_click // cancle_res_click
	
	@Test(priority=22)
	public void published() throws InterruptedException {//enter discussion details 
		Createnewdiscussionpage cnd =new Createnewdiscussionpage(driver);
		cnd.Publish();	
		Thread.sleep(3000);
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}

}



