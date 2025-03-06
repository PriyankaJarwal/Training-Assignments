package pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InpatientWardPage {

	By registerPatient = By.partialLinkText("Register a patient");
	By findPatientRecord = By.partialLinkText("Find Patient Record");

	WebDriver driver;

	public InpatientWardPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnRegisterPatient() {
		driver.findElement(registerPatient).click();
	}

	public void clickOnFindPatientRecord() {
		driver.findElement(findPatientRecord).click();
	}

}
