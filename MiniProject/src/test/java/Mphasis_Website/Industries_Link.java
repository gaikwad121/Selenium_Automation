package Mphasis_Website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;




public class Industries_Link {
  @Test
  public void Industries_Link() {
	  System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");

	  WebDriver d=new org.openqa.selenium.firefox.FirefoxDriver();
	d.get("https://www.mphasis.com/home.html");

	  WebElement Industries=d.findElement(By.xpath("//a[text()='Industries']"));
		Industries.click();
		//Banking Capital Link Text
		WebElement Banking=d.findElement(By.xpath("//span[text()=' Banking-Capital Markets ']"));
		System.out.println(Banking.getText());
		WebElement Asset=d.findElement(By.xpath("//span[text()=' Asset Management ']"));
		System.out.println(Asset.getText());
		WebElement Corporate=d.findElement(By.xpath("//span[text()=' Corporate Banking ']"));
		System.out.println(Corporate.getText());
		WebElement Investment=d.findElement(By.xpath("//span[text()=' Investment Banking ']"));
		System.out.println(Investment.getText());

		WebElement Mortgage=d.findElement(By.xpath("//span[text()=' Mortgage ']"));
		System.out.println(Mortgage.getText());

		WebElement Retail=d.findElement(By.xpath("//span[text()=' Retail Banking ']"));
		System.out.println(Retail.getText());
		WebElement Wealth=d.findElement(By.xpath("//span[text()=' Wealth Management & Brokerage ']"));
		System.out.println(Wealth.getText());
		
		//Insurance Link Text
		WebElement Insurance=d.findElement(By.xpath("//span[text()=' Insurance ']"));
		System.out.println(Insurance.getText());
		WebElement Annuity=d.findElement(By.xpath("//span[text()=' Life and Annuity ']"));
		System.out.println(Annuity.getText());

		WebElement Property=d.findElement(By.xpath("//span[text()=' Property & Casualty ']"));
		System.out.println(Property.getText());

		WebElement Brokerage=d.findElement(By.xpath("//span[text()=' Brokerage ']"));
		System.out.println(Brokerage.getText());

		WebElement Tech=d.findElement(By.xpath("//span[text()=' Hi-Tech ']"));
		System.out.println(Tech.getText());

		WebElement HealthCare=d.findElement(By.xpath("//span[text()=' HealthCare ']"));
		System.out.println(HealthCare.getText());
		WebElement Life=d.findElement(By.xpath("//span[text()=' Life Sciences ']"));
		System.out.println(Life.getText());


		//Payment Link Text
		WebElement Payment=d.findElement(By.xpath("//span[text()=' Payments ']"));
		WebElement Innovation=d.findElement(By.xpath("//span[text()=' ALTA – Financial Supply Chain Innovation ']"));
		System.out.println(Innovation.getText());

		WebElement Hospitality=d.findElement(By.xpath("//span[text()=' Hospitality ']"));
		System.out.println(Hospitality.getText());

		WebElement Transportation=d.findElement(By.xpath("//span[text()=' Travel and Transportation ']"));
		System.out.println(Transportation.getText());

				// Communication Link Text
		WebElement Communication=d.findElement(By.xpath("//span[text()=' Communications ']"));
		System.out.println(Communication.getText());
		WebElement Utilities=d.findElement(By.xpath("//span[text()=' Energy and Utilities ']"));
		System.out.println(Utilities.getText());
		WebElement Logistics=d.findElement(By.xpath("//span[text()=' Logistics ']"));
		System.out.println(Logistics.getText());
		WebElement Manufacturing=d.findElement(By.xpath("//span[text()=' Manufacturing ']"));
		System.out.println(Manufacturing.getText());
		WebElement Gas=d.findElement(By.xpath("//span[text()=' Oil and Gas ']"));
		System.out.println(Gas.getText());
		WebElement Sector=d.findElement(By.xpath("//span[text()=' Public Sector ']"));
		System.out.println(Sector.getText());

  }
  }

