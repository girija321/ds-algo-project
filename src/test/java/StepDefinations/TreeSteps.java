package StepDefinations;

import PageObjrctModel.TreeModule;
import Utlity.BaseClass;
import io.cucumber.java.en.*;

public class TreeSteps extends BaseClass {
	TreeModule tree;
	@Given("user is homepage after logged in")
	public void user_is_homepage_after_logged_in() {
	   tree=new TreeModule(BaseClass.driver);
	   tree.clickOnTreeGetStarted();
	}

	@When("user clicks overview of trees")
	public void user_clicks_overview_of_trees() {
	   tree.clickOnOverView();
	}

	@Then("user clicks tryhere button")         
	public void user_clicks_tryhere_button() {
	   tree.clickOnTryHere();
	}

	@When("user is on assesment page")
	public void user_is_on_assesment_page() {
	    
	}
	@When("user enter {string}")
	public void user_enters(String text) {
	    tree.enterOnTextBox(text);
	}

	@When("user click run button")
	public void user_click_run_button() {
	  tree.clickOnRunButton();
	}

	@Given("user is on overview page")
	public void user_is_on_overview_page() {
		tree=new TreeModule(BaseClass.driver);	
	   tree.clickOnOverviewPage();
	}

	@When("user clicks terminologies")
	public void user_clicks_terminologies() {
	  tree.clickOnTerminologies(); 
	}

	@When("user clicks on types of trees")
	public void user_clicks_on_types_of_trees() {
	   tree.clickOnTypesofTree();
	}

	@When("user clicks on tree traversals")
	public void user_clicks_on_tree_traversals() {
	    tree.clickOnTreeTraversals();
	}

	@When("user clicks on traversals illustration")
	public void user_clicks_on_traversals_illustration() {
	   tree.clickOnTraversalsIllustration();
	}

	@When("user clicks binary trees")
	public void user_clicks_binary_trees() {
	   tree.clickOnBinaryTrees(); 
	}

	@When("user clicks types of binary trees")
	public void user_clicks_types_of_binary_trees() {
	   tree.clickOnTypesOfBinaryTree();
	}

	@When("user click on implementation in python")
	public void user_click_on_implementation_in_python() {
	 tree.clickOnImplementionInPython();
	}

	@When("user click on binary tree traversals")
	public void user_click_on_binary_tree_traversals() {
	  tree.clickOnBinaryTreeTraversals();
	}

	@When("user clicks on implementation of binary trees")
	public void user_clicks_on_implementation_of_binary_trees() {
	   tree.clickOnImplementationOfBinaryTrees();
	}

	@When("user clicks on application of binary trees")
	public void user_clicks_on_application_of_binary_trees() {
	   tree.clickOnApplicationsOfBinaryTrees();
	}

	@When("user clicks binary search tree")
	public void user_clicks_binary_search_tree() {
	  tree.clickOnBinarySearchTrees();
	}

	@When("user clicks implemetatin of bst")
	public void user_clicks_implemetatin_of_bst() {
	   tree.clickOnImplementationOfBST();
	}

	@When("user clicks practice question")
	public void user_clicks_practice_question() {
	  tree.clickOnPraticeQuestion();
	}
	
	@When("user can see output page")
	public void user_can_see_output_page() {
	System.out.println("I am on output page");

	}

}
