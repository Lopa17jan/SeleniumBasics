package crossBrowsweTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DifferentBrowser {
	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\selenium wb\\browsers\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		//driver.get("https://facebook.com");
		
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\user\\Desktop\\selenium wb\\browsers\\IEDriverServer_Win32_2.53.1 (1)\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("https://facebook.com");
		
		
	}

}
