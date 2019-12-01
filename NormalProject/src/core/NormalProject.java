package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NormalProject {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\automation\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Navigate into Website
		driver.get("http://www.store.demoqa.com");

		// Get page title
		String title = driver.getTitle();
		// Print the get title on console
		System.out.println(title);

		// Get page source code
		String PageSource = driver.getPageSource();
		System.out.println(PageSource);

		driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
		driver.findElement(By.id("user-message")).sendKeys("Dudi");
		driver.findElement(By.xpath("//*[@id='get-input']/button")).click();
		Thread.sleep(10000);

		WebElement element = driver.findElement(By.id("user-message"));
		boolean status = element.isEnabled();
		if (status)
			element.sendKeys("Yesssss");

		// Navigation commands
		// driver.navigate().back();
		// Thread.sleep(5000);
		// driver.navigate().forward();
		// Thread.sleep(5000);
		// driver.navigate().refresh();

		// Close the driver
		driver.quit();
	}
}