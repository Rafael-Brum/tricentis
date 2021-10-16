package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:Features"
		,glue= {"stepdefinitions"}
		,tags = "@End2End"
		,plugin = {"pretty", "html:target/cucumber-reports"}  //pretty or usage
		,monochrome = true
		)
public class TesteRunner {

}
