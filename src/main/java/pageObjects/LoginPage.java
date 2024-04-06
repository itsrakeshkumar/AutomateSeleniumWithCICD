package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver drv) {
		this.driver=drv;
		PageFactory.initElements(driver, this);
		
	}
	
	public void runLoginTest() {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		usernameTextField.sendKeys("test");
		passwordTextField.sendKeys("test");
		button.click();
	}

	
	@FindBy(xpath= "//*[contains(@id,'Username')]")
	WebElement usernameTextField;
	
	@FindBy(xpath = "//input[contains(@type,'pass')]")
	WebElement passwordTextField;
	
	@FindBy(css = "button[class*='sub']")
	WebElement button;
	
	
	
}
