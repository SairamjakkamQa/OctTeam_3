package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LOcators_demo {

	
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://trytestingthis.netlify.app/");
		
		
		
		List<WebElement> tags=driver.findElements(By.tagName("input"));
		
		
		System.out.println(tags.size());
		
	}
	
	
	
}
