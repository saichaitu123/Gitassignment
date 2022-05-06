package PageObjects;




import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Resources.Utility;




public class Bookingticket extends Utility {
	public static Properties prop;
	public WebDriver driver;
	Helperclass h= new Helperclass();

	
	
	
		

	
	
	
	By fromcity = By.xpath("//div[@data-testid='to-testID-origin']");
	By fromcity1=By.xpath("//div[contains(text(),'"+h.fc()+"')]");
	By tocity1=By.xpath("//div[@class='css-1dbjc4n r-1joea0r']/following-sibling::div //div[contains(text(),'"+h.tc()+"')]");
	By fromtime1=By.xpath("//div[@data-testid='undefined-month-"+h.frommonth()+"-"+h.year()+"'] //div[contains(text(),'"+h.fromdate+"')]");
	By returntime1 = By.xpath("//div[@data-testid='undefined-month-"+h.tomonth()+"-"+h.year()+"'] //div[contains(text(),'"+h.todate+"')]");
	
	By returndatedropdown =By.xpath("//*[text()='Return Date']");
	
	By passengers1=By.xpath("//div[normalize-space()='Passengers']");
	By adding=By.cssSelector("div[data-testid='Adult-testID-plus-one-cta']");
	By searchflight=By.xpath("//div[@data-testid='home-page-flight-cta']");
	By done=By.xpath("//div[@data-testid='home-page-travellers-done-cta']");
	

	
	
	
	
		
	public Bookingticket(WebDriver driver) {
		this.driver=driver;
	}
	
	public void fromcity() throws InterruptedException {
	
	
	driver.findElement(fromcity).click();
	driver.findElement(fromcity1).click();
}
	
	public void tocity() {
	
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(03));
		driver.findElement(tocity1).click();
		}
	
	
	public void fromtime() {
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(03));
		driver.findElement(fromtime1).click();
		}
	
	
	public void returntime() throws InterruptedException {
		
		waitTime(6000);
	driver.findElement(returndatedropdown).click();
	
	driver.findElement(returntime1).click();
		}
	
	public void passengers() {
		
		driver.findElement(passengers1).click();
		int i=1;
		while(i<h.passenger) {
			driver.findElement(adding).click();
			i++;
		}
		driver.findElement(done).click();
		}
	
	public void searchflight() throws InterruptedException {
		driver.findElement(searchflight).click();
		waitTime(6000);
		
	}
	
	
	
	
	
	
	
	
	
	
}
