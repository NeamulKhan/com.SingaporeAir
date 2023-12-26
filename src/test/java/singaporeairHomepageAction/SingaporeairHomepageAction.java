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
	
	
	
}
