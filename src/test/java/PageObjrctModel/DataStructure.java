package PageObjrctModel;

//public class DataStructure {
	//package PageObjrctModel;

	import java.time.Duration;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import Utlity.helpclass;

	public class DataStructure extends helpclass{
		public WebDriver driver;
		By GetStarted = By.xpath("//a[@href=\"data-structures-introduction\"]");
	    By TimeComplexity = By.xpath("//a[@href=\"time-complexity\"]");
	    By PractiseQuestions=By.xpath("//a[@href=\"/data-structures-introduction/practice\"]");
	    By TryHere = By.xpath("//a[@href=\"/tryEditor\"]");
	    By Textbox1=By.xpath("//div[@class=\"input\"]");
	    By Run=By.xpath("//button[@type=\"button\"]");
	   
	    public DataStructure (WebDriver driver) { 
	    	this.driver=driver;
	    }
	    public void clickongetstartedbttn() {
	    	driver.navigate().to("https://dsportalapp.herokuapp.com/home");
	       driver.findElement(GetStarted).click();
	       }
	    public void timecomplexity() {
	    	driver.findElement(TimeComplexity).click();
	    }
	    public void practisequestionbtn() {
	    	//movetoElement(driver.findElement(PractiseQuestions));
	   	 //clickOnWebelement(driver.findElement(PractiseQuestions), 10);
	    	driver.findElement(PractiseQuestions).click();
	    }
	    public void tryherebtn() {
	    	//movetoElement(driver.findElement(TryHere));
			//clickOnWebelement(driver.findElement(TryHere), 10);
	    	driver.findElement(TryHere).click();
	    }
	    public void enterOnTextbox(String text)  {
			// WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(15));
			//wait.until(ExpectedConditions.presenceOfElementLocated(Textbox1));
			Actions action= new Actions(driver);
			action.moveToElement(driver.findElement(Textbox1)).sendKeys(driver.findElement(Textbox1), text).build().perform();
		
		}
	    public void clickOnRun() {
			driver.findElement(Run).click();
			handleAlert();
		}
		
		}
		



