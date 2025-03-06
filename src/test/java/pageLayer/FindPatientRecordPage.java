package pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FindPatientRecordPage {

	By searchBox = By.xpath("//input[@id='patient-search']");
	By patientRecord = By.xpath("//tbody/tr[1]");
	By editPage = By.partialLinkText("Edit");
	By birthdatePage = By.xpath("//span[@id='birthdateLabel']");
	By birthdateYear = By.id("birthdateYear-field");
	By nextButton = By.xpath("//icon[@class='fas fa-chevron-right']");
	By confirm = By.id("registration-submit");

	WebDriver driver;

	public FindPatientRecordPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterPatientNameForSearch(String ptname) {
		driver.findElement(searchBox).sendKeys(ptname);
	}

	public void clickOnPatientRecord() {
		driver.findElement(patientRecord).click();
	}

	public void clickOnEditPageLink() {
		driver.findElement(editPage).click();
	}

	public void clickOnBirthdatePageLink() {
		driver.findElement(birthdatePage).click();
	}

	public void enterBirthYear(String birthyear) {
		driver.findElement(birthdateYear).clear();
		driver.findElement(birthdateYear).sendKeys(birthyear);
	}

	public void clickNextButton() {
		driver.findElement(nextButton).click();
	}

	public void clickConfirmButton() {
		driver.findElement(confirm).click();
	}

}
