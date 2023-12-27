package StepDefinations;

import java.sql.DriverManager;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import PageObjrctModel.Arraypage;
import apacheExcelSheet.ExcelReaderc;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ArraySteps extends Arraypage{
	
	 private String excelFilePath;
	 public String Input;
	 public static ExtentReports extent = null ;
	 public static ExtentTest scenario = null;
	 
	 
	 
	 @Given("User is in homepage")
	 public void user_is_in_homepage() throws InterruptedException {
			
		 System.out.println("User is in homepage");
		 
		 openPage("https://dsportalapp.herokuapp.com/home");
		 	
	    	ExtentSparkReporter spark = new ExtentSparkReporter("target/test/SparkReport/spark.html");
	    	
	    	extent = new ExtentReports();
	    	extent.attachReporter(spark);
	    	scenario = extent.createTest("Sample Feature Test2");
	    	
	    	clickonsignin();
	    	 enterUsername();
	    	 enterLogin();	    	
	 }

	 @When("User clicks the Getting Started button in Array Pane")
	 public void user_clicks_the_getting_started_button_in_array_pane() throws InterruptedException {
	     
		 clickgetstarted();
		 
		 
	 }

	 @Then("User be directed to Array Data Structure Page")
	 public void user_be_directed_to_array_data_structure_page() {
	     
	     System.out.println("Array pages");
	     
	    
	 }

	 @When("User select Array item from the drop down menu")
	 public void user_select_array_item_from_the_drop_down_menu() {
	  
	     NavBack();
	     dropdownarray();
	 }

	 @Then("User be directed to Array Data Structure Pages")
	 public void user_be_directed_to_array_data_structure_pages() {
	     
	     System.out.println("Array page");
	    
	     
	     
	 }
	 
	 @When("The user clicks {string} button")
	  public static void The_user_clicks_button(String string) {
		 
		 clickarrayinpython();
		 
		// extent.createTest("MyFirstTest").assignAuthor("aventstack").pass("details");
		 scenario.log(Status.INFO,"Running the Array in python in feature file");
		 
	 }
	    @Then("The user should be redirected to {string} page")
	    public void The_user_should_be_redirected_to_page(String string) {
	    
	    	System.out.println(string);
	    	directoarraypage();
	    	Assert.assertTrue("Verification passed:Element1 and Element2 are same.",arr.equals(string)) ;
	    	
	        extent.flush();
	    	
	    }
	    @When("The user clicks {string} button in Arrays in Python page")
	    	public void The_user_clicks_button_in_Arrays_in_Python_page(String string) {
	    		
	    	Clicktryhere();
	    }
	    @Then("The user should be redirected to a page having an tryEditor with a Run button to test")
	    public void The_user_should_be_redirected_to_page_with_tryEditor_with_a_Run_button_to_test() {
	    	System.out.println("The user should be redirected to a page having an tryEditor with a Run button to test");
	    }

	 @Given("The excel file is located {string}")
	 public void the_excel_file_is_located(String string) {
	     // Write code here that turns the phrase above into concrete actions
		 excelFilePath = string;
		 
	 }

	 @When("User enters sheetname as {string} and rowNumber {int}")
	 public void user_enters_sheetname_as_and_rowNumber_rowNumber(String Sheetname,Integer RowNumber) throws Exception {
	     
	     ExcelReaderc reader = new ExcelReaderc();
	     
	     List<Map<String,String>> testdata = reader.getData(excelFilePath,Sheetname);

	     Input =  testdata.get(RowNumber).get("Input");
	     
	    if (Input!= null) { 
	    Arraypage.entercode(Input);
	    
	    }
	 }
	 @When("User clicks on run button")
	 public void user_clicks_on_run_button() {
		 clickonrun();
		
	 }
	 @Then("output {string} is generated")
     public void is_generated(String string) {
           System.out.println(string);
           NavBack();
           clickarrayusingll();
           Clicktryhere();
           Arraypage.entercode(Input);
           clickonrun();
           NavBack();
           clickbasicoper();
           Clicktryhere();
           Arraypage.entercode(Input);
           clickonrun();
           NavBack();
           clickappofarray();
           Clicktryhere();
           Arraypage.entercode(Input);
           clickonrun();
           NavBack();
           clickpq();
           NavBack();
           clickpq2();
           NavBack();
           clickpq3();
           NavBack();
           clickpq4();
           NavBack();
           NavBack();
           NavBack();
           NavBack();
           
           
           
           
     }
     }
     


