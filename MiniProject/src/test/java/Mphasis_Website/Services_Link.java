package Mphasis_Website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Services_Link {
  @Test
  public void Services_Link() {
	  System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");

	  WebDriver d=new org.openqa.selenium.firefox.FirefoxDriver();
	d.get("https://www.mphasis.com/home.html");

	  // Services Link Text
		 WebElement Services=d.findElement(By.xpath("//a[text()='Services']"));
		 Services.click();
		 // Application Services Link Text
		 WebElement Application  =d.findElement(By.xpath("//span[text()=' Application Services ']"));
		 System.out.println(Application.getText());
		 WebElement Blockchain  =d.findElement(By.xpath("//span[text()=' Blockchain '] "));
		 System.out.println(Blockchain.getText());
		 WebElement Business  =d.findElement(By.xpath("//span[text()=' Business Process Services ']"));
		 System.out.println(Business.getText());
		 WebElement Cognitive  =d.findElement(By.xpath("//span[text()=' Cognitive ']"));
		 System.out.println(Cognitive.getText());
		 WebElement Security  =d.findElement(By.xpath("//span[text()=' Cyber Security ']"));
		 System.out.println(Security.getText());
		 WebElement DevOps  =d.findElement(By.xpath("//span[text()=' DevOps ']"));
		 System.out.println(DevOps.getText());
		 WebElement Automation  =d.findElement(By.xpath("//span[text()=' DevOps Automation Services ']"));
		 System.out.println(Automation.getText());

		 
				 // Digital Link Text
		 WebElement Digital=d.findElement(By.xpath("//span[text()=' Digital ']"));
		 System.out.println(Digital.getText());
		 WebElement Enterprise=d.findElement(By.xpath("//span[text()=' Enterprise Automation ']"));
		 System.out.println(Enterprise.getText());
		 WebElement Governance=d.findElement(By.xpath("//span[text()=' Governance, Risk & Compliance ']"));
		 System.out.println(Governance.getText());
		 WebElement Infrastructure=d.findElement(By.xpath("//span[text()=' Infrastructure Services ']"));
		 System.out.println(Infrastructure.getText());
		 	 
		 // Modernization Link Text
		 WebElement Modernization=d.findElement(By.xpath("//span[text()=' Modernization ']"));
		 System.out.println(Modernization.getText());
		 WebElement Data=d.findElement(By.xpath("//span[text()=' Next-Gen Data ']"));
		 System.out.println(Data.getText());
		 WebElement Next=d.findElement(By.xpath("//span[text()=' Next-gen IT Operations ']"));
		 System.out.println(Next.getText());
		 
		 WebElement Product=d.findElement(By.xpath("//span[text()=' Product Engineering ']"));
		 System.out.println(Product.getText());
		 WebElement XaaP=d.findElement(By.xpath("//span[text()=' Platforms & Protocols - XAAP ']"));
		 System.out.println(XaaP.getText());

		 
		// Cloud Link Text
		 WebElement Cloud=d.findElement(By.xpath("//span[text()=' Cloud ']"));
		 System.out.println(Cloud.getText());
		 WebElement AWS=d.findElement(By.xpath("//span[text()=' AWS Services ']"));
		 System.out.println(AWS.getText());
		 WebElement Azure=d.findElement(By.xpath("//span[text()=' Azure Services ']"));
		 System.out.println(Azure.getText());
		 WebElement VMware=d.findElement(By.xpath("//span[text()=' VMware Tanzu Services ']"));
		 System.out.println(VMware.getText());



		
	  
  }
}
