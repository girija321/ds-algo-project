package PageObjrctModel;



import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utlity.BaseClass;
import Utlity.HelperClass;

public class StackModule extends HelperClass {
	WebDriver driver;
	
	By GetStarted = By.xpath("//a[@href='stack']");
	By Operations = By.xpath("//a[@href='operations-in-stack']");
	By Implementataion  = By.xpath("//a[text()='Implementation']"); 
	By Applications  = By.xpath("//a[text()='Applications']");
	By Tryhere   = By.xpath("//a[@href='/tryEditor']");
	By Textbox   = By.xpath("//div[@class='input']");
	By Run   = By.xpath("//button[text()='Run']");
	By practiceQuestion  = By.xpath("//button[text()='Run']");
	By Sigin  = By.xpath("//a[text()='Sign in']"); 
	By Username = By.name("username");
	By password = By.name("password");
	By login  = By.xpath("//input[@type='submit']");
	By Message  = By.xpath("//p[text()='Operations in Stack']");
	
	
	public StackModule(WebDriver driver) {
	   this.driver=driver;
	}
	public void clickGetstarted( ) {
		moveToElement(driver.findElement(GetStarted));
		clickOnWebelement(driver.findElement(GetStarted), 10 );
		clickOnWebelement(driver.findElement(Sigin), 5);
		driver.findElement(Username).sendKeys("Nijabonds");
		driver.findElement(password).sendKeys("Ninja@123");
		driver.findElement(login).click();
		clickOnWebelement(driver.findElement(GetStarted), 10 );
	}
	
	public void clickOperations() {
		clickOnWebelement(driver.findElement(Operations), 10);
	
		
	}
	public void clickOnTryHere() {
		moveToElement(driver.findElement(Tryhere));
		clickOnWebelement(driver.findElement(Tryhere), 10);
	}
	
	public void clickOnImplemetation() {
		
		moveToElement(driver.findElement(Implementataion));
	    clickOnWebelement(driver.findElement(Implementataion),10);
	}
	public void clickOnApplications() {
		windoHandle("https://dsportalapp.herokuapp.com/stack/operations-in-stack/");
		clickOnWebelement(driver.findElement(Applications), 10);
		
		//double t =((WebElement) Applications).getLocation().x;
		//double S =((WebElement)Applications).getLocation().y;
		 //System.out.println(+t+ "and"+S);
		//Actions act= new Actions(driver);
		
	}
	
	public void enterOnTextbox(String text)  {
		 WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.presenceOfElementLocated(Textbox));
		Actions action= new Actions(driver);
		action.moveToElement(driver.findElement(Textbox)).sendKeys(driver.findElement(Textbox), text).build().perform();
	
	}
	
	
	public void clickOnRun() {
		clickOnWebelement(driver.findElement(Run), 10);
		handleAlert();
	}
	
		
		
	
		
	}

