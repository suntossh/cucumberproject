package hellocucumber;

import org.junit.runner.RunWith;
import cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(format = { "pretty", "html:target/site/cucumber-pretty","json:target/cucumber.json" })
public class RunCucumberTest {
}