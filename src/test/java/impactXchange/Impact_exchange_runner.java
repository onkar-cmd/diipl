package impactXchange;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(features = { "src\\test\\java\\impactXchange\\reconcilation.feature" }, glue = {
		"impactXchange" }, tags = { "@Group_reconcile" }, dryRun = false, format = { "pretty",
				"html:target/UFO/ufo_pretty", }, plugin = { "json:target/cucumber-reports/CucumberTestReport.json",
						"html:target/cucuzmber-html-report" }

		, monochrome = true)

public class Impact_exchange_runner {
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
