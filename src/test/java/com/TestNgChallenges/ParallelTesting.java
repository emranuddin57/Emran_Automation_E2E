package com.TestNgChallenges;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTesting {
	WebDriver driver;
	@Test
	public void SmokeTest() {
	WebDriverManager.chromedriver().setup();	
		driver = new ChromeDriver();
		driver.get("http://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
		System.out.println("SmokeTest");
	}
	@Test
public void sanityTest() {
	WebDriverManager.chromedriver().setup();	
	driver = new ChromeDriver();
	driver.get("http://magento.softwaretestingboard.com/");
	driver.manage().window().maximize();
	System.out.println("sanityTest");	
	}
	@Test
public void regressionTest() {
	WebDriverManager.chromedriver().setup();	
	driver = new ChromeDriver();
	driver.get("http://magento.softwaretestingboard.com/");
	driver.manage().window().maximize();
	System.out.println("regressionTest");
}
	@Test
public void functionalTest() {
	WebDriverManager.chromedriver().setup();	
	driver = new ChromeDriver();
	driver.get("http://magento.softwaretestingboard.com/");
	driver.manage().window().maximize();
	System.out.println("functionalTest");
}

}

	

