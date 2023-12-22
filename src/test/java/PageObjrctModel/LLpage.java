package PageObjrctModel;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utlity.Helper;

 public class LLpage extends Helper {
	 static By dropdownmenu = By.xpath("//a[@class='nav-link dropdown-toggle\']");
     static By dropdownll = By.xpath("//a[@href='/linked-list']");
     static By dropdownarray = By.xpath("//a[@href='array']");
     static By intro = By.xpath("//a[@href='introduction']");
     static By creatingll = By.xpath("//a[@href='creating-linked-list']");
	 static By Typesofll = By.xpath("//a[@href='types-of-linked-list']");
	 static By implement = By.xpath("//a[@href='implement-linked-list-in-python']");
	 static By Traversal =By.xpath("//a[@href='traversal']");
	 static By Insertion = By.xpath("//a[@href='insertion-in-linked-list']");
	 static By Deletion = By.xpath("//a[@href='deletion-in-linked-list']");
	 static By tryhere = By.xpath("//a[@href='/tryEditor']");
 
	 protected static By texteditor = By.xpath("//div[@class='input']");
	 protected static By runbutt  = By.xpath("//button[@type='button']");
	 static By arraytxt = By.xpath("//h4[@class='bg-secondary text-white']");
	 protected static By loginbutt = By.xpath("//input[@value='Login']");
	 static By signin = By.xpath("//a[@href='/login']");
	 static By pq= By.xpath("//a[@class='list-group-item list-group-item-light text-info']");
     
     protected static By output = By.id("output");
     protected static By Password = By.xpath("//*[@id='id_password']");
     
	   static By signout = By.xpath("//a[text()='Sign out']");  
	 @SuppressWarnings("unused")
	public static void clickgetstarted() throws InterruptedException {
	    WebElement getstart = driver.findElement(dropdownarray);
		 
		By getstartedd = RelativeLocator.with(By.tagName("a")).toRightOf(getstart);
        clickOnWebelement(driver.findElement(getstartedd),10);

		 }
	 

     
     public static void dropdownll() {
    	 driver.findElement(dropdownmenu).click();
    	 driver.findElement(dropdownll).click();
    	 
     }
     public static void clickintro() {
    	 driver.findElement(intro).click();
    	 
     }
     public static void Clickontryhere() {
    	 driver.findElement(tryhere).click();
     }
     public static void clickcreatingll() {
    	 NavBack();
    	 Actions act = new Actions(driver);
    	 WebElement  el = driver.findElement(creatingll);
         (act.moveToElement(el).click()).build().perform();     

    	  }
     public static void clicktypesll() {
    	 NavBack();
    	 Actions ac = new Actions(driver);
    	 WebElement  elem =	driver.findElement(Typesofll);
    	 
    	 (ac.moveToElement(elem).click()).build().perform();
     }     
     public static void clickimplement() {
    	 NavBack();
    	 Actions ac = new Actions(driver);
    	 WebElement  elements = driver.findElement(implement);
    	 (ac.moveToElement(elements).click()).build().perform(); 
     }
     public static void clicktraversal1() {
    	 NavBack();
    	 Actions ac = new Actions(driver);
    	 WebElement  elements = driver.findElement(Traversal);
    	 (ac.moveToElement(elements).click()).build().perform(); 
     }
     public static void clickinsertion() {
    	 NavBack();
    	 Actions ac = new Actions(driver);
    	 WebElement  elements = driver.findElement(Insertion);
    	 (ac.moveToElement(elements).click()).build().perform(); 
     }
     public static void clickdeletion(){
    	 NavBack();
    	 Actions ac = new Actions(driver);
    	 WebElement  elements = driver.findElement(Deletion);
    	 (ac.moveToElement(elements).click()).build().perform(); 
     }
     @SuppressWarnings("unused")
	public static String entercode(String Code) {
    	 
    	WebElement element = driver.findElement(texteditor);
    	 
        clickOnWebelement(element,10);
    	 
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
 		element= wait.until(ExpectedConditions.elementToBeClickable(element));
    	Actions act = new Actions(driver); 
    	//element.click();
    	//element.sendKeys(Code);
 		((act.moveToElement(element)).sendKeys(Code)).build().perform();
 					
         return Code;
     	
     }
     

     
     public static void clickrun() {
    	 
    	 driver.findElement(runbutt).click();
     }
     
  	
 }