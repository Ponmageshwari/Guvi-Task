package task_20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
         WebDriver driver = new ChromeDriver();
		
		//load the URL
		
		driver.get("https://www.guvi.in/register/");
		
		//maximize the window
		
		driver.manage().window().maximize();
		
		//Implicit wait to tell the selenium wait for 20 seconds
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Thread.sleep(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();

		driver.findElement(By.id("email")).sendKeys("maheswari26798@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("Rashmika@77");
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		
		String title = driver.getTitle();
		
		System.out.println("The page title:"+title);
		
		driver.close();

	}

}
