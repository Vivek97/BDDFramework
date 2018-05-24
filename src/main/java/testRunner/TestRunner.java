package testRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\vivek.jain\\eclipse-workspace\\BDDFramework\\src\\main\\java\\features"
		,glue= {"stepDefinition"},
		format = {"pretty","html:test-output"}
		
		)

public class TestRunner {
	


}
