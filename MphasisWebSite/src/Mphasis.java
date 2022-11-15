import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mphasis {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");

		  WebDriver d=new FirefoxDriver();
		d.get("https://www.mphasis.com/home.html");
		// For A Our Approach Link
	WebElement OurApproach=d.findElement(By.xpath("//a[@class='global-nav-item']"));
		OurApproach.click();
	
		String Expected="Service Transformation Solutions, Front2Back Framework utilise Cloud and Cognitive technology";
		   String Actual=d.getTitle();
		   if(Expected.equals(Actual))
				   System.out.println("the test is passed");
		   else
			   System.out.println("the test is failed");
		   
	  // Industries Link
		   WebElement Industries=d.findElement(By.xpath("//a[text()='Industries']"));
				Industries.click();
				//Banking Capital Link Text
				WebElement Banking=d.findElement(By.xpath("//span[text()=' Banking-Capital Markets ']"));
				System.out.println(Banking.getText());
				//Insurance Link Text
				WebElement Insurance=d.findElement(By.xpath("//span[text()=' Insurance ']"));
				System.out.println(Insurance.getText());
				//Payment Link Text
				WebElement Payment=d.findElement(By.xpath("//span[text()=' Payments ']"));
				System.out.println(Payment.getText());
				// Communication Link Text
				WebElement Communication=d.findElement(By.xpath("//span[text()=' Communications ']"));
				System.out.println(Communication.getText());
			// Services Link Text
		 WebElement Services=d.findElement(By.xpath("//a[text()='Services']"));
		 Services.click();
		 // Application Services Link Text
		 WebElement Application  =d.findElement(By.xpath("//span[text()=' Application Services ']"));
		 System.out.println(Application.getText());
		 // Digital Link Text
		 WebElement Digital=d.findElement(By.xpath("//span[text()=' Digital ']"));
		 System.out.println(Digital.getText());
		 // Modernization Link Text
		 WebElement Modernization=d.findElement(By.xpath("//span[text()=' Modernization ']"));
		 System.out.println(Modernization.getText());
		// Cloud Link Text
		 WebElement Cloud=d.findElement(By.xpath("//span[text()=' Cloud ']"));
		 System.out.println(Cloud.getText());
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
 // Careers Link
		WebElement Careers=d.findElement(By.xpath("//a[text()='Careers']"));
		Careers.click();
	}


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


		

		


		
		

		
    


	}


