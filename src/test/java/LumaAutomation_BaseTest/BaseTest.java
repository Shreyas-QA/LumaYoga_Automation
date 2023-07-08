package LumaAutomation_BaseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
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
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--no-sandbox");
		driver = new ChromeDriver(options);
		driver.get(configObj.getApplicationUrl());
		driver.manage().window().maximize();
	}

	@AfterTest
	public void tearDown() {
		driver.close();

	}
}