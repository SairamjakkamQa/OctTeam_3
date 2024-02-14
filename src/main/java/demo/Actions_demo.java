package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions_demo {
public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://trytestingthis.netlify.app/");

	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	WebElement image=driver.findElement(By.id("drag1"));
	
	
	WebElement destination=driver.findElement(By.id("div1"));
	
	Actions ac=new Actions(driver);
	
	//ac.moveToElement(login).build().perform();
	
	//ac.dragAndDrop(image, destination).build().perform();
	
	ac.contextClick(destination).build().perform();
	
}
}
