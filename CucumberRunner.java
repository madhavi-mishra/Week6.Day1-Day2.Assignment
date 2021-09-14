	package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
	
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;
import steps.BaseClass;
@CucumberOptions(features="src/test/java/features/CreateLead.feature" , glue="steps" , monochrome=true , publish=true)
public class CucumberRunner extends BaseClass {
	

	

}
