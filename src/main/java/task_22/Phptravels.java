package task_22;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v125.page.model.Screenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Phptravels {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
        //Launch URL
		
        WebDriver driver = new ChromeDriver();
		
		//load the URL
		
		driver.get("https://phptravels.com/demo/");
		
		//maximize the window
		
		driver.manage().window().maximize();
		
		//Implicit wait to tell the selenium wait for 20 seconds
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.name("first_name")).sendKeys("Mahi");
		
		driver.findElement(By.name("last_name")).sendKeys("G");
		
		driver.findElement(By.name("business_name")).sendKeys("Php Travels");
		
		driver.findElement(By.name("email")).sendKeys("test@gmail.com");
		
		//driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
		String num1 = driver.findElement(By.id("numb1")).getText();
		
		String num2 = driver.findElement(By.id("numb2")).getText();
		
		//Converting string to integer
		
		int a = Integer.valueOf(num1);
		int b = Integer.valueOf(num2);
		 
		 int add = a + b;
		 
		 //Converting integer to string
		String result=  Integer.toString(add);
		
		driver.findElement(By.id("number")).sendKeys(result);
		
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
		WebElement message = driver.findElement(By.xpath("//strong[text()=' Thank you!']"));
		
		//Webdriverwait is used to wait for the element until it is visible
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(message));
		
		String text = message.getText();
		
		System.out.println("Message of form:"+text);
		
		//capture screenshot
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Users\\Administrator\\eclipse-workspace\\SeleniumAutomation\\snap\\image.png");
		
		FileUtils.copyFile(source, dest);
	}

}


