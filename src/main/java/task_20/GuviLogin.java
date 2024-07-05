package task_20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GuviLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
        WebDriver driver = new ChromeDriver();
		
		//load the URL
		
		driver.get("https://www.guvi.in/");
		
		//maximize the window
		
		driver.manage().window().maximize();
		
		//Implicit wait to tell the selenium wait for 20 seconds
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		
		//find element of fullname
		
				driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Mageshwari");
				
				////find element of email
				
				driver.findElement(By.cssSelector("input#email")).sendKeys("mahi1@guvi.in");
				
				//find element of password
				
				driver.findElement(By.xpath("(//input[contains(@class,'form-control')])[3]")).sendKeys("Mahi123");
				
				//find element of mobile number
				
				driver.findElement(By.id("mobileNumber")).sendKeys("9875612345");
				
				//find element using css selector for signup
				
				driver.findElement(By.cssSelector("a#signup-btn")).click();

				driver.findElement(By.id("laterBtn")).click();
				
				driver.navigate().back();
							
	}

}
