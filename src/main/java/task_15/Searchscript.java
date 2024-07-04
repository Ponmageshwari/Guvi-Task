package task_15;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Searchscript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Launch the URL
		WebDriver driver = new ChromeDriver();
		
		//load the URL
		
		driver.navigate().to("https://www.google.com/");
		
		//maximize the window
		
		driver.manage().window().maximize();
		
		//Implicit wait to tell the selenium wait for 20 seconds
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//find element using locators
		
		WebElement search = driver.findElement(By.className("gLFyf"));
		
		search.sendKeys("Selenium Browser Driver",Keys.ENTER);
		
		driver.close();	
	}

}
