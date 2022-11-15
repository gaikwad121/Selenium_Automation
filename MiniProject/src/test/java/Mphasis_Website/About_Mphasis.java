package Mphasis_Website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class About_Mphasis {
  @Test
  public void About_Mphasis_Link() {
	  System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");

	  WebDriver d=new org.openqa.selenium.firefox.FirefoxDriver();
	d.get("https://www.mphasis.com/home.html");  
	//About Mphasis Link
		 WebElement Mphasis=d.findElement(By.xpath("//a[text()='About Mphasis']"));
		 Mphasis.click();
			//About Mphasis Link Text
		 WebElement About=d.findElement(By.xpath("//span[text()=' About Mphasis ']"));
		 System.out.println(About.getText());
		 // Investors Link Text
		 WebElement Investors=d.findElement(By.xpath("//span[text()=' Investors ']"));
		 System.out.println(Investors.getText());
		 // Mphasis Subsidiaries Link Text
		 WebElement Subsidiaries=d.findElement(By.xpath("//span[text()=' Mphasis Subsidiaries ']"));
		 System.out.println(Subsidiaries.getText());
}		
}


