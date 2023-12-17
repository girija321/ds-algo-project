package StepDefinations;


import PageObjrctModel.HomeModule;
import Utlity.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomeSteps extends BaseClass{ 
 	public HomeModule home;

@Given("user opens portal link")
public void user_opens_portal_link() {
	home=new HomeModule(driver);
  home.GetTitle();
}

@When("user clicks getStarted button")
public void user_clicks_get_started_button() {
  home.clickOngetStarted();
}

@Then("user should go to home page")
public void user_should_go_to_home_page() {
	home=new HomeModule(driver);
	home.GetTitle();
	System.out.println("user is on home page");
}
 @When("user click data structure dropdown")
	public void user_click_data_structure_dropdown() {
	home.clickOnDropdown();
	}
@Then("user select graph")
	public void user_select_graph() {
	  home.clickOnDropdownGraph(); 
	}
@Then("user gets error message for graph {string}")
	public void user_gets_error_message_for_graph(String string) {
	    home.getErrorMessage();
	}

@When("user can see different modules")
public void user_can_see_different_modules() {
   System.out.println("user can see modules");
}
@Then("user click array getStarted button")
public void user_click_array_get_started_button() {
    home.clickOnArray();
}

@When("user clicks register button")
public void user_clicks_register_button() {
    home.register();
}
@Then("user should go to register page {string}")
public void user_should_go_to_register_page(String text) {
	Assert.assertEquals(text, home.GetTitle()) ;
  System.out.println("user is on register page");
}

@When("user clicks signin button")
public void user_clicks_signin_button() {
   home.sigin();
}
@Then("user should go to sigin page {string}")
public void user_should_go_to_sigin_page(String text) {
	Assert.assertEquals(text, home.GetTitle()) ;
	System.out.println("useris on sigin page");
}















}





