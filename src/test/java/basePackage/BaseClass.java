package basePackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseClass {

	public static WebDriver driver;

	@Before
	public void setUp() {

		driver = new ChromeDriver();
		driver.get("https://o2.openmrs.org/openmrs/login.htm");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}

	@After
	public void teardown() {
		driver.close();
	}

}
