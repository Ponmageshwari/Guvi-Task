package task_19;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Signup {

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
		
		//find element of fullname
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Mageshwari");
		
		////find element of email
		
		driver.findElement(By.cssSelector("input#email")).sendKeys("mahi@guvi.in");
		
		//find element of password
		
		driver.findElement(By.xpath("(//input[contains(@class,'form-control')])[3]")).sendKeys("Mahi123");
		
		//find element of mobile number
		
		driver.findElement(By.id("mobileNumber")).sendKeys("9875612345");

		
		//find element using id
		
		//driver.findElement(By.id("signup-btn")).click();
		
		//find element using xpath
		
		//driver.findElement(By.xpath("(//a[text()='Sign Up'])[1]")).click();
		
		//find element using css selector for signup
		
		driver.findElement(By.cssSelector("a#signup-btn")).click();
		
		WebElement text= driver.findElement(By.xpath("//h2[text()='Tell us about Yourself']"));
		
		String acttext = text.getText();
		
		System.out.println(acttext);
		
		System.out.println("Signup Successful");

	}

}
