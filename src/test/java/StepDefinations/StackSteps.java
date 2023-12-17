package StepDefinations;



import org.junit.Assert;

import PageObjrctModel.StackModule;
import Utlity.BaseClass;
import io.cucumber.java.en.*;

public class StackSteps extends BaseClass {
	StackModule stack;
	@Given("user is on Stack page after logged in")
	public void user_is_on_stack_page_after_logged_in() {
	   stack=new StackModule(driver);
	   stack.clickGetstarted();
	   stack.GetTitle();
	}
	@Given("user is on implementation page")
	public void user_is_on_implemetation_page() {
		driver.navigate().back();
	}
	
	@Given("user is on Application page")
	public void user_is_on_Application_page() {
		driver.navigate().back();
	}

	@When("user clicks Operations in Stack button")
	public void user_clicks_operations_in_stack_button() {
	   stack.clickOperations();
	}
	@Then("user should be directed to Operations in Stack Page")
	public void user_should_be_directed_to_operations_in_stack_page() {
		 stack.GetTitle() ;
	}
	@When("user clicks Implementation button")
	public void user_clicks_implementation_button() {
		stack=new StackModule(driver);
	   stack.clickOnImplemetation();
	}
	@Then("user should be directed to Implementation Page")
	public void user_should_be_directed_to_implementation_page() {
	  stack.GetTitle(); 
	}
   @When("user clicks Applications button")
	public void user_clicks_applications_button() {
	  stack=new StackModule(driver);
	  stack.clickOnApplications();
	}

	@Then("user should be directed to Applications Page")
	public void user_should_be_directed_to_applications_page() {
	 stack.GetTitle();
	}
    
	@When("user clicks on try hrer button")
	public void user_clicks_on_try_hrer_button() {
	    stack.clickOnTryHere();
	}

	@Then("user should be directed to Assesment page")
	public void user_should_be_directed_to_assesment_page() {
	   stack.GetTitle();
	}
	
	@When("user enters {string}")
	public void user_enters(String text) {
	System.out.println("i am on textbox");	
	  stack.enterOnTextbox(text);
	}
	
   @Then("user enters run button")
   public void user_enters_run_button() {
	   System.out.println("I am on  run button");
	  stack.clickOnRun(); 
   }
  
	
}
