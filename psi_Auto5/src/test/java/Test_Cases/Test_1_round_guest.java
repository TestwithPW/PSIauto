package Test_Cases;


import org.testng.annotations.Test;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import psi_POM.Add_idea_b15;
import psi_POM.Discuss_round;
import psi_POM.Enter_username;
import psi_POM.Final_summarypg;
import psi_POM.GetStartedpage_Guestlogin;
import psi_POM.Review_IdeasPg;
import psi_POM.Topic_Details_pg;
import psi_POM.Voting_round;
import psi_POM.WaitingRoomPg;

@Listeners(Utilities.Test_Listeners.class)
public class Test_1_round_guest extends BASE2.BaseClass2_userside  {


	@Test // /psi_Auto5/src/test/resources/Properties/classpath.txt
	public void get_started() throws InterruptedException  {
		System.out.println(System.getProperty("java.class.path"));
		GetStartedpage_Guestlogin gl = new GetStartedpage_Guestlogin(driver);
		Thread.sleep(2000);
	    gl.getstarted_btn();
	}

	@Test(priority=2)
	public void login_guest() throws InterruptedException  {
		Enter_username eu = new Enter_username(driver);

		eu.enter_name();
		eu.letsgo_click();
	}

	@Test(priority=3)
	public void gotit_click() throws InterruptedException  {
		Topic_Details_pg td =new Topic_Details_pg(driver);
		td.gotittabclick(driver);
	}

	@Test(priority=4)
	public void join_waitingroom() throws InterruptedException  {
		Add_idea_b15 Aib = new Add_idea_b15(driver);
		Thread.sleep(3000);
		Aib.join_disc_click(driver);
		Thread.sleep(3000);

	}

//	@Test(priority=3,dependsOnMethods="join_waitingroom")
//	public void audiosetup() throws InterruptedException  {
//		Add_idea_b15 Aib = new Add_idea_b15(driver);
//		Aib.ok_button_click(driver);
//		Thread.sleep(5000);
//		Aib.All_good_tab_click(driver);
//	}
	@Test(priority=5)
	public void add_idea() throws InterruptedException  {
		Add_idea_b15 Aib = new Add_idea_b15(driver);
		Aib.record_click(driver);
		Thread.sleep(5000);
		Aib.done_tab_click(driver);
		Thread.sleep(1000);
		Aib.Continue_tab_click(driver);
		Thread.sleep(2000);
		Aib.enter_title_tab_click(driver);
		Thread.sleep(2000);
		Aib.Continue_tab_click(driver);
		Aib.submit_tabclick();
		Aib.Continue_tab_click(driver);
	}

	@Test(priority=6)
	public void Waiting_room_header() throws InterruptedException  {
		WaitingRoomPg wpg= new WaitingRoomPg(driver);
		wpg.waiting_room_header(driver);
		wpg.type_message();
		Thread.sleep(2000);
		wpg.Send_message();
	}
	@Test(priority=7)
	public void Waiting_Send_msg_header() throws InterruptedException  {
		WaitingRoomPg wpg= new WaitingRoomPg(driver);
		wpg.type_message();
		Thread.sleep(2000);
		wpg.Send_message();

	}


	@Test(priority=8)
	public void Listen_idea()  {
		Review_IdeasPg ripg = new Review_IdeasPg(driver);
		ripg.Review_idea_header(driver);
		ripg.play_audio_click(driver);

	}
	@Test(priority=9, timeOut=10000)
	public void Close_review_modal() throws InterruptedException  {
		Review_IdeasPg ripg = new Review_IdeasPg(driver);
		Thread.sleep(6000);
		ripg.close_modal_click(driver);
	}
	@Test(priority=10)
	public void join_disc_early() throws InterruptedException  {
		Review_IdeasPg ripg = new Review_IdeasPg(driver);
		Thread.sleep(6000);
		ripg.join_disc_click(driver);
	}

	@Test(priority=11)
	public void Discuss()  {
		Discuss_round disc= new Discuss_round(driver);
		disc.Disc_modal_header1(driver);
		disc.mute_click(driver);
	}
	@Test(priority=12)
	public void View_idea_Disc() throws InterruptedException  {
		Discuss_round disc= new Discuss_round(driver);
		disc.Ideas_button();
		disc.View_ideas();
		Thread.sleep(2000);
		disc.Ideas_button();
	}
	@Test(priority=13)
	public void Send_message_Discuss() throws InterruptedException  {
		Discuss_round disc= new Discuss_round(driver);
		disc.chat_click();
		disc.chat_type_message();
		Thread.sleep(5000);
		disc.Send_message(driver);
	}
	@Test(priority=14)
	public void mute_Discuss() throws InterruptedException  {
		Discuss_round disc= new Discuss_round(driver);
		disc.mute_click(driver);
		Thread.sleep(6000);
		disc.mute_click(driver);
	}
	@Test(priority=15)
	public void Request_admin() throws InterruptedException  {
		Discuss_round disc= new Discuss_round(driver);
		disc.Bell_Request_admin();
		disc.Request_admin(driver);


	}

	@Test(priority=16)
	public void Flag_user()  {
		Discuss_round disc= new Discuss_round(driver);
		disc._Flag_click();
		disc.User_Check_report_click();
		disc.Continue_tab_click(driver);
//		disc.Flag_reason_check_click();
		disc.Flag_this_user_click();
		disc._Flag_click();

	}


	@Test(priority=32)
	public void Start_vote_click2()  {
		Voting_round start_vote = new Voting_round(driver);
		start_vote.start_vote_click(driver);


	}
	@Test(priority=33)
	public void vote_plus_click2()  {
		Voting_round start_vote = new Voting_round(driver);
		start_vote.inc_vote_click(driver);


	}
	@Test(priority=34)
	public void vote_dec_click2() throws InterruptedException  {
		Voting_round start_vote = new Voting_round(driver);
		start_vote.dec_vote_click(driver);
		Thread.sleep(1000);
		start_vote.inc_vote_click(driver);

	}

	@Test(priority=35)
	public void Vote_completed2()  {
		Voting_round start_vote = new Voting_round(driver);
		start_vote.voting_comlpleted(driver);

	}


	@Test(priority=36)
	public void Final_summary_header() {
		Final_summarypg FSpg = new Final_summarypg(driver);
		FSpg.summary_header(driver);

	}





}
