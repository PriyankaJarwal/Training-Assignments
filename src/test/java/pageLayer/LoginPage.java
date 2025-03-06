package pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	By username = By.id("username");
	By password = By.id("password");
	By ipWard = By.id("Inpatient Ward");
	By loginButton = By.id("loginButton");

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterUserName(String usname) {
		driver.findElement(username).sendKeys(usname);
	}

	public void enterPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}

	public void selectLocationForSession(String location) {
		driver.findElement(ipWard).click();
	}

	public void clickLoginButton() {
		driver.findElement(loginButton).click();
	}

}
