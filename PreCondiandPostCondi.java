package week5.day1;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PreCondiandPostCondi {
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
	@BeforeSuite
	public void cc() {
		System.out.println("Create Lead");
	}
	@BeforeTest
	public void cb() {
		System.out.println();
	}
	@BeforeClass()
	public void df() {
		System.out.println();
	}
	@AfterClass()
	public void bc() {
		System.out.println();
	}
	@AfterTest()
	public void bb() {
		System.out.println();
	}
	@AfterSuite()
	public void nn() {
		System.out.println();
	}
	@AfterMethod()
		public void endBrowser() {
			driver.close();
		}
	
	}
	
	


