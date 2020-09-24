package com.MakemyTripApp.tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.*;


import com.MakemyTripApp.utilities.ReadConfig;

public class BaseClass {

	/*public String baseURL="https://www.makemytrip.com/";
	public String From ="DEL";
	public String To ="Goa";*/
	
	ReadConfig readconfig = new ReadConfig();
	public String baseURL=readconfig.getApplicationURL();
	public String From =readconfig.FromPlace();
	public String To =readconfig.ToPlace();
	
	public static WebDriver driver;
	
	@Parameters("browser")
	@BeforeClass
	
	public void setup(String browser) {
		
		if(browser.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver= new ChromeDriver();
	}
		else if(browser.equals("firefox")) {
			System.setProperty("webdriver.firefox.driver",System.getProperty("user.dir")+"//Drivers//geckodriver.exe");
			driver= new FirefoxDriver();
		}
		
		else if(browser.equals("ie")) {
			System.setProperty("webdriver.internetexplorer.driver",System.getProperty("user.dir")+"//Drivers//ie.exe");
			driver= new InternetExplorerDriver();
		}
	}
	
	
	@AfterClass
	public void close() {
		driver.quit();
	}
	
}
