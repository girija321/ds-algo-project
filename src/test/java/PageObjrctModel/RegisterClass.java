package PageObjrctModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class RegisterClass {
	public  WebDriver driver;
	
	   
	    By getStarted  = By.xpath("//button");
		By Register = By.xpath("//*[@id=\"navbarCollapse\"]/div[2]/ul/a[2]");
		public By Username = By.name("username");
		public By password = By.name("password1");
		By confirmPassword  = By.name("password2");
		By registerSubmit = By.xpath("//input[@type='submit']");
		By errorMessage  = By.xpath("//div[@role='alert']");
		By AlertMessage  = By.xpath("//div[@role='alert']");
		By SiginOut  = By.xpath("//a[text()='Sign out']");
		
		public RegisterClass(WebDriver driver) {
		this.driver=driver;	
		}
		public void clickOngetStarted() {
			driver.findElement(getStarted).click();
		}
		
		
		public void clickOnRegister() {
			driver.findElement(Register).click();
		}
		
		public void enterusername(String username) {
			driver.findElement(Username).sendKeys(username);
		}
		
		public void enterpassword(String Password) {
			driver.findElement(password).sendKeys(Password);
		}
		
		public void confirmpassword(String Password) {
			driver.findElement(confirmPassword).sendKeys(Password);
		}
		public void register() {
			driver.findElement(registerSubmit).click();
		}
		//public String messageValidation(By by) {
			//String usertext= driver.findElement(by).getAttribute("validationMessage");
			//return usertext;
			
			
		public String messageValidation() {
				driver.findElement(Username).clear();
				String usertext= driver.findElement(Username).getAttribute("validationMessage");
				System.out.println("user text box"+usertext);
				return usertext;
			
		}
		public String messageValidationforP() {
			driver.findElement(password).clear();
			String usertext= driver.findElement(password).getAttribute("validationMessage");
			System.out.println("Password text box"+usertext);
			return usertext;
		}
		public String messageValidationforPc() {
			 driver.findElement(confirmPassword).clear();
			String usertext= driver.findElement(confirmPassword).getAttribute("validationMessage");
			System.out.println("conforimPaww text box "+usertext);
			return usertext;
		}
		
		
		public void getErrorMessage() throws Throwable {
			//WebDriv
			//wait.until(ExpectedConditions.alertIsPresent());
			Thread.sleep(3000);
			WebElement text= driver.findElement(errorMessage);
			System.out.println(text.getText());
			}
		 public void GetTitle(){
			 String	text=driver.getTitle();
					System.out.println(text);
			 }
		 public void getAlertMessage() throws Throwable {
			    Thread.sleep(3000);
				WebElement Alerttext= driver.findElement(AlertMessage);
				System.out.println(Alerttext.getText());
				//driver.findElement(SiginOut).click();
		 }
		 
}		
		
		
			

			
		
		
		
		



