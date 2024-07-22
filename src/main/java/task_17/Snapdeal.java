package task_17;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Snapdeal {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.snapdeal.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//Action class to move the pointer
		
		WebElement ele = driver.findElement(By.xpath("//span[text()='Sign In']"));
	     Actions mouse = new Actions(driver);
	     mouse.moveToElement(ele).perform();
		
	   driver.findElement(By.xpath("//a[text()='login']")).click();
	   
	   //Switch to frame
	   driver.switchTo().frame("loginIframe");	 
	   
	  WebElement ele1 = driver.findElement(By.xpath("//input[@name='username']"));
	  
	   ele1.sendKeys("maheswari26798@gmail.com");
	  
	  driver.findElement(By.id("checkUser")).click();
	  
	  Thread.sleep(6000);
	  
	  driver.findElement(By.id("loginUsingOtp")).click();
	  
	 String PageURL = driver.getCurrentUrl();
	 
	 System.out.println("The current url of page is:"+PageURL);
	 
     String Pagetitle = driver.getTitle();
	 
	 System.out.println("The current url of page is:"+Pagetitle);
	 
		
	}

}


