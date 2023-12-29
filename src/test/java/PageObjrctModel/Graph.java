package PageObjrctModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utlity.helpclass;



public class Graph extends helpclass {
	public WebDriver driver;
	By GetStarted = By.xpath("//a[@href=\"graph\"]");
	By Graph = By.xpath("//a[@href=\"graph\"]");
	By GraphReprestation = By.xpath("//a[@href=\"/graph/graph-representations/\"]");
	By practiseQuestion = By.xpath("//a[@href=\"/graph/practice\"]");
	By GraphTryHere= By.xpath("//a[@href=\"/tryEditor\"]");
	//By GraphRepTryHere= By.xpath("//a[@href=\"/tryEditor\"]");
	By Runbutton=By.xpath("//button[@type=\"button\"]");
	By commandbox=By.xpath("//div[@class=\"input\"]");
	By Output   = By.id("output");
	
	public Graph(WebDriver driver) {	
		this.driver=driver;		
	}
	public void clickongetstarted() {
	   driver.findElement(GetStarted).click();
	   }
	public void cickongraph() {
		driver.findElement(Graph).click();
	}
	public void clickongraphRP() {
		movetoElement(driver.findElement(GraphReprestation));
		 clickOnWebelement(driver.findElement(GraphReprestation), 10);
			//driver.findElement(GraphReprestation).click();
	}
	public void GraphPractiseQuestion() {
		movetoElement(driver.findElement(practiseQuestion));
		 clickOnWebelement(driver.findElement(practiseQuestion), 10);
		//driver.findElement( practiseQuestion).click();;
	}
	public void Gtryhere() {
		driver.findElement(GraphTryHere).click();
	}	
	/*public void GRtryhere() {
		driver.findElement(GraphRepTryHere).click();
	}*/
	public void clickonRun() {
		driver.findElement(Runbutton).click();	
	}
	public void entertext(String text) {
		Actions action= new Actions(driver);
		 action.moveToElement(driver.findElement(commandbox)).sendKeys(driver.findElement(commandbox), text).build().perform();
		 
		//driver.findElement(commandbox).click();
    }
	public void getOutput() {
		WebElement output= driver.findElement(Output);
		    output.getText();
		    System.out.println(output);
		  
	  }
	  
}
//public class Graph {

//}
