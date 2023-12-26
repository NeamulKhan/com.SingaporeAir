package singaporeairHomepageAction;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import singaporeairHomepageLocator.SingaporeairHomepageLocator;
import utilitySingaporeAir.BaseClassSingaporeAir;

public class SingaporeairHomepageAction extends BaseClassSingaporeAir{
	
	SingaporeairHomepageLocator singaporeairHomepageLocator = new SingaporeairHomepageLocator();

	public void verify_flight_booking_is_displaying() {
		
		//((JavascriptExecutor)driver).executeScript("scroll(0,400)");
		
		Actions act = new Actions(driver);
		
		act.scrollByAmount(0,400).perform();
		
		boolean verifyflightbooking = singaporeairHomepageLocator.flightbookingwindow.isDisplayed();
		Assert.assertTrue(verifyflightbooking);
		
	}
	
	public void click_bookflights_radiobutton_enter_departcity_click_correct_popup_airport() throws Exception {
		
		Thread.sleep(3000);
		
		singaporeairHomepageLocator.bookflightsradiobutton.click();
		Thread.sleep(2000);
		singaporeairHomepageLocator.crossicon.click();
		Thread.sleep(2000);
		singaporeairHomepageLocator.departcity.sendKeys("Toronto");
		singaporeairHomepageLocator.suggesteddepartcity.click();
				
	}
	public void enter_arrivalcity_and_click_correct_popup_airport() throws Exception {
		Thread.sleep(3000);
		singaporeairHomepageLocator.arrivalcity.sendKeys("Dhaka");
		singaporeairHomepageLocator.suggestedarrivcity.click();
		
	}
	
}
