package ApplicationHooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Utlity.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import java.io.ByteArrayInputStream;

public class hooks {
   
	BaseClass baseclass;
	@Before("@Module")
	public void loginsetUp(Scenario sc) {
//		BaseClass baseClass= new BaseClass();
//		baseClass.initializDriver();
//		baseClass.clickOngetStarted();
//		loginClass lp = new loginClass(BaseClass.driver);
//		lp.clickOnSignin();
//		lp.enterUsername("Nijabonds");
//		lp.enterPassword("Ninja@123");
//		lp.enterLogin();
		
		
		System.out.println("sepUp");
	
	}
	
 
	
	@After
	public void tearDown(Scenario scenario) {
		if(scenario.isFailed())
		{
			byte[] screenshort=((TakesScreenshot)BaseClass.driver).getScreenshotAs(OutputType.BYTES);
			Allure.addAttachment("failed screenshort", new ByteArrayInputStream (screenshort));
			

		}
		
		//baseclass.driver.close();
		System.out.println("close the browser");
	}





	}
	

