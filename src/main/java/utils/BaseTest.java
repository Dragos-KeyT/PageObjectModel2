package utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import pages.BasePage;


public class BaseTest extends Driver{

	public WebDriver driver;
	public BasePage app;
	
	@Parameters({"browser", "url"})
	@BeforeClass(alwaysRun = true)
	public void setup(String browser, String url) {
		
		driver = initDriver(browser);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();//maximizes the browser window
		driver.get(url);//navigates to the specified url
		
		app =  new BasePage(driver);
	}
	
	@AfterClass(alwaysRun=true)
	public void tearDown() throws InterruptedException  {
		Thread.sleep(4000);//bad practice
		//driver.close(); // inchide tabul curent
		driver.quit();// inchide browserul indiferent cate taburi sunt deschide
	}
	
	
	
}
