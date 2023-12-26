package stepDefinationSingaporeAir;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import singaporeairHomepageAction.SingaporeairHomepageAction;
import utilitySingaporeAir.BaseClassSingaporeAir;
import utilitySingaporeAir.UtilitySingaporeAir;

public class Bookflight extends BaseClassSingaporeAir{
	
	SingaporeairHomepageAction singaporeairHomepageAction = new SingaporeairHomepageAction();
	
	@Given("Launch {string}")
	public void launch(String URL) {
		
		singaporeAirlaunchURL(URL);
	    
	}

@When("user validate homepage and scrolldown and verify flight booking is displaying without any broken elements")
public void user_validate_homepage_and_scrolldown_and_verify_flight_booking_is_displaying_without_any_broken_elements() {
    
	singaporeairHomepageAction.verify_flight_booking_is_displaying();
	UtilitySingaporeAir.takeMyScreenshot(driver, "Flightbooking window");
}

@When("user click book flights radio button, enter depart city name, click correct pop up airport")
public void user_click_book_flights_radio_button_enter_depart_city_name_click_correct_pop_up_airport() {
    
	
}

@When("user enter arrival city name and click correct popup airport")
public void user_enter_arrival_city_name_and_click_correct_popup_airport() {
    
	
}



}
