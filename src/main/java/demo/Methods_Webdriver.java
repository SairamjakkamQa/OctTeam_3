package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Methods_Webdriver {

	
	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		String url=driver.getCurrentUrl();
		
		System.out.println(url);
		
		//System.out.println(driver.getPageSource());
		
		System.out.println(driver.getWindowHandle());
		
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		
		driver.findElement(By.id("newTabBtn")).click();
		
		driver.quit();
		
		
	}
	
	
	
}
