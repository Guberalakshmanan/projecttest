package TestRunner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(tags="", features= {"src/test/resources/Features"}, 
glue= {"StepDefinition"}, 
plugin= {"pretty", "html:target/htmlreport.html"})

public class CucumberTestRunner extends AbstractTestNGCucumberTests {

}
