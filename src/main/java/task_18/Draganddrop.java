package task_18;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
         WebDriver driver = new ChromeDriver();
		
		//load the URL
		
		driver.get("https://jqueryui.com/droppable/");
		
		//maximize the window
		
		driver.manage().window().maximize();
		
		//Implicit wait to tell the selenium wait for 20 seconds
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.switchTo().frame(0);
		
		WebElement src = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		
		WebElement dest = driver.findElement(By.xpath("//p[text()='Drop here']"));
		
		//perform action
		
		Actions mouse = new Actions(driver);
		mouse.dragAndDrop(src, dest).perform();
		
		String backgroud = dest.getCssValue("background");
		
		System.out.println(backgroud);
		
		
		
		
	}

}
