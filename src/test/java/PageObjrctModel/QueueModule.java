package PageObjrctModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utlity.HelperClass;

public class QueueModule extends HelperClass {
	WebDriver driver;
	By GetStarted = By.xpath("//a[@href='queue']");
	By ImplementationOfQueue = By.xpath("//a[@href='implementation-lists']");
	By Tryhere  = By.xpath("//a[text()='Try here>>>']");
	By Textbox   = By.xpath("//div[@class='input']");
	By Run   = By.xpath("//button[text()='Run']");
	By Output   = By.id("output");
	By ImplemetationUsingCollection  = By.xpath("//a[text()='Implementation using collections.deque']");  
	By ImplementationUsingArray  = By.xpath("//a[text()='Implementation using array']");
	By QueueOPerations  = By.xpath("//a[text()='Queue Operations']");
	By PracticQuestion  = By.xpath("//a[@href=\"/queue/practice\"]");

 public QueueModule(WebDriver driver) {
	 this.driver=driver;
 }
 
 public void clickOnQueueGetStarted() {
	// windoHandle("https://dsportalapp.herokuapp.com/home");
	 moveToElement(driver.findElement(GetStarted));
	clickOnWebelement(driver.findElement(GetStarted), 10);
 }
 public void clickOnImplementation() {
	 moveToElement(driver.findElement(ImplementationOfQueue));
	 clickOnWebelement(driver.findElement(ImplementationOfQueue), 10);
 }
 public void clickOnImplementationCollection() {
	 moveToElement(driver.findElement(ImplemetationUsingCollection));
	 clickOnWebelement(driver.findElement(ImplemetationUsingCollection), 10);
 }
 public void clickOnImplementationArray() {
	 moveToElement(driver.findElement(ImplementationUsingArray));
	 clickOnWebelement(driver.findElement(ImplementationUsingArray), 10);
 }
 public void clickOnQueueOperation() {
	 moveToElement(driver.findElement(QueueOPerations));
	 clickOnWebelement(driver.findElement(QueueOPerations), 10);
 }
 public void clickOnPracticeQuestion() {
	 moveToElement(driver.findElement(PracticQuestion));
	 clickOnWebelement(driver.findElement(PracticQuestion), 10);
 }
  public void clickOnTryHere() {
	  clickOnWebelement(driver.findElement(Tryhere), 10);
  }
  public void enterOnTextBox(String text) {
	  Actions action= new Actions(driver);
	 action.moveToElement(driver.findElement(Textbox)).sendKeys(driver.findElement(Textbox), text).build().perform();
	 
  }
  public void clickOnRun() {
	  clickOnWebelement(driver.findElement(Run), 10);
  }
  public void getOutput() {
	WebElement output= driver.findElement(Output);
	    output.getText();
	    System.out.println(output);
	  
  }
  
}