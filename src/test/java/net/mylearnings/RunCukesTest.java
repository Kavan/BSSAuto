package net.mylearnings;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/cukesFeatures"},
		plugin = {"pretty:target/report/report.html", 
				  "html:target/report/",
			      "json:target/report/cucu_json_report.json",
			      "junit:target/report/cucumber_junit_report.xml"},
          glue = "net.mylearnings.bssauto.steps" )
public class RunCukesTest {
}
