package Test_Cases;



import org.testng.annotations.Test;
import BASE2.BaseClass2_userside;
import psi_POM.Add_idea_b15;
import psi_POM.Add_idea_module;
import psi_POM.Discuss_round;
import psi_POM.Enter_username;
import psi_POM.Final_summarypg;
import psi_POM.GetStartedpage_Guestlogin;
import psi_POM.GetStartedpage_RegisterUser;
import psi_POM.Loginpage_RegUser;
import psi_POM.Review_IdeasPg;
import psi_POM.Topic_Details_pg;
import psi_POM.WaitingRoomPg;

public class Test_registered_user extends BaseClass2_userside {


	
	
	@Test()
	public void login_reg() throws InterruptedException  {
		
		GetStartedpage_RegisterUser rl = new GetStartedpage_RegisterUser(driver);
		rl.Thenlgnhere_btn();		
	}
	@Test(priority=1, dependsOnMethods="login_reg")
	public void login_reguser() throws InterruptedException  {
		
		Loginpage_RegUser lru = new Loginpage_RegUser(driver);
		lru.Send_username();
		lru.Send_Password();
		lru.loginIn_btn();
	}
	@Test(priority=2,dependsOnMethods="close_hdw")
	public void join_disc() throws InterruptedException  {	
		
		Add_idea_b15 adi =new Add_idea_b15(driver);
//		adi.joindis_click();
	
	}
	@Test(priority=3,dependsOnMethods="join_disc")
	public void add_idea() throws InterruptedException  {	

	
	
	}
	
	@Test(priority=4,dependsOnMethods="add_idea")
	public void waitingroom() throws InterruptedException  {
		WaitingRoomPg wr = new WaitingRoomPg(driver);
		Thread.sleep(1000);
		wr.unmuteRq_btn();
		wr.reaction_btn();
//		wr.leave_btn();
//		Thread.sleep(1000);
//		wr.goback_btn();
//		wr.test_audio_btn()
//		wr.close_test_audio_btn();
//		wr.type_message();
//		Thread.sleep(1000);
//		wr.Send_message();		
		
	}
	
	@Test(priority=5,dependsOnMethods="waitingroom")
	public void review_idea() throws InterruptedException  {
	
		Review_IdeasPg ripg = new  Review_IdeasPg(driver);
//		td.closetab();
		Thread.sleep(2000);
		ripg.play_audio_click(driver);	
////		Thread.sleep(20000);
//		ripg.joinDiscR();
	}
	
//	@Test(priority=6,dependsOnMethods="review_idea")
//	public void discussion_room() throws InterruptedException  {
//
//		Discuss_Vote_round dvr = new Discuss_Vote_round(driver);
//
//		dvr.mute_click();//unmute
//
//
//		dvr.Send_message();
//		dvr.unmute_click();//mute
//
//		dvr.Send_message();
//
//		dvr.mute_click();
//	
////		dvr.vote_inc_click();
////		dvr.reaction_click();dvr.vote_dec_click();
//
//		Final_summarypg fsp = new Final_summarypg(driver);
//		fsp.view_click(driver);
//		Thread.sleep(3000);
//		driver.navigate().back();
//		
//	}
	
	
	
	
	

	
	

	
	

}
