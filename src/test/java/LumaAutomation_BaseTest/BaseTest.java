package LumaAutomation_BaseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Utilities.AppConfig;

public class BaseTest {

	public static WebDriver driver;
	AppConfig configObj;

	@BeforeTest
	public void setup() {

		configObj = new AppConfig();
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + configObj.getDriverPath());
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(configObj.getApplicationUrl());
	}

	@AfterTest
	public void tearDown() {
		driver.close();

	}
}