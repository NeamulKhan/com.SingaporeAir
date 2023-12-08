package testRunnerSingaporeAir;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utilitySingaporeAir.BaseClassSingaporeAir;


@CucumberOptions(features= {"src/test/resources/featureFolderSingaporeAir"},
plugin={"json:target/cucumber.json"},
glue="stepDefinationSingaporeAir", tags= "@Bookflight"
		)

public class TestRunnerSingaporeAir extends AbstractTestNGCucumberTests{

	@BeforeTest
	 
	 public void setup()throws IOException {
		 
		BaseClassSingaporeAir  test = new  BaseClassSingaporeAir ();
		 
		 test.singaporeAirbrowserinit();
	 }
		 
		 @AfterTest
		 
		 public void closerURL() throws IOException, Exception{
			 
			 BaseClassSingaporeAir test = new  BaseClassSingaporeAir();
			 
			 Thread.sleep(5000);
			 
			// test.driver.quit();
			 
			 
	 }
	 
}



