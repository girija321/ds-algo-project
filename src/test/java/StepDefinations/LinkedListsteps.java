package StepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

import PageObjrctModel.LLpage;
import Utlity.loggerLoad;
import apacheExcelSheet.ExcelReaderc;


public class LinkedListsteps extends LLpage{
	
	
	private String excelFlPath;
	 public String Input;

	 
	 
	 @Given("User is in hompage")
	 public void user_is_in_hompage() throws InterruptedException {
			
		 System.out.println("User is in homepage");
	 }
	 @When("User clicks the Getting Started button in Linked List Pane")
	 public void user_clicks_the_getting_started_button_in_Linked_List_pane() throws InterruptedException {
	     
		 clickgetstarted();    
	 }

	 @Then("User be directed to Linked List Data Structure Page")
	 public void user_be_directed_to_Linked_List_data_structure_page() {
	     
	     System.out.println("Linked List pages");
	     logger.info("User is directed to Linked List pages");
	 }

	 @When("User select Linked List item from the drop down menu")
	 public void user_select_Linked_List_item_from_the_drop_down_menu() {
	  
	     NavBack();
	     dropdownll();
	 }

	 @Then("User be directed to Linked List Data Structure Pages")
	 public void user_be_directed_to_Linked_List_data_structure_pages() {
	     
	     System.out.println("Linked List page");
	     
	 }
	 
	 @When("The user clicks {string} buttons")
	  public static void The_user_clicks_buttonss(String string) {
		 clickintro();
		 
	 }
	 @Then("The user should be redirected to {string} pages")
	    public void The_user_should_be_redirected(String string) {
	    	
	    	
         String str = string;
         System.out.println(str);
	    	
	    }
	 @When("The user clicks {string} button in Linked List in Python page")
	    	public void The_user_clicks_button_in_Linked_List_in_Python_page(String string) {
	    		
	    	Clickontryhere();
	    }
	 @Then("The user should be redirected to a page having an tryEditor with a Run button")
	    public void The_user_should_be_redirected_to_page_with_tryEditor_with_a_Run_button() {
	    	System.out.println("The user should be redirected to a page having an tryEditor with a Run button to test");
	    }

	 @Given("The excel is located {string}")
	 public void the_excel_is_located(String string) {
	     
		 excelFlPath = string;
		 
	 }

	 @When("User enters sheetname as {string} and RowNumber {int}")
	 public void user_enters_sheetname_as_rowNumber(String Sheetname,Integer RowNumber) throws Exception {
	     
	     ExcelReaderc reader = new ExcelReaderc();
	     
	     List<Map<String,String>> testdata = reader.getData(excelFlPath,Sheetname);

	     Input =  testdata.get(RowNumber).get("Input");
	     
	    if (Input!= null) { 
	    	
	    entercode(Input);
	    }
	    else
	    {
	    logger.warn("Input is Null: Please check excel sheet");	
	    }
	    
	    
	                    }
	 @When("User clicks on run buttons")
	 public void user_clicks_on_run_buttonss() {
		 clickrun();
		
	 }
	 @Then("output {string} generated")
     public void is_generated(String string) {
           System.out.println(string);
           loggerLoad.info("Validate the output");
           
           NavBack();
           clickcreatingll();
           Clickontryhere();
           entercode(Input);
           clickrun();
           NavBack();
           clicktypesll();
           Clickontryhere();
           entercode(Input);
           clickrun();
           NavBack();
           clickimplement();
           Clickontryhere();
           entercode(Input);
           clickrun();
           NavBack();
           clicktraversal1();
           Clickontryhere();
           entercode(Input);
           clickrun();
           NavBack();
           clickinsertion();
           Clickontryhere();
           entercode(Input);
           clickrun();
           NavBack();
           clickdeletion();
           Clickontryhere();
           entercode(Input);
           clickrun();
           NavBack();
           NavBack();
           
           
           
           
     }
}