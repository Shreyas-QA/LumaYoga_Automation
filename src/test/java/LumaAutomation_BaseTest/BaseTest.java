package LumaAutomation_BaseTest;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

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
		//System.setProperty("webdriver.chrome.driver", "//Users//shreyassambare//eclipse-workspace//com.LumaYoga.Automation"+configObj.getDriverPath());
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--disable-dev-shm-usage");
		options.addArguments("--no-sandbox");
		options.addArguments("--headless");
		driver = new ChromeDriver(options);
		System.out.println(driver);
	    driver.get(configObj.getApplicationUrl());
		System.out.println(configObj.getApplicationUrl());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}

	@AfterTest
	public void tearDown() {
		driver.close();

	}
}