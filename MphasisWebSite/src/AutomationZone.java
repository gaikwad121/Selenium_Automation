

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.testng.annotations.Test;

public class AutomationZone {
  @org.junit.Test
  public void loginTest() {
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");

	  WebDriver d=new FirefoxDriver();

	  
	  d.get("https://theautomationzone.blogspot.com/");
	  
  }
}
