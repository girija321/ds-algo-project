package Utlity;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Helper {
    public static Helper Helper;    
    public static WebDriver driver;
    public static Logger logger;
 
    public final static int TIMEOUT = 10;
   
    
  
    public Helper() {
    	logger = LogManager.getLogger(Helper.class);
    	if(driver == null) {
    		driver = new ChromeDriver();
    	  
    	     
    	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
    	     driver.manage().window().maximize();																																																										driver.manage().window().maximize();
    	}  
	
    }
    public static void clickOnWebelement(WebElement element, long waitTimeSecond) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(waitTimeSecond));
		element= wait.until(ExpectedConditions.elementToBeClickable(element));
          element.click();
          
    }
          
       public static void openPage(String URL) {
        driver.navigate().to("https://dsportalapp.herokuapp.com/home");
        logger.info("opened Ds-slgo-page");
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