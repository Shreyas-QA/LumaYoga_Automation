package LumaAutomation_Tests;

import org.testng.annotations.Test;

import LumaAutomation_BaseTest.BaseTest;
import LumaAutomation_Pages.Luma_RegistrationPage;



public class Luma_RegistrationTests  extends BaseTest{
	
	
	Luma_RegistrationPage rpage;

	@Test(priority = 1)
	public void Navigate_To_Registration_Page() {

		rpage = new Luma_RegistrationPage(driver);
		rpage.ClickOnCreateAccountButton();

	}

	@Test(priority = 2)
	public void enter_userDetails() {

	}

}
