package Utlity;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class helpclass extends BaseClass {
	By errorMessage  = By.xpath("//div[@role='alert']");
	public static WebDriverWait wait ;
    public final static int TIMEOUT = 2;
	public void gettitle() {
		String text=driver.getTitle();
		System.out.println(text);
	}
	 public void clickOnWebelement(WebElement element, long waitTimeSecond) {
			WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.ofSeconds(waitTimeSecond));
			element= wait.until(ExpectedConditions.elementToBeClickable(element));
	          element.click();
	 }
  /* public static void waitmethod() throws InterruptedException {
	wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));	
}*/
public void movetoElement(WebElement element) {
    Actions action=new Actions(BaseClass.driver);
   action.moveToElement(element).build().perform();
} 
public void handleAlert() {
    WebDriverWait wait = new WebDriverWait(BaseClass.driver,Duration.ofSeconds(30));
    wait.until(ExpectedConditions.alertIsPresent());
    Alert alt= BaseClass.driver.switchTo().alert();
    alt.accept();
}
public void enterdataInTextBox(WebElement element, String text) {
	  Actions action = new Actions(BaseClass.driver);
	  action.moveToElement(element).sendKeys(element, text).build().perform();
}
public void getErrorMessage() {
    WebElement errorText= BaseClass.driver.findElement(errorMessage);
    errorText.getText();
     System.out.println(errorText);
	   }
public void windoHandle(String url) {
	  BaseClass.driver.navigate().to(url);
}
	 }
//public class helpclass {

//}
