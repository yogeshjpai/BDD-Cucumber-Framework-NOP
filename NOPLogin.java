package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\yoges\\Desktop\\Yogesh\\bddFwDemo\\Features\\nopLogin.feature",
		glue="StepDefination",
		dryRun=false,
		monochrome=true,
		plugin= {"pretty","html:test-output"}
		)

public class NOPLogin 
{

}
