package week5.day1;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectSpecificMethod {
	public ChromeDriver driver;
	@BeforeMethod
	@Test
	public void startbrowser() {
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		driver.get("http://leafground.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
	}
	@AfterMethod
	public void endBrwoser() {
		driver.close();
	}

}
