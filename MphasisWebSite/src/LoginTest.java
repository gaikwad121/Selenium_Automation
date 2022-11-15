

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginTest {
	WebDriver d;
  @Test
  public void testLogin() {
	  d=new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
d.get("https://www.facebook.com/login/");	  
	  
  }
}
