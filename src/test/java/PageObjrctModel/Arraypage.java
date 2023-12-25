package PageObjrctModel;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utlity.Helper;


public class Arraypage extends Helper {
         protected static String string = "Array";
         protected static String arr;
     protected static  JavascriptExecutor js;
	 static By dropdownmenu = By.xpath("//a[@class='nav-link dropdown-toggle\']");
	 static By getstarted1 = By.xpath("//a[@href='data-structures-introduction']");
     static By dropdownarray = By.xpath("//a[@href='/array']");
     static By Arrayinpython= By.xpath("//a[@href='arrays-in-python']");
     static By ArrayusingList = By.xpath("//a[@href='arrays-using-list']");
	 static By Basicoperations = By.xpath("//a[@href='basic-operations-in-lists']");
	 static By Applicationofarr =By.xpath("//a[@href='applications-of-array']");
	 static By tryhere = By.xpath("//a[@href='/tryEditor']");
	 protected static By texteditor = By.xpath("//div[@class='input']");
	 protected static By runbutt  = By.xpath("//button[@type='button']");
	 static By arraytxt = By.xpath("//p[@class='bg-secondary text-white']");
	 protected static By loginbutt = By.xpath("//input[@value='Login']");
	 static By signin = By.xpath("//a[@href='/login']");
	 static By pq= By.xpath("//a[@class='list-group-item list-group-item-light text-info']");
	 static By Sigin  = By.xpath("//a[text()='Sign in']");
	 static By Username = By.name("username");
	 static	By password = By.name("password");
	 static	By login  = By.xpath("//input[@type='submit']");
	 static	 By SiginOut  = By.xpath("//a[text()='Sign out']");
	
		 
			public void clickOnSignout() {
				driver.findElement(SiginOut).click();
			}
			
     
     protected static By output = By.id("output");
     protected static By Password = By.xpath("//*[@id='id_password']");
     
	   static By signout = By.xpath("//a[text()='Sign out']");  
	 @SuppressWarnings("unused")
	public static void clickgetstarted() throws InterruptedException {
	//	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		 
	//	 String url = driver.getCurrentUrl();
	//	 WebElement test  = driver.findElement(By.xpath("//div[contains(@class, 'bs-example')]"));
		 WebElement getstart = driver.findElement(getstarted1);
		 
		By getstartedd = RelativeLocator.with(By.tagName("a")).toRightOf(getstart);
        clickOnWebelement(driver.findElement(getstartedd),10);

		 }
	 
     public static String directoarraypage() {
    	 	arr = driver.getTitle();
             
             return arr;      
     }
     
     
     public static void dropdownarray() {
    	 driver.findElement(dropdownmenu).click();
    	 driver.findElement(dropdownarray).click();
    	 
     }
     public static void clickarrayinpython() {
    	 driver.findElement(Arrayinpython).click();
    	 
     }
     public static void Clicktryhere() {
    	 driver.findElement(tryhere).click();
     }
     public static void clickarrayusingll() {
    	 NavBack();
    	 
    	Actions ac = new Actions(driver);
    	// ac.scrollByAmount(0,0);
    	 WebElement  elements = driver.findElement(ArrayusingList);
    	 System.out.println("Array using list");
    	
     	// ac.setActiveWheel;
     	
          (ac.moveToElement(elements).click()).build().perform();

    //	 ScrollOrigin scrollorigin = null;
    	    	 
    	 
     }
     public static void clickbasicoper() {
    	 NavBack();
    	 Actions ac = new Actions(driver);
    	 WebElement  elements =	 driver.findElement(Basicoperations);
    	 
    	 (ac.moveToElement(elements).click()).build().perform();
     }     
     public static void clickappofarray() {
    	 NavBack();
    	 Actions ac = new Actions(driver);
    	 WebElement  elements = driver.findElement(Applicationofarr);
    	 (ac.moveToElement(elements).click()).build().perform(); 
     }
     @SuppressWarnings("unused")
	public static String entercode(String Code) {
    	 
    	WebElement element = driver.findElement(texteditor);
    	 
        clickOnWebelement(element,10);
    	 
    //	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
 	//	element= wait.until(ExpectedConditions.elementToBeClickable(element));
    	Actions act = new Actions(driver); 
    	//element.click();
    	//element.sendKeys(Code);
 		((act.moveToElement(element)).sendKeys(Code)).build().perform();
 					return Code;
     	
     }
     

     
     public static void clickonrun() {
    	 
    	 driver.findElement(runbutt).click();
     }
     
     public static void clickpq() {
    	 Actions ac = new Actions(driver);
    	 WebElement ele = driver.findElement(pq);
    	 (ac.moveToElement(ele)).click().build().perform();
    	 
    	 
    	 WebElement elements = driver.findElement(By.xpath("//a[@href=\"/question/1\"]"));
    	 (ac.moveToElement(elements).click()).build().perform(); 
    	 
    	 
	 WebElement element = driver.findElement(texteditor);
	 (ac.moveToElement(element)).click().build().perform();
    	} 
     

     public static void clickpq2() {
    	 
     	
	     Actions ac = new Actions(driver);
         WebElement pq2 = driver.findElement(By.xpath("//a[@href=\"/question/2\"]"));
    	 ac.moveToElement(pq2).click().build().perform();
    	 //driver.findElement(texteditor).clear();
    	 WebElement element = driver.findElement(texteditor);
    	 (ac.moveToElement(element)).click().build().perform();
        
     } 
     public static void clickpq3() {
    	 
       	
  	     Actions ac = new Actions(driver);
//    	 WebElement  elements = driver.findElement(Applicationofarr);
//    	 (ac.moveToElement(elements).click()).build().perform(); 
//    		
    		
    	 WebElement pq3 = driver.findElement(By.xpath("//a[@href=\"/question/3\"]"));
    	 ac.moveToElement(pq3).click().build().perform();
    //	 driver.findElement(texteditor).clear();
    	 WebElement element = driver.findElement(texteditor);
    	 
    	 (ac.moveToElement(element)).click().build().perform();
        
     } 
  	

     public static void clickpq4() {
    	 
      	
  	     Actions ac = new Actions(driver);
//    	 WebElement  elements = driver.findElement(Applicationofarr);
//    	 (ac.moveToElement(elements).click()).build().perform(); 
//    		
    		
    	 WebElement pq4 = driver.findElement(By.xpath("//a[@href=\"/question/4\"]"));
    	 ac.moveToElement(pq4).click().build().perform();
    	// driver.findElement(texteditor).clear();
    	 WebElement element = driver.findElement(texteditor);
    	 (ac.moveToElement(element)).click().build().perform();
        
     } 
  	
     public void enterUsername() {
 		driver.findElement(Username).sendKeys("Ninjabonds");
 		driver.findElement(password).sendKeys("Ninja@123");
 	}
 	
 	
 	public void enterLogin() {
 		driver.findElement(login).click();
     }
 	
 	public void clickonsignin() {
 		driver.findElement(signin).click();
     }

}

     
