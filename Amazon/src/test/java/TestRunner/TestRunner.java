package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="Resources/features/Login.feature",
		glue="StepDef"
		
		
		)
public class TestRunner {

}
