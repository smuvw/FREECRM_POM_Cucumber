
package cucumberTest;
 
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature"
		,glue={"stepDefinition"},
		dryRun = false,
		monochrome= true,
		strict= false
		/*format = {"pretty","html:test-output"}*/
		
		)
 
public class TestRunner {
 
}