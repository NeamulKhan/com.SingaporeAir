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
	
	@FindBy (xpath="//*[@id=\"hwidget\"]/div[2]/div/div[2]/div[1]/div/div/div[3]/div[2]/div[2]/div/div/div[1]/div[1]/label")
	public WebElement bookflightsradiobutton;
	
	@FindBy (xpath="//*[@id=\"hwidget\"]/div[2]/div/div[2]/div[1]/div/div/div[3]/div[2]/form/div[1]/div[1]/div/div/div[1]/div/div/span[2]")
	public WebElement crossicon;
	
	@FindBy (id="flightOrigin1")
	public WebElement departcity;
	
	@FindBy (xpath="//*[@id=\"hwidget\"]/div[2]/div/div[2]/div[1]/div/div/div[3]/div[2]/form/div[1]/div[1]/div/div/div[1]/div/div[2]/div/div/div/div[1]/div[1]")
	public WebElement suggesteddepartcity;
	
	@FindBy (id="bookFlightDestination")
	public WebElement arrivalcity;
	
	@FindBy (xpath="//*[@id=\"hwidget\"]/div[2]/div/div[2]/div[1]/div/div/div[3]/div[2]/form/div[1]/div[1]/div/div/div[2]/div/div[2]/div/div/div/div[1]/div[1]")
	public WebElement suggestedarrivcity;
	
	

}
