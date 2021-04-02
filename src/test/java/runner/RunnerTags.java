package runner;

import org.slf4j.LoggerFactory;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.junit.Before;
import org.junit.Test;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;






public class RunnerTags {
	
	
	
	private static final Logger Logger = LoggerFactory.getLogger(RunnerTags.class);

	
	
	
	@Test
	public void subrunner() {
		try {
			Logger.info("Medio");
			JUnitCore.runClasses(runnerTag.class);
		} catch (Exception e) {
			Logger.error("Error runnertags");
		}
		
		
		
	}
	
	@Before
	public void setup() {
		try {
			
			
			Logger.info("setup driver");
		} catch (Exception e) {
			Logger.error("error about setup of Driver ");
		}
		
	}
	

	@RunWith(CucumberWithSerenity.class)	
	@CucumberOptions (features = "src/test/resources/features/travelocity.feature",

					 tags = "@viaje",
					 glue = "stepdefinitions"
					 )

	public class runnerTag{
		
	}
}
