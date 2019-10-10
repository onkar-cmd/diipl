package concession;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.*;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src\\test\\java\\concession\\Login.feature" }, glue = { "concession" },  format = { "pretty", "html:target/cucumber-reports/cucumber-pretty",
				"json:target/cucumber-reports/CucumberTestReport.json",
				"rerun:target/cucumber-reports/rerun.txt" },
tags = {"@concession","@desktop"},
plugin = {
						"json:target/cucumber-reports/CucumberTestReport.json", "html:target/cucumber-html-report" }

)
public class Concession_runner {
	private TestNGCucumberRunner testngcucumberrunner;

	@BeforeClass(alwaysRun = true)

	public void setUpClass() throws Exception {
		
		testngcucumberrunner = new TestNGCucumberRunner(this.getClass());
	}

	@Test(groups = "cucumber", description = "Run cucumber Features", dataProvider = "features")
	public void feature(CucumberFeatureWrapper cucumberFeature) {
		
		System.out.println(cucumberFeature.getCucumberFeature());
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
