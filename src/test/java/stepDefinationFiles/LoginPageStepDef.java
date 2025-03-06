package stepDefinationFiles;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import basePackage.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageLayer.LoginPage;

public class LoginPageStepDef {

	WebDriver driver = BaseClass.driver;
	LoginPage lp = new LoginPage(driver);

	@Given("User is on Login page of OpenMRS")
	public void launchOpenMRS() {
		driver.manage().window().maximize();
	}

	@When("User enters valid user name")
	public void enterValidUsername() {
		lp.enterUserName("admin");
	}

	@And("User enters valid password")
	public void enterValidPassword() {
		lp.enterPassword("Admin123");
	}

	@And("User selects location for this session")
	public void selectLocationForSession() {
		lp.selectLocationForSession("Inpatient Ward");
	}

	@And("User click on login button")
	public void clickOnLoginButton() {
		lp.clickLoginButton();
	}

	@Then("User will be on home page")
	public void verifyLoginSuccess() {
		Boolean success = driver.findElement(By.partialLinkText("Logout")).isDisplayed();
		Assert.assertEquals(true, success);
	}

}
