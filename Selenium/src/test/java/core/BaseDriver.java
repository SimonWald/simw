package core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import utils.PropertyUtil;

public class BaseDriver {

	public WebDriver driver;
	String path = System.getProperty("user.dir");

	public void startSession() {
		try {
			PropertyUtil pus = new PropertyUtil(path + "\\selenium.properties");
			String browser = pus.getProperty("browser");
			String URL = pus.getProperty("URL");

			if (browser.equalsIgnoreCase("FireFox")) {
				System.setProperty("webdriver.geckodriver.driver", "C:\\automation\\Selenium\\geckodriver.exe");
				driver = new FirefoxDriver();
			} else if (browser.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\automation\\Selenium\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", "C:\\automation\\Selenium\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}

			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get(URL);
			driver.manage().window().maximize();

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void stopSession() {
		driver.quit();
	}

}
