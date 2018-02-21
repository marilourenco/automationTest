package firefoxScriptsTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import firefoxScripts.LoginPage;

public class VerifyTheInternetLogin {

	WebDriver driver;

	@BeforeTest
	public void init() {
		driver = new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver", "/automationTest/geckodriver.exe");
		driver.manage().window().maximize();
	}

	@Test
	public void verifyValidLogin() {
		driver.get("http://the-internet.herokuapp.com/login");
		LoginPage login = new LoginPage(driver);
		login.realizeLogin("tomsmith", "SuperSecretPassword!");
	}

}
