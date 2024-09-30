package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\resource\\com\\features\\Shortlist\\shortlist.feature",
glue= {"com.stepdefination.RLL_240Testinh_FirstCry_Shortlist"})

public class NewTest extends AbstractTestNGCucumberTests {
}
