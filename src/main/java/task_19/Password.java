package task_19;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        //Launch URL
		
        WebDriver driver = new ChromeDriver();
		
		//load the URL
		
		driver.get("https://www.guvi.in/register");
		
		//maximize the window
		
		driver.manage().window().maximize();
		
		//Implicit wait to tell the selenium wait for 20 seconds
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//find element using id
		
		//driver.findElement(By.id("password")).sendKeys("12345678");
		
		//find element using class name
		
		driver.findElement(By.xpath("(//input[contains(@class,'form-control')])[3]")).sendKeys("123456");
		
		//find element using css selector id
		
		//driver.findElement(By.cssSelector("input#password")).sendKeys("123456");


	}

}
