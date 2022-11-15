package Mphasis_Website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Career_Link {
  @Test
  public void Career_Link() {
	  
	  
	  System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");

	  WebDriver d=new org.openqa.selenium.firefox.FirefoxDriver();
	d.get("https://www.mphasis.com/home.html");

	  
	  
	  
	WebElement Careers=d.findElement(By.xpath("//a[text()='Careers']"));
	Careers.click();
  }
  
  
}
