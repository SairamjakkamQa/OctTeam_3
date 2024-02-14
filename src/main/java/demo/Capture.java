package demo;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Capture {

	
	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://trytestingthis.netlify.app/");
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		TakesScreenshot ts=(TakesScreenshot)driver;     //casting
		File image=ts.getScreenshotAs(OutputType.FILE);     //image stored in type as file
		File path=new File("./target/sample.png");        //path
		
		FileUtils.copyFile(image, path);           //method
		
		
	}
	
}
