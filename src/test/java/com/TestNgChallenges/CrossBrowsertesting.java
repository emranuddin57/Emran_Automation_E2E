package com.TestNgChallenges;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowsertesting   {
	WebDriver driver;
@BeforeMethod  // Coming from TestNG which we need to run cross browser testing
@Parameters("Crossbrowser")// TestNg advance annotation

	public void  initialization(String browser) {
	if(browser.equalsIgnoreCase("Chrome")){
    System.out.println("Test will excute with chrome brwser");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	else if(browser.equalsIgnoreCase("Edge")) {
		System.out.println("Test will excute with Edge brwser");
		WebDriverManager.edgedriver().setup();
		 driver = new EdgeDriver();
	}

	//WebDriverManager.chromedriver().setup();
	//driver = new ChromeDriver();
	//System.out.println("Browser will Open");	
	}
@Test //Same test cases will run multiple browser
	public void getLogIn() {
		driver.get("https://www.automationexercise.com/login");
		driver.manage().window().maximize();
		System.out.println("Log In The Application");
	}
@AfterMethod //Coming from TestNg
	public void getCloseBrowser() {
	driver.quit();
	System.out.println("Browser will Close");
}
}

