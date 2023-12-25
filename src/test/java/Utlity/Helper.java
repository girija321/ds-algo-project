package Utlity;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import StepDefinations.BaseClass;

public class Helper extends BaseClass {
    public static Helper Helper;    
    public static WebDriver driver;
    // public static WebDriverWait 
 ;
    public final static int TIMEOUT = 10;
    
    public Helper() {
    	if(driver == null) {
    		driver = new ChromeDriver();
    	   //  wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
    	     
    	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
    	     driver.manage().window().maximize();																																																										driver.manage().window().maximize();
    	}  
	// Helper.driver = driver;
    }
    public static void clickOnWebelement(WebElement element, long waitTimeSecond) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(waitTimeSecond));
		element= wait.until(ExpectedConditions.elementToBeClickable(element));
          element.click();
          
    }
          
    public static void initiatdriver() {
     /*	
     driver = new ChromeDriver();
     wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
     System.out.println(wait);
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
     driver.manage().window().maximize(); */
       }
    public static void openPage(String URL) {
        driver.navigate().to("https://dsportalapp.herokuapp.com/home");
    }
    public static String getTitle() {
        return driver.getTitle();
    }
    public static void NavBack() {
     driver.navigate().back();
    }
    public static void Navrefresh() {
        driver.navigate().refresh();
       }
    public static void waitmethod() throws InterruptedException {
    	//wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));	
    }

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
    
    
    public static WebDriver getDriver() {
     return driver;
                                        }

     public static void tearDown() {
         if(driver!=null) {
             driver.close();
             driver.quit();
         }
         
         if(driver!=null) {
             driver.close();
             driver.quit();
         }
         
         Helper = null;
     }
          
    }