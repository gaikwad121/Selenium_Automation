package Mphasis_Website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Innovation_Link {
  @Test
  public void Innovation_Link() {
	  System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");

	  WebDriver d=new org.openqa.selenium.firefox.FirefoxDriver();
	d.get("https://www.mphasis.com/home.html");  
	  
	// Innovation Link
		 WebElement Innovation=d.findElement(By.xpath("//a[text()='Innovation']"));
		 Innovation.click();
		 //Sparkle Link Text
		 WebElement Sparkle=d.findElement(By.xpath("//span[text()=' Sparkle ']"));
		 System.out.println(Sparkle.getText());
		 // Next Labs Link Text
		 WebElement NextLabs=d.findElement(By.xpath("//span[text()=' Next Labs ']"));
		 System.out.println(NextLabs.getText());
		 // Thought Leadership Link Text
		 WebElement Thought=d.findElement(By.xpath("//span[text()=' Thought Leadership ']"));
		 System.out.println(Thought.getText());
  }

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		



  }
  
  

