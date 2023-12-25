package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/Feature"}, glue={"StepDefinations", "ApplicationHooks"},
          
                //dryRun=false,
               // monochrome=true,
                plugin={"pretty", "html:test-output","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class RunnerClass {

	
}
