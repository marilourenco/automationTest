package firefoxScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;

	By username = By.id("username");
	By password = By.name("password");
	By loginButton = By.className("radius");
	By logoutButton = By.className("button secondary radius");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void realizeLogin(String user, String pass) {
		driver.findElement(username).sendKeys(user);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(loginButton).click();
	}

}
