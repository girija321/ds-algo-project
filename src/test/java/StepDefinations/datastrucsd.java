
package StepDefinations;

import PageObjrctModel.DataStructure;
//import PageObjrctModel.QueueModule;
import Utlity.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class datastrucsd extends BaseClass{
	public static DataStructure ds
	 = new DataStructure(BaseClass.driver);
	@Given("The user is in home page after log in")
	public void the_user_is_in_home_page_after_log_in() {
		//ds = new DataStructure(BaseClass.driver);
		 driver.navigate().to("https://dsportalapp.herokuapp.com/home");
	}
	@When("the user click get started button")
	public void the_user_click_get_started_button() {
	    ds.clickongetstartedbttn();
	}
	@When("The user is in the Data structures-Introduction page")
	public void the_user_is_in_the_data_structures_introduction_page() {
	    driver.navigate().to("https://dsportalapp.herokuapp.com/data-structures-introduction/");
	}

	@When("The user clicks Time Complexity button")
	public void the_user_clicks_time_complexity_button() {
	    ds.timecomplexity();
	}

	/*@Then("the user is in Time comlexity page of Data structure-introduction")
	public void the_user_is_in_time_comlexity_page_of_data_structure_introduction() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}*/

	@Given("the user is in Time comlexity page of Data structure-introduction")
	public void the_user_is_in_time_comlexity_page_of_data_structure_introduction() {
	    driver.navigate().to("https://dsportalapp.herokuapp.com/data-structures-introduction/time-complexity/");
	}

	@When("The user click in the Practise question button")
	public void the_user_click_in_the_practise_question_button() {
	    ds.practisequestionbtn();
	}

	@When("The user should be redirected to Practice Questions of Data structures-Introduction")
	public void the_user_should_be_redirected_to_practice_questions_of_data_structures_introduction() {
	    driver.getTitle();
	}

	/*@When("the user is in Time comlexity page of Data structure-introduction")
	public void the_user_is_in_time_complexity_page_of_data_structure_introduction() {
	    ds.gettitle();
	}*/


	@When("The user clicks on Try  button")
	public void the_user_clicks_on_try_button() {
	   ds.tryherebtn();
	}

	@Then("The user should be on assesment page")
	public void the_user_should_be_on_assesment_page() {
	    ds.gettitle();
	}

	@Then("the user enter {string}")
	public void the_user_enter(String text) {
	    ds.enterOnTextbox(text);
	}

	@When("the user click on run button")
	public void the_user_click_on_run_button() {
	    ds.clickOnRun();
	}



}


