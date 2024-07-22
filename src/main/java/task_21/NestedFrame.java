package task_21;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/nested_frames");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//switch to Top Frame
		
		driver.switchTo().frame("frame-top");
		
		//To verify the numbers of frames present in page using List
		
		List<WebElement> frames = driver.findElements(By.tagName("frame"));
		
		String size  = String.valueOf(frames.size());
		
		if(size.equals("3")) {
			
			System.out.println("There are three frames present in the page");
		}else {
			
			System.out.println("There are no three frames present in the page");
		}
		
		
		//switch to Left frame
		
		driver.switchTo().frame("frame-left");
		
		String LeftFrame = driver.findElement(By.xpath("//body[contains(text(),'LEFT')]")).getText();

		System.out.println("The text in the LeftFrame:"+LeftFrame);
		
		//Switch back from child to parent frame
		
		driver.switchTo().parentFrame();
		
		//Switch to Middle Frame
		
		driver.switchTo().frame("frame-middle");
		
		String Middleframe = driver.findElement(By.xpath("//div[text()='MIDDLE']")).getText();
		
		System.out.println("The text in the MiddleFrame:"+Middleframe);
		
		//Switch back to top frame
		
		driver.switchTo().parentFrame();
		
		//Switch to Right frame
		
		driver.switchTo().frame("frame-right");
		
		String Rightframe = driver.findElement(By.xpath("//body[contains(text(),'RIGHT')]")).getText();
		
		System.out.println("The text in the RightFrame:"+Rightframe);
		
		//Switch back to topframe
		
		driver.switchTo().parentFrame();
		
		//Switch to default page
		
		driver.switchTo().defaultContent();
		
		//switch to bottom frame
		
		driver.switchTo().frame("frame-bottom");
		
		String bottomframe = driver.findElement(By.xpath("//body[contains(text(),'BOTTOM')]")).getText();
		
		if(bottomframe.equals("BOTTOM")) {
			
			System.out.println("Bottom frame text is:"+bottomframe);
		}else {
			
			System.out.println("Bottom frame has no text");
		}
		
		//Switch to deafult page content
		
		driver.switchTo().defaultContent();
		
		//To validate get the title of the page
		
		String Pageurl=driver.getCurrentUrl();
		
		if(Pageurl.contains("nested_frames")) {
			
			System.out.println("The current page has title as nested_frames");
			
		}else {
			
			System.out.println("The current page does not have  title as nested_frames");
		}
		
	}

}
