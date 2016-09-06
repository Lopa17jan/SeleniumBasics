package crossBrowsweTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrsBrsTest {

	WebDriver driver;

	@BeforeTest
	@Parameters("browser")
	public void openBrowswer(String browser) {
		if (browser.equals("Firefox")) {
			driver = new FirefoxDriver();
		}

		else if (browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\user\\Desktop\\selenium wb\\browsers\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();

		}

		else if (browser.equals("IE")) {
			System.setProperty("webdriver.ie.driver",
					"C:\\Users\\user\\Desktop\\selenium wb\\browsers\\IEDriverServer_Win32_2.53.1 (1)\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();

		}

		else if (browser.equals("Opera")) {
			System.setProperty("webdriver.ie.driver",
					"C:\\Users\\user\\Desktop\\selenium wb\\browsers\\operadriver_win32\\operadriver.exe");
			driver = new OperaDriver();

		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");

	}

	@Test

	public void VerifyTitle() {
		String expectedTitle = "Facebook - Log In or Sign Up";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);

	}

	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}

}
