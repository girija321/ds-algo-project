package ApplicationHooks;

import Utlity.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

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
	public void tearDown() {
		//baseclass.driver.close();
		System.out.println("close the browser");
	}
	
}
