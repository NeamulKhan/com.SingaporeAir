package singaporeairHomepageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilitySingaporeAir.BaseClassSingaporeAir;

public class SingaporeairHomepageLocator extends BaseClassSingaporeAir{
	
	
	public SingaporeairHomepageLocator() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//*[@id=\"hwidget\"]/div[2]/div/div[2]/div[1]")
	public WebElement flightbookingwindow;
	

}
