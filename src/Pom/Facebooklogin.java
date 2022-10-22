package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Facebooklogin {
@Test
public void validlogin() throws InterruptedException
	{
	System.setProperty("webdriver.gecko.driver","./software.geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com");
	Thread.sleep(2000);
	Loginpom l=new Loginpom(driver);
	l.setUsername("a");
	l.setPassword("b");
	l.clickLogin();
	}

	
	
	
	
	}
