package StepDefinations;


import org.junit.Assert;

import PageObjrctModel.RegisterClass;
import Utlity.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrySteps extends BaseClass {
	
	 
	 RegisterClass rst;
	
	 @Given("user is on registry page")
	 public void user_is_on_registry_page() {
       rst=new RegisterClass(BaseClass.driver);
       rst.clickOnRegister();
	   rst.GetTitle();
	 }

	 @When("user enter username {string} and password {string} and confirm password {string}")
	 public void user_enter_username_and_password_and_confirm_password(String username, String password, String confirmpassword) {
	    rst.enterusername(username); 
	    rst.enterpassword(confirmpassword);
	    rst.confirmpassword(confirmpassword);
	 }

	 @When("click on Register submit button")
	 public void click_on_register_submit_button() {
	    rst.register();
	 }
	 
	@Then("user gets errortext message {string}")
	public void user_gets_errortext_message(String messageValidate) throws InterruptedException {
		// Assert.assertEquals(messageValidate, rst.messageValidation(rst.Username)) ;
		// Assert.assertEquals(messageValidate, rst.messageValidation(rst.password)) ;
		Assert.assertEquals(messageValidate, rst.messageValidation()) ;
		Assert.assertEquals(messageValidate, rst.messageValidationforP()) ;
		Assert.assertEquals(messageValidate, rst.messageValidationforPc()) ;
	 }
  @Then("user gets error message {string}")
   public void user_gets_error_message(String string) throws Throwable {
      rst.getErrorMessage();
	 }
  @Then("user is on signin page gets alert {string}")
  public void user_is_on_signin_page_gets_alert(String string) throws Throwable {
	rst.getAlertMessage();
}
}
     

