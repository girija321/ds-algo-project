package Utlity;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	
	public static WebDriver driver;
	public  String browser="chrome";
	
	public BaseClass(){
		initializDriver();
	}
  public  void initializDriver() {
		if (driver==null) {
		if (browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}
		if (browser.equalsIgnoreCase("firefox")) {
			driver= new FirefoxDriver();
		}
		if (browser.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}
		driver.get("https://dsportalapp.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		}
		
	}
	
	
	 
	 
	 
	 
	 
	
	 
	 

}
