package StepDefinations;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import PageObjrctModel.QueueModule;
import Utlity.BaseClass;
import apacheExcelSheet.ExcelReader;
import io.cucumber.java.en.*;

public class QueueSteps extends BaseClass {

	QueueModule queue;
	@Given("user is on home page after logged in")
	public void user_is_on_home_page_after_logged_in() {
	 queue = new QueueModule(BaseClass.driver);
	 queue.windoHandle("https://dsportalapp.herokuapp.com/home");
	}

	@When("user clicks queue button")
	public void user_clicks_queue_button() {
		 queue.clickOnQueueGetStarted();
	}

	@Then("user is on queue page")
	public void user_is_on_queue_page() {
	   driver.navigate().to("https://dsportalapp.herokuapp.com/queue/");
	}

	@When("user clicks implemetation of queue in python")
	public void user_clicks_implemetation_of_queue_in_python() {
	  queue.clickOnImplementation();
	}

	@When("user clicks TryHere")
	public void user_clicks_try_here() {
	  queue.clickOnTryHere();
	}

	@When("user enters {string} and rowNumber {int}")
	public void user_enters_and_row_number(String sheetName, Integer rowNumber) throws IOException, InvalidFormatException {
		ExcelReader reader = new ExcelReader();
		List<Map<String,String>> testData = 
		reader.getData("src/test/resources/TestData/testDataTextBox.xlsx", sheetName);
		String input = testData.get(rowNumber).get("Input");
	   // String output= testData.get(rowNumber).get("output");
		queue.enterOnTextBox(input);
	}

	@When("user clicks implementation using collection")
	public void user_clicks_implementation_using_collection() {
		queue = new QueueModule(BaseClass.driver);
		queue.clickOnImplementationCollection();
	}
	@When("user clicks implementation using array")
	public void user_clicks_implementation_using_array() {
		queue = new QueueModule(BaseClass.driver);
		queue.clickOnImplementationArray();
	}
	@When("user clicks queue operations")
	public void user_clicks_queue_operation() {
		queue = new QueueModule(BaseClass.driver);
		queue.clickOnQueueOperation(); 
	}
	@When("user clicks practic quection")
	public void user_clicks_practic_question() {
		queue = new QueueModule(BaseClass.driver);
		queue.clickOnPracticeQuestion();
	}
	@Then("user is on queue operation page")
	public void user_is_on_queue_operation_page() {
		 driver.navigate().to("https://dsportalapp.herokuapp.com/queue/QueueOp/");
	}
    
	@Then("user is on practic question page")
	public void user_is_on_practic_question_page() {
	  driver.getTitle();
	}

   @Then("user runbutton")
	public void user_runbutton() {
	  queue.clickOnRun();
	}

	@Then("user can see output")
	public void user_can_see_output() {
	   queue.getOutput();
	}


}
