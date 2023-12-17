package PageObjrctModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import Utlity.HelperClass;

public class TreeModule extends HelperClass {
	WebDriver driver;
	//By GetStarted = By.xpath("//a[@href=\"array\"]");
	By GetStarted = By.xpath("//a[@href='tree']");
	By OverViewOfTree = By.xpath("//a[text()='Overview of Trees']");
	By Terminologies  = By.xpath("//a[text()='Terminologies']");
	By TypesOfTree  = By.xpath("//a[text()='Types of Trees']");
	By TreeTraversals  = By.xpath("//a[text()='Tree Traversals']");
	By TraversalsIllustration  = By.xpath("//a[text()='Traversals-Illustration']"); 
	By binaryTrees  = By.xpath("//a[text()='Binary Trees']");
	By TypesOfBinaryTree  = By.xpath("//a[text()='Types of Binary Trees']"); 
	By ImplementionInPython  = By.xpath("//a[text()='Implementation in Python']");
	By  BinaryTreeTraversals = By.xpath("//a[text()='Binary Tree Traversals']");
	By  ImplementationOfBinaryTrees = By.xpath("//a[text()='Implementation of Binary Trees']");
	By  ApplicationsOfBinaryTrees = By.xpath("//a[text()='Applications of Binary trees']");
	By BinarySearchTrees  = By.xpath("//a[text()='Binary Search Trees']");
	By ImplementationOfBST  = By.xpath("//a[text()='Implementation Of BST']");
	By TryHere              = By.xpath("//a[@href='/tryEditor']");
	By TextBox              = By.xpath("//div[@class='input']");
	By RunButton            = By.xpath("//button[text()='Run']");
	By PraticeQuestion      = By.xpath("//a[@href=\"/tree/practice\"]");
	
	
	public TreeModule(WebDriver driver) {
		this.driver= driver;
	}
	public void clickOnTreeGetStarted() {
		driver.navigate().to("https://dsportalapp.herokuapp.com/home");
		clickOnWebelement(driver.findElement(GetStarted), 10);
	}
	public void clickOnOverView() {
		moveToElement(driver.findElement(OverViewOfTree));
		clickOnWebelement(driver.findElement(OverViewOfTree), 10);
	}
	public void clickOnTryHere() {
		clickOnWebelement(driver.findElement(TryHere), 10);
	
	}
	public void enterOnTextBox(String text) {
		Actions action= new Actions(driver);
		action.moveToElement(driver.findElement(TextBox)).sendKeys(driver.findElement(TextBox), text).build().perform();
	}
	public void clickOnRunButton() {
		clickOnWebelement(driver.findElement(RunButton), 10);
	}
	public void clickOnTerminologies() {
		moveToElement(driver.findElement(Terminologies));
		clickOnWebelement(driver.findElement(Terminologies), 10);
	}
	public void clickOnTypesofTree() {
		moveToElement(driver.findElement(TypesOfTree));
		clickOnWebelement(driver.findElement(TypesOfTree), 10);
	}
	public void clickOnTreeTraversals() {
		moveToElement(driver.findElement(TreeTraversals));
		clickOnWebelement(driver.findElement(TreeTraversals), 10);
	}
	public void clickOnTraversalsIllustration() {
		moveToElement(driver.findElement(TraversalsIllustration));
		clickOnWebelement(driver.findElement(TraversalsIllustration), 10);
	}
	public void clickOnBinaryTrees() {
		moveToElement(driver.findElement(binaryTrees));
		clickOnWebelement(driver.findElement(binaryTrees), 10);
	}
	public void clickOnTypesOfBinaryTree() {
		moveToElement(driver.findElement(TypesOfBinaryTree));
		clickOnWebelement(driver.findElement(TypesOfBinaryTree), 10);
	}
	public void clickOnImplementionInPython() {
		moveToElement(driver.findElement(ImplementionInPython));
		clickOnWebelement(driver.findElement(ImplementionInPython), 10);
	}
	public void clickOnBinaryTreeTraversals() {
		moveToElement(driver.findElement(BinaryTreeTraversals));
		clickOnWebelement(driver.findElement(BinaryTreeTraversals), 10);
	}
	public void clickOnImplementationOfBinaryTrees() {
		moveToElement(driver.findElement(ImplementationOfBinaryTrees));
		clickOnWebelement(driver.findElement(ImplementationOfBinaryTrees), 10);
	}
	public void clickOnApplicationsOfBinaryTrees() {
		moveToElement(driver.findElement(ApplicationsOfBinaryTrees));
		clickOnWebelement(driver.findElement(ApplicationsOfBinaryTrees), 10);
	}
	public void clickOnBinarySearchTrees() {
		moveToElement(driver.findElement(BinarySearchTrees));
		clickOnWebelement(driver.findElement(BinarySearchTrees), 10);
	}
	public void clickOnImplementationOfBST() {
		moveToElement(driver.findElement(ImplementationOfBST));
		clickOnWebelement(driver.findElement(ImplementationOfBST), 10);
	}
	public void clickOnPraticeQuestion() {
		moveToElement(driver.findElement(PraticeQuestion));
		clickOnWebelement(driver.findElement(PraticeQuestion), 10);
	}
	public void clickOnOverviewPage() {
		windoHandle("https://dsportalapp.herokuapp.com/tree/overview-of-trees/");
	}
}


