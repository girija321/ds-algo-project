package PageObjrctModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utlity.BaseClass;
import Utlity.HelperClass;

public class loginClass extends HelperClass   {

	WebDriver driver;
	By Sigin  = By.xpath("//a[text()='Sign in']");
	By Username = By.name("username");
	By password = By.name("password");
	By login  = By.xpath("//input[@type='submit']");
	 By SiginOut  = By.xpath("//a[text()='Sign out']");
	
	
	public loginClass(WebDriver driver) {
		this.driver =driver;
	}
	public void clickOnSignin() {
		driver.findElement(Sigin).click();
	}
	public void clickOnSignout() {
		driver.findElement(SiginOut).click();
	}
	
	public void getTital() {
		driver.getTitle();
	}
	
	public void enterUsername(String username) {
		driver.findElement(Username).sendKeys(username);
	}
	
	public void enterPassword(String Password) {
		driver.findElement(password).sendKeys(Password);
	}
	public void enterLogin() {
		driver.findElement(login).click();
	}
	public String messageValidation() {
		driver.findElement(Username).clear();
		String usertext= driver.findElement(Username).getAttribute("validationMessage");
		System.out.println("user text box"+usertext);
		return usertext;
	}

	public String messageValidationforP() {
		driver.findElement(password).clear();
		String usertext= driver.findElement(password).getAttribute("validationMessage");
		System.out.println("Password text box"+usertext);
		return usertext;
	}
	
	
	
	
}
