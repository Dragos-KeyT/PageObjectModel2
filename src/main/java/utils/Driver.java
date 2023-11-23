package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Driver {

	public WebDriver driver;
	public static ThreadLocal<String> runningBrowser =  new ThreadLocal<String>();
	
	public WebDriver initDriver(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			
			driver = new ChromeDriver(getChromeOptions());
			runningBrowser.set( "Chrome");
			return driver;
		
		}else if(browser.equalsIgnoreCase("firefox")) {
			runningBrowser.set( "Firefox");			
			driver =  new FirefoxDriver(getFirefoxOptions());
			return driver;
	
		}else if(browser.equals("edge")) {
			runningBrowser.set( "Edge");	
			driver =  new EdgeDriver();
			return driver;
		}
		
		return driver;
	}
	
	public ChromeOptions getChromeOptions() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
//		options.addArguments("--window-size=1580, 1280");
		return options; 
	}
	
	public FirefoxOptions getFirefoxOptions() {
		FirefoxBinary fbinary = new FirefoxBinary();
//		FirefoxBinary fbinary = new FirefoxBinary();
		fbinary.addCommandLineOptions("--headless");
		FirefoxOptions foptions = new FirefoxOptions();
		foptions.setBinary(fbinary);
		return foptions;
	}
	
	public EdgeOptions getEdgeOptions() {
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--headless");
//		options.addArguments("--window-size=1580, 1280");
		return options; 
	}
}
