package Utlity;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HelperClass {
	 By errorMessage  = By.xpath("//div[@role='alert']");
	 By AlertMessage  = By.xpath("//div[@role='alert']");
	 By sigin  = By.xpath("//a[@href=\"/login\"]");
	 By register  = By.xpath("//a[@href=\"/register\"]");
	 
	 
	 public void clickOnWebelement(WebElement element, long waitTimeSecond) {
		WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.ofSeconds(waitTimeSecond));
		element= wait.until(ExpectedConditions.elementToBeClickable(element));
          element.click();
	
	}
	 
	 public void sigin() {
	     clickOnWebelement(BaseClass.driver.findElement(sigin), 10);
		   } 
	 public void register() {
	     clickOnWebelement(BaseClass.driver.findElement(register), 10);
		   } 
  public void getErrorMessage() {
     WebElement errorText= BaseClass.driver.findElement(errorMessage);
     errorText.getText();
      System.out.println(errorText);
	   }
  
  public void getAlertMessage() {
		 WebElement Alerttext= BaseClass.driver.findElement(AlertMessage);
		System.out.println(Alerttext.getText());
        
 }
  
  public void moveToElement( WebElement element) {
	   Actions action = new Actions(BaseClass.driver);
	   action.moveToElement(element).build().perform();	  
  }
  public void handleAlert() {
        WebDriverWait wait = new WebDriverWait(BaseClass.driver,Duration.ofSeconds(30));
	    wait.until(ExpectedConditions.alertIsPresent());
	    Alert alt= BaseClass.driver.switchTo().alert();
	    alt.accept();
  }
  public void windoHandle(String url) {
	  BaseClass.driver.navigate().to(url);
  }
  public void enterdataInTextBox(WebElement element, String text) {
	  Actions action = new Actions(BaseClass.driver);
	  action.moveToElement(element).sendKeys(element, text).build().perform();
  }
  public String GetTitle() {
		String	text=BaseClass.driver.getTitle();
			System.out.println(text);
			return text;
  }
//  public String messageValidation(WebElement element) {
//	     String usertext= driver.findElement(element).getAttribute("validationMessage");
//		System.out.println("user text box"+usertext);
//		return usertext;
//  }
}
