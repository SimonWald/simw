package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	WebDriver driver;

	// Enter message field
	@FindBy(xpath = "//input[@type='text' and @id='user-message']")
	public static WebElement EnterMessage;

	// Enter message field
	@FindBy(xpath = "//*[@id='get-input']/button")
	public static WebElement ShowMessageButton;

	// Enter message field
	@FindBy(id = "display")
	public static WebElement displayMessage;

}
