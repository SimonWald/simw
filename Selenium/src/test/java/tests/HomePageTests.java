package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import core.BaseDriver;
import pages.HomePage;

public class HomePageTests extends BaseDriver {

	@BeforeMethod
	public void beforeMethod() {
		startSession();
		PageFactory.initElements(driver, HomePage.class);
	}

	@Test(priority=3 , groups="Santiy,Regression,License")
	public void Test1() {
		HomePage.EnterMessage.sendKeys("Dudi");
		HomePage.ShowMessageButton.click();
		//Assert.assertEquals("dudi", HomePage.displayMessage.getText());
		Assert.assertTrue(HomePage.displayMessage.isDisplayed());

	}
	
	@Test(priority=1, groups="Santiy")
	public void Test2() {
		HomePage.EnterMessage.sendKeys("Dudi");
		HomePage.ShowMessageButton.click();
		//Assert.assertEquals("dudi", HomePage.displayMessage.getText());
		Assert.assertTrue(HomePage.displayMessage.isDisplayed());

	}
	
	@Test(priority=2)
	public void Test3() {
		HomePage.EnterMessage.sendKeys("Dudi");
		HomePage.ShowMessageButton.click();
		//Assert.assertEquals("dudi", HomePage.displayMessage.getText());
		Assert.assertTrue(HomePage.displayMessage.isDisplayed());

	}

	@AfterMethod
	public void afterMethod() {
		stopSession();
	}

}
