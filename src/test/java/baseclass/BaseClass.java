package baseclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;

public class BaseClass {
	public static WebDriver driver;

	@BeforeClass(alwaysRun=true)
	public void setup(@Optional("chrome") String browser) {

		switch (browser.toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		default:
			driver = new ChromeDriver();

		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.google.com");

	}

	@BeforeMethod
	public void configBM() {
		// login method if required

	}

	@AfterMethod
	public void configAM() {
		// logout if required

	}

	@AfterClass(alwaysRun=true)
	public void teardown() {
		if (driver != null) {
			driver.quit();
		}

	}

}
