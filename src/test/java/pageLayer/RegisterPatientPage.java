package pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterPatientPage {

	By firstName = By.name("givenName");
	By middleName = By.name("middleName");
	By lastName = By.name("familyName");
	By nextButton = By.xpath("//icon[@class='fas fa-chevron-right']");
	By genderDropdown = By.name("gender");
	By birthdateDay = By.id("birthdateDay-field");
	By birthdateMonthDropdown = By.id("birthdateMonth-field");
	By birthdateYear = By.id("birthdateYear-field");
	By address = By.id("address1");
	By address2 = By.id("address2");
	By cityVillage = By.id("cityVillage");
	By stateProvince = By.id("stateProvince");
	By country = By.id("country");
	By postalCode = By.id("postalCode");
	By phoneNumber = By.name("phoneNumber");
	By relationshipTypeDropdown = By.id("relationship_type");
	By personName = By.xpath("//input[@placeholder='Person Name']");
	By confirm = By.id("submit");

	WebDriver driver;

	public RegisterPatientPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterFirstName(String firstname) {
		driver.findElement(firstName).sendKeys(firstname);
	}

	public void enterMiddleName(String middlename) {
		driver.findElement(middleName).sendKeys(middlename);
	}

	public void enterLastName(String lastname) {
		driver.findElement(lastName).sendKeys(lastname);
	}

	public void selectGender(String gender) {
		WebElement wb = driver.findElement(genderDropdown);
		selectDropdownElement(wb, gender);
	}

	public void enterBirthdateDay(String birthDate) {
		driver.findElement(birthdateDay).sendKeys(birthDate);
	}

	public void selectBirthdateMonth(String birthMonth) {
		WebElement wb = driver.findElement(birthdateMonthDropdown);
		selectDropdownElement(wb, birthMonth);
	}

	public void enterBirthdateYear(String birthYear) {
		driver.findElement(birthdateYear).sendKeys(birthYear);
	}

	public void enterAddress(String add) {
		driver.findElement(address).sendKeys(add);
	}

	public void enterAddress2(String add2) {
		driver.findElement(address2).sendKeys(add2);
	}

	public void enterCityVillage(String city) {
		driver.findElement(cityVillage).sendKeys(city);
	}

	public void enterStateProvince(String sp) {
		driver.findElement(stateProvince).sendKeys(sp);
	}

	public void enterCountry(String cnt) {
		driver.findElement(country).sendKeys(cnt);
	}

	public void enterPostalCode(String pc) {
		driver.findElement(postalCode).sendKeys(pc);
	}

	public void enterPhoneNumber(String phone) {
		driver.findElement(phoneNumber).sendKeys(phone);
	}

	public void selectRelationshipType(String relationship) {
		WebElement wb = driver.findElement(relationshipTypeDropdown);
		selectDropdownElement(wb, relationship);
	}

	public void enterPersonName(String pname) {
		driver.findElement(personName).sendKeys(pname);
	}

	public void clickNextButton() {
		driver.findElement(nextButton).click();
	}

	public void clickConfirmButton() {
		driver.findElement(confirm).click();
	}

	public void selectDropdownElement(WebElement wb, String value) {
		Select sel = new Select(wb);
		sel.selectByVisibleText(value);
	}

}
