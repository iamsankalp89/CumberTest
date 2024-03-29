package testRunners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/AppFeatures/Search.feature"},       //Path of feature file
        glue = {"stepDefinations","myHooks"},            //path of Stepdefinations and hooks
        plugin = {"pretty",             //Formatting
                    "json:target/Report/MyJsonReport.json",
                    "junit:target/Report/MyXMLReport.xml"}  ,
       //publish = true,
        tags="@Smoke or @Regression",
        monochrome=true,
        dryRun = true
)
public class AmazonTest {

}
