package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Javascriptex {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://trytestingthis.netlify.app/");

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		WebElement alertbutton = driver.findElement(By.xpath("//button[text()=' Your Sample Alert Button!']"));

		WebElement alert2 = driver.findElement(By.xpath("//button[text()=' Your Sample Alert Button!']"));

		WebElement firstname = driver.findElement(By.id("fname"));

		WebElement scrollelement = driver
				.findElement(By.xpath("//h4[text()=' Source code for this website is available  ']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// js.executeScript("arguments[0].click();",alertbutton);

		// js.executeScript("arguments[0].value='john snow';", firstname);

		// js.executeScript("arguments[0].scrollIntoView(true);", scrollelement);

		// js.executeScript("window.scrollBy(0,400)");

		Point location = scrollelement.getLocation();
		
		js.executeScript("window.scrollBy"+location);

	}

}
