package TestRunner;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;




/*@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/Feature"}, glue={"StepDefinations", "ApplicationHooks"},
          
                //dryRun=false,
               // monochrome=true,
                plugin={"pretty", "html:test-output","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})*/

@RunWith(Cucumber.class)

@CucumberOptions(features="src/test/resources/Feature/",

glue={"StepDefinations","ApplicationHooks"},

plugin={"pretty","json:target/cucumber-reports/reports.json",

            "junit:target/cucumber-reports/Cucumber.xml",

            "html:target/cucumber-reports/ds-algo-project.html",
            
            "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
//monochrome = true,

//dryRun = false)

//public class TestRunner {


//}*/
public class RunnerClass 
	extends AbstractTestNGCucumberTests {
		@Override
		@DataProvider(parallel = false)
		public Object[][] scenarios() {
			return super.scenarios();
		}
	
}
