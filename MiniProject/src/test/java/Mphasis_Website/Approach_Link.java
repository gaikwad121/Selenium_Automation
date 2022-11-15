package Mphasis_Website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Approach_Link {
	WebDriver d;
  @Test
  public void Our_Approach_Link() {
	  
	  System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");

	  WebDriver d=new org.openqa.selenium.firefox.FirefoxDriver();
	d.get("https://www.mphasis.com/home.html");

	  WebElement OurApproach=d.findElement(By.xpath("//a[@class='global-nav-item']"));
		OurApproach.click();

  }

String Expected="Service Transformation Solutions, Front2Back Framework utilise Cloud and Cognitive technology";
String Actual=d.getTitle();{
if(Expected.equals(Actual))
		   System.out.println("the test is passed");
else
	   System.out.println("the test is failed");





}
}

