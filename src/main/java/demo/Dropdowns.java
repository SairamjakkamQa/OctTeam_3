package demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdowns {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

//		WebElement options=driver.findElement(By.id("option"));
//		
//		Select sel=new Select(options);

		// sel.selectByVisibleText("Option 3");
		// sel.selectByValue("option 2");

		// sel.selectByIndex(3);

		driver.findElement(By.id("APjFqb")).sendKeys("selenium");

		List<WebElement> options = driver.findElements(By.xpath("//div[@class='wM6W7d']//b"));

		System.out.println(options.size());

		for (WebElement suggestions : options) {

			System.out.println(suggestions.getText());

			if (suggestions.getText().contains("download")) {

				suggestions.click();
			}

		}

	}

}
