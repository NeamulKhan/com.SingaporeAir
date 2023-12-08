package stepDefinationSingaporeAir;

import io.cucumber.java.en.Given;
import utilitySingaporeAir.BaseClassSingaporeAir;

public class Bookflight extends BaseClassSingaporeAir{
	
	@Given("Launch {string}")
	public void launch(String URL) {
		
		singaporeAirlaunchURL(URL);
	    
	}

}
