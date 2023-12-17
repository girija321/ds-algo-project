package PageObjrctModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utlity.HelperClass;

public class HomeModule extends HelperClass {
	WebDriver driver;
	By getStarted  = By.xpath("//button");
	By AlertMessage  = By.xpath("//div[@role='alert']");
	By SiginOut  = By.xpath("//a[text()='Sign out']");
	By dropdown  = By.xpath("//a[@class=\"nav-link dropdown-toggle\"]");
	By dropdownGraph  = By.xpath("//a[text()=\"Graph\"]");
	By Array  = By.xpath("//a[@href=\"array\"]");
	
	public HomeModule(WebDriver driver) {
	 this.driver=driver;}
	
	 public void clickOngetStarted() {
			driver.findElement(getStarted).click();
	 }
	  public void getAlertMessage() {
			WebElement Alerttext= driver.findElement(AlertMessage);
			System.out.println(Alerttext.getText());
	         driver.findElement(SiginOut).click();
	   }
	  
	  public void clickOnDropdown() {
		  clickOnWebelement(driver.findElement(dropdown), 10);
	  }
	  
	  public void clickOnDropdownGraph() {
		  clickOnWebelement(driver.findElement(dropdownGraph), 10);
	  }  
	  public void clickOnArray() {
		  clickOnWebelement(driver.findElement(Array), 10);
	  }

 
      

}


