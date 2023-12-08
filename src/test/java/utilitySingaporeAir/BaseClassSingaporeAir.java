package utilitySingaporeAir;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class BaseClassSingaporeAir {
	
	public static Properties singaporeAir_prop;
	public static WebDriver driver;
	
	public BaseClassSingaporeAir() {
		
	try {
		FileInputStream file = new FileInputStream (System.getProperty("user.dir")+"\\src\\test\\java\\com\\SingaporeAir\\config\\com.SingaporeAir.Properties");	
			
		singaporeAir_prop = new Properties();
		singaporeAir_prop.load(file);
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
	}
	
	public void singaporeAirbrowserinit() {
		
	String browser = singaporeAir_prop.getProperty("Browser1");
	
	if (browser.equalsIgnoreCase("Chrome")) {
		
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\webDriverSingaporeAir\\chromedriver.exe");	
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestDataSingaporeAir.implicitywait));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestDataSingaporeAir.pageLoadwait));
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
			
	}
	else if(browser.equalsIgnoreCase("FireFox")) {
		
		}
		
	}
	public static void singaporeAirlaunchURL(String URL) {
		
		driver.get(singaporeAir_prop.getProperty("URL"));
	}
}




