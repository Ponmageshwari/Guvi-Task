package task_18;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebookscript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        //Launch URL
		
        WebDriver driver = new ChromeDriver();
		
		//load the URL
		
		driver.get("https://www.facebook.com/");
		
		//maximize the window
		
		driver.manage().window().maximize();
		
		//Implicit wait to tell the selenium wait for 20 seconds
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		//find elemnt and enter value into firstname and lastname
		
		driver.findElement(By.name("firstname")).sendKeys("Mahi");
		
		driver.findElement(By.name("lastname")).sendKeys("Mahi");
		
        //select using select tag for dob
   
		WebElement day = driver.findElement(By.id("day"));
		Select sc = new Select(day);
		sc.selectByIndex(4);
		
		WebElement month = driver.findElement(By.id("month"));
		Select sc1 = new Select(month);
		sc1.selectByVisibleText("Mar");
		
		WebElement year = driver.findElement(By.id("year"));
		Select sc2 = new Select(year);
		sc2.selectByVisibleText("2000");
		
		//click on radio button
		
		driver.findElement(By.xpath("(//input[@class='_8esa'])[1]")).click();
		
		//find element and enter email
        driver.findElement(By.name("reg_email__")).sendKeys("testuser1@test.com");
        
        //find element and enter value into password
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("Mahi1234");
		
		//Reenter email field
		
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("testuser1@test.com");
		
		//locate element for submit button
		
	     driver.findElement(By.name("websubmit")).click();
	     
	     //After signed up print successful message
	     System.out.println("Facebook Login was successful");
	}

}
