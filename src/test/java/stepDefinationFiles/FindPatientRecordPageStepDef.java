package stepDefinationFiles;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import basePackage.BaseClass;
import io.cucumber.java.en.*;
import pageLayer.FindPatientRecordPage;
import pageLayer.InpatientWardPage;
import pageLayer.LoginPage;

public class FindPatientRecordPageStepDef {

	WebDriver driver = BaseClass.driver;
	FindPatientRecordPage fpr = new FindPatientRecordPage(driver);
	String newBirthYear = "1998";
	String searchname = "Niel Nitin Mukesh";

	@Given("User is on Find Patient Record page of OpenMRS")
	public void userIsOnFindPatientRecordPage() {
		LoginPage lp = new LoginPage(driver);
		lp.enterUserName("admin");
		lp.enterPassword("Admin123");
		lp.selectLocationForSession("Inpatient Ward");
		lp.clickLoginButton();
		InpatientWardPage ipward = new InpatientWardPage(driver);
		ipward.clickOnFindPatientRecord();
	}

	@When("User enters valid existing patient name in search box")
	public void enterValidExistingPatientName() throws InterruptedException {
		fpr.enterPatientNameForSearch(searchname);
		Thread.sleep(2000);
	}

	@And("User click on the patient name in the table")
	public void clickOnPatientName() {
		fpr.clickOnPatientRecord();
	}

	@And("User click on edit link")
	public void clickOnEditLink() throws InterruptedException {
		fpr.clickOnEditPageLink();
		Thread.sleep(2000);
	}

	@And("User update the data for patient")
	public void updateData() {
		fpr.clickOnBirthdatePageLink();
		fpr.enterBirthYear(newBirthYear);
		fpr.clickNextButton();
	}

	@And("User click on confirm button on update page")
	public void userClickOnConfirmButton() {
		fpr.clickConfirmButton();
	}

	@Then("User will see the data is updated for existing patient")
	public void verifyPatientDataIsUpdated() throws InterruptedException {
		Thread.sleep(2000);
		String actualText = driver.findElement(By.xpath("//span[contains(text(),'Male')]//following :: span[1]"))
				.getText();
		Thread.sleep(2000);
		Boolean b = actualText.contains(newBirthYear);
		Assert.assertEquals(true, b);
	}

}
