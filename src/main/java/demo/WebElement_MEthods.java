package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElement_MEthods {


	public static void main(String[] args) throws Throwable {
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://trytestingthis.netlify.app/");
		
//		WebElement checkbox=driver.findElement(By.id("male"));
//		
//		checkbox.click();
//		
//		
//		System.out.println(checkbox.isSelected());
//		Thread.sleep(3000);
//		driver.close();
		
		
		driver.findElement(By.id("lname")).sendKeys("john");
		
		driver.findElement(By.name("lname")).sendKeys("smith");
		
		String text=driver.findElement(By.xpath("//h1[text()='Your Website to practice Automation Testing']")).getText();

		System.out.println(text);
		
//		System.out.println(text.isDisplayed());
//		
		
		WebElement button=driver.findElement(By.xpath("//button[text()=' Submit']"));
		
		System.out.println(button.isEnabled());
		
	WebElement	firstname=driver.findElement(By.id("fname"));
		
	firstname.sendKeys("narendra");
	
		Thread.sleep(4000);
		
		firstname.clear();
		
	}
	
	
}
