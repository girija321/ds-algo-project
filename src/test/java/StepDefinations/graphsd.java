package StepDefinations;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import PageObjrctModel.Graph;
import PageObjrctModel.QueueModule;
//import PageObjrctModel.QueueModule;
import Utlity.BaseClass;
import apacheExcelSheet.ExcelReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class graphsd extends BaseClass {
	public  static Graph gp
	      = new Graph(BaseClass.driver);
	@Given("The user is in the Home page after logged in")
	public void the_user_is_in_the_home_page_after_logged_in() {
		driver.navigate().to("https://dsportalapp.herokuapp.com/home");
		//gp = new Graph(BaseClass.driver);
	}

	@When("The user clicks the Getting Started button in Graph Pane or select Graph item from the drop down menu")
	public void the_user_clicks_the_getting_started_button_in_graph_pane_or_select_graph_item_from_the_drop_down_menu() {
	    gp.clickongetstarted();
	}

	@Then("The user is in the Graph page after logged in")
	public void the_user_is_in_the_graph_page_after_logged_in() {
	    driver.navigate().to("https://dsportalapp.herokuapp.com/graph/");
	}

	/*@Given("The user is in the Graph page after logged in")
	public void the_user_is_in_the_graph_page_after_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}*/

	@When("The user clicks Graph button")
	public void the_user_clicks_graph_button() {
		 //driver.navigate().to("https://dsportalapp.herokuapp.com/graph/graph/");
	    gp.cickongraph();
	}

	@Then("The user should be directed to Graph introdution Page")
	public void the_user_should_be_directed_to_graph_introdution_page() {
		 driver.navigate().to("https://dsportalapp.herokuapp.com/graph/graph/");
	    //gp.gettitle();
	}

	@Then("The user clicks Try Here button")
	public void the_user_clicks_try_here_button() {
	   gp.Gtryhere();
	}

	@When("user is on asesment page")
	public void user_is_on_asesment_page() {
	   gp.gettitle();
	}

	@When("user Enters {string} and RowNumber {int}")
	public void user_enters_and_row_number(String sheetName, Integer rowNumber) throws Exception, IOException {
		ExcelReader reader = new ExcelReader();
		List<Map<String,String>> TestData = 
		reader.getData("C:\\GirijaCode\\ds-algo-project\\src\\test\\resources\\TestData\\datatablesheet.xlsx", sheetName);
		String input = TestData.get(rowNumber).get("Input");
	   // String output= testData.get(rowNumber).get("output");
		gp.entertext(input);
	}

	@Then("user Runbutton")
	public void user_runbutton() {
	    gp.clickonRun();
	}

	@Then("User can see output")
	public void user_can_see_output() {
	    gp.getOutput();
	}

	@When("The user clicks Graph Representations button")
	public void the_user_clicks_graph_representations_button() {
		//gp = new Graph(BaseClass.driver);
	    gp.clickongraphRP();
	}

	@Then("The user should be directed to Graph Representations Page")
	public void the_user_should_be_directed_to_graph_representations_page() {
	    gp.gettitle();
	}

	/*@When("The user should be directed to Graph introdution Page")
	public void the_user_should_be_directed_to_graph_introdution_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}*/

	@When("user click in the practise question button")
	public void user_click_in_the_practise_question_button() {
		gp= new Graph(BaseClass.driver);
	   gp.GraphPractiseQuestion();
	}

	@Then("user is on practise questions page")
	public void user_is_on_practise_questions_page() {
	    gp.gettitle();
	}



}