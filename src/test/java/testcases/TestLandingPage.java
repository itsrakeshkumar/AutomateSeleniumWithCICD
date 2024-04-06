package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageObjects.LoginPage;

public class TestLandingPage {
	@Test
	public void setupDriver() {
		WebDriver driver = new ChromeDriver();
		LoginPage login = new LoginPage(driver);
		login.runLoginTest();
		
	}

}
