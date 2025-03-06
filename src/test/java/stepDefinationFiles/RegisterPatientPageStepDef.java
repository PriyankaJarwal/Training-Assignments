package stepDefinationFiles;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import basePackage.BaseClass;
import io.cucumber.java.en.*;
import pageLayer.InpatientWardPage;
import pageLayer.LoginPage;
import pageLayer.RegisterPatientPage;

public class RegisterPatientPageStepDef {

	WebDriver driver = BaseClass.driver;
	RegisterPatientPage regpt = new RegisterPatientPage(driver);
	String fname = "Virender";
	String mname = "Kishan";
	String lname = "Sehwag";
	String fullname = fname + " " + mname + " " + lname;

	@Given("User is on Register a patient page of OpenMRS")
	public void userIsOnRegisterPatientPage() {
		LoginPage lp = new LoginPage(driver);
		lp.enterUserName("admin");
		lp.enterPassword("Admin123");
		lp.selectLocationForSession("Inpatient Ward");
		lp.clickLoginButton();
		InpatientWardPage ipward = new InpatientWardPage(driver);
		ipward.clickOnRegisterPatient();
	}

	@When("User enters valid data in all fields")
	public void enterValidData() {

		regpt.enterFirstName(fname);
		regpt.enterMiddleName(mname);
		regpt.enterLastName(lname);
		regpt.clickNextButton();
		regpt.selectGender("Male");
		regpt.clickNextButton();
		regpt.enterBirthdateDay("1");
		regpt.selectBirthdateMonth("March");
		regpt.enterBirthdateYear("2000");
		regpt.clickNextButton();
		regpt.enterAddress("Balewadi");
		regpt.enterAddress2("Pune");
		regpt.enterCityVillage("Pune");
		regpt.enterStateProvince("Maharashtra");
		regpt.enterCountry("India");
		regpt.enterPostalCode("416416");
		regpt.clickNextButton();
		regpt.enterPhoneNumber("9988776655");
		regpt.clickNextButton();
		regpt.selectRelationshipType("Doctor");
		regpt.enterPersonName("Allu Arjun");
		regpt.clickNextButton();

	}

	@And("User click on confirm button")
	public void userClickOnConfirmButton() {
		regpt.clickConfirmButton();
	}

	@Then("User will see new patient is registerd")
	public void verifyPatientIsRegistred() throws InterruptedException {
		Thread.sleep(2000);
		String actualText = driver.findElement(By.xpath("//i[@class='icon-home small']// following :: li[1]"))
				.getText();
		Thread.sleep(2000);
		Assert.assertEquals(fullname, actualText);
	}

}
