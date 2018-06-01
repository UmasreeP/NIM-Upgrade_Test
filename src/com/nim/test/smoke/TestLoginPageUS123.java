package com.nim.test.smoke;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nim.test.config.TestConfig;
import com.nim.ui.objects.LoginPage;

public class TestLoginPageUS123 {
	WebDriver driver;
	LoginPage loginPage;
		@BeforeMethod
		public void preCondition()
		{
			driver = TestConfig.getDriverInstance();
			loginPage = new LoginPage(driver);
		}
		@AfterMethod
		public void postCondition()
		{
			driver.close();
		}
		@Test
		public void testLoginPageTC123()
		{
			loginPage.waitForPageToLoad();
			String actualTitle = driver.getTitle();
			String expectedTitle = "actiTIME - Login";
			Assert.assertEquals(actualTitle, expectedTitle);
			boolean actualStatus = loginPage.getLoginButton().isEnabled();
			Assert.assertEquals(actualStatus, true);
		}
}
