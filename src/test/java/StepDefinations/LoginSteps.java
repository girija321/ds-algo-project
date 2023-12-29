package StepDefinations;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import PageObjrctModel.loginClass;
import Utlity.BaseClass;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class LoginSteps extends BaseClass {

	loginClass lp;
	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("I am on sign page");
	     lp=new loginClass(driver);
         lp.clickOnSignin(); 
          lp.getTital(); 
	}

	@When("user enter user name as {string} and password as {string}")
	public void user_enter_user_name_as_and_password_as(String username, String password) {
		lp.enterUsername(username);
		lp.enterPassword(password);
		 }
	
	@When("user enter below details")
	public void user_enter_below_details(DataTable dataTable) {
//	    Map<String, String> map = dataTable.asMap(String.class,String.class);
//		   lp.enterPassword(map.get("Username"));
//		   lp.enterPassword(map.get("password"));
	   List<String> list = dataTable.row(0) ;
	     lp.enterUsername( list.get(0));   
	     lp.enterPassword(list.get(0));    //   map.get("password");
	}
	@Then("user gets errortext below password test {string}")
	public void user_gets_errortext_below_password_test(String errortext) {
		Assert.assertEquals(errortext, lp.messageValidationforP()) ;
	}
	
    @Then("user click login button")
	public void user_click_login_button() {
		lp.enterLogin();
	}


	@Then("user gets error message")
	public void user_gets_error_message() {
		lp.getErrorMessage();
	}

	@Then("user is on sigout page")
	public void user_is_on_sigout_page() {
		lp.getAlertMessage();
        lp.clickOnSignout(); 
		
	}

}
