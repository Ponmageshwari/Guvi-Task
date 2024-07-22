package task_21;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		// Switch to window
		
				Set<String> windowHandles = driver.getWindowHandles();
				
				// Step 2: Convert Set to List
				
				List<String> windows = new ArrayList<String>(windowHandles);
				
				// Step 3: Pick the particular window and switch to it.
				
				driver.switchTo().window(windows.get(1));
				
				String text = driver.findElement(By.xpath("//h3[text()='New Window']")).getText();
				
				System.out.println("The text of page is:"+text);
				
				driver.close();
				
				//Switching back to parent Window
				
				driver.switchTo().window(windows.get(0));
				
				String parent = driver.findElement(By.xpath("//h3[text()='Opening a new window']")).getText();
				
				System.out.println("The text of parent page is:"+parent);
				
				//driver.close();
				
				
	}

}
