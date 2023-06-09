package smarttech.ny.basepage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import com.fasterxml.jackson.databind.annotation.JsonAppend.Prop;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParentClass {
	public static Properties prop;
	public static WebDriver driver;
	public static String browser;
	public static FileInputStream ip;
	
	public ParentClass() {
	try {
		prop = new Properties();
		ip = new FileInputStream("./src/main/java/smarttech/ny/config/Config.properties");	
		prop.load(ip);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	public void initialization() {
	String browser= prop.getProperty("browserName");
  
	if(browser.equalsIgnoreCase("chrome")){
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
	}
	else if(browser.equalsIgnoreCase("edge")) {
		WebDriverManager.edgedriver().setup();
		 driver = new EdgeDriver();
	}else {
		System.out.println("<<Driver didnot found>>");
		
	}
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get(prop.getProperty("QA_ENV"));;
	
	}
	
}
