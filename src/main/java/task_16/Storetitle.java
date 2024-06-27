package task_16;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Storetitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Launch the URL
		
		WebDriver driver = new ChromeDriver();
		
		//load the URL
		
		driver.navigate().to("https://www.demoblaze.com/");
		
		//maximize the window
		
		driver.manage().window().maximize();
		
		//Implicit wait to tell the selenium wait for 20 seconds
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//verify title of url
		
		String Expectedtitle = "STORE";
		String title = driver.getTitle();

		//Condition to print the title matches or not
		
		if(Expectedtitle.equalsIgnoreCase(title)) {
			
			System.out.println("Page landed on correct website");
		}else {
			
			System.out.println("Page not loaded on correct website");
		}

	}

}
