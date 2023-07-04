package LumaAutomation_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Luma_RegistrationPage {

	WebDriver driver;

	@FindBy(xpath = "//div[@class='panel header']/ul/li/a[contains(text(),'Create an Account')]")
	WebElement CreateAcctButton;

	public Luma_RegistrationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void ClickOnCreateAccountButton() {
		CreateAcctButton.click();
	}

}
