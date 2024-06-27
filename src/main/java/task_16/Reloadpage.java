package task_16;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Reloadpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		       //Launch the URL
		
				WebDriver driver = new FirefoxDriver();
				
				//load the URL
				
				driver.navigate().to("https://www.google.com/");
				
				//maximize the window
				
				driver.manage().window().maximize();
				
				//Implicit wait to tell the selenium wait for 20 seconds
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
				//get URL of current webpage
				
				String currenturl = driver.getCurrentUrl();
				
				System.out.println("The current url of page is:" + currenturl);
				
				//Refresh page
				
				driver.navigate().refresh();
				
				//close browser
				
				driver.quit();

	}

}
