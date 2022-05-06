package Resources;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class Utility extends Resources.base{
	
	public WebDriver driver;
	public void waitTime(int milliseconds) throws InterruptedException {
		
		
		Thread.sleep(milliseconds);
	
	}
	

	public void secondwindow(WebDriver driver) {
//		driver=initializeDriver();	
		
		Set<String> windows=driver.getWindowHandles();
		Iterator<String>it=windows.iterator();
		String parentId=it.next();
		String childId=it.next();
		driver.switchTo().window(childId);
		
		
	}

}
