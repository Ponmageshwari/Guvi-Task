package task_19;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Email {

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
		
		//driver.findElement(By.id("email")).sendKeys("mahi@guvi.in");
		
		
		//find element using xpath
		
		//driver.findElement(By.xpath("(//input[@class='form-control'])[2]")).sendKeys("mahi@guvi.in");
		
		//find element using css selector
		
		driver.findElement(By.cssSelector("input#email")).sendKeys("mahi@guvi.in");


	}

}
