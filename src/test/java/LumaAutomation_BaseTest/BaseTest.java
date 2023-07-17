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
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-dev-shm-usage");
		options.addArguments("--no-sandbox");
		options.addArguments("--headless");
		driver = new ChromeDriver(options);
		System.out.println(driver);
		//driver.get("https://www.google.com/");
		driver.get(configObj.getApplicationUrl());
		
	}

	@AfterTest
	public void tearDown() {
		driver.close();

	}
}