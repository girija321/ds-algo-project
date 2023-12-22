package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/Feature"}, glue={"StepDefinations", "ApplicationHooks"}, //tags="@smoke",
            
                dryRun=false,
               // monochrome=true,
                plugin={"pretty", "html:test-output"})

public class RunnerClass {

	
}
