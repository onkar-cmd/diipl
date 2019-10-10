package managment_console;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.*;

@CucumberOptions(features = { "src/test/java/managment_console/distributer.feature" }, glue = {
		"managment_console" }, tags = { "~@Ignore" }, format = { "pretty",
				"html:target/cucumber-reports/cucumber-pretty", "json:target/cucumber-reports/CucumberTestReport.json",
				"rerun:target/cucumber-reports/rerun.txt" }, plugin = "json:target/cucumber-reports/CucumberTestReport.json")

public class Managment_console_runner {
	private TestNGCucumberRunner testngcucumberrunner;

	@BeforeClass(alwaysRun = true)
	public void setUpClass() throws Exception {
		testngcucumberrunner = new TestNGCucumberRunner(this.getClass());

	}

	@Test(groups = "cucumber", description = "Run cucumber Features", dataProvider = "features")
	public void feature(CucumberFeatureWrapper cucumberFeature) {
		testngcucumberrunner.runCucumber(cucumberFeature.getCucumberFeature());
	}

	@DataProvider
	public Object[][] features() {
		return testngcucumberrunner.provideFeatures();
	}

	@AfterClass(alwaysRun = true)

	public void tearDownClass() {
		testngcucumberrunner.finish();
	}

}
