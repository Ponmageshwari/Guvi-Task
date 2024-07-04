package task_20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        //Launch URL
		
        WebDriver driver = new ChromeDriver();
		
		//load the URL
		
		driver.get("https://jqueryui.com/datepicker/");
		
		//maximize the window
		
		driver.manage().window().maximize();
		
		//Implicit wait to tell the selenium wait for 20 seconds
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		//switch to frame
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("datepicker")).click();
		
		String expectedDay="22";
		String expcetedMonth="August 2024";
		
	    while(true) {
	    	
	    	String Actualmonth = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
	    	
	    	if(Actualmonth.equals(expcetedMonth)) {
	    		break;
	    	}
	    	else {
	    		
	    		driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']")).click();
	    	}
	    }
	    driver.findElement(By.xpath("//a[text()='22']")).click();
	    
	    WebElement ele = driver.findElement(By.xpath("//input[@id='datepicker']"));
	    
	    //get attribute method to get the value of the tag
	   String text= ele.getAttribute("value");
	    
	   System.out.println("Selected date is:" + text);
	   
	   //driver.close();
	   
	   
	    
	   	}
	
	
	

}

