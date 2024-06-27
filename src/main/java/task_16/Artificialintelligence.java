package task_16;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Artificialintelligence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Launch URL
		
         WebDriver driver = new ChromeDriver();
		
		//load the URL
		
		driver.navigate().to("https://www.wikipedia.org/");
		
		//maximize the window
		
		driver.manage().window().maximize();
		
		//Implicit wait to tell the selenium wait for 20 seconds
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Find element using locator
		
		driver.findElement(By.id("searchInput")).sendKeys("Artificial Intelligence",Keys.ENTER);
		
		
	    //find element using xpath
		
		driver.findElement(By.xpath("//span[text()='History']")).click();
		
		//getting text of the title
		
		String title= driver.findElement(By.id("History")).getText();
		
		//printing the title
		
		System.out.println(title);


	}

}
