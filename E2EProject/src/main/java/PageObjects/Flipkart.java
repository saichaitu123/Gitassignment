package PageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Resources.Utility;

public class Flipkart extends Utility{
	
	public WebDriver driver;
	Helperclass h = new Helperclass();
	

	@FindBy(className="_2IX_2-")
	WebElement usernameID;
	
	@FindBy(xpath="//div[@class='IiD88i _351hSN']/following-sibling::div/input[@type='password']")
	WebElement password;
	
	@FindBy(xpath="//div[@class='_2YsvKq o8qAfl']//parent::button")
	WebElement login1;
	
	@FindBy(xpath="//span[@Class='_2YULOR']")
	WebElement loginerror;
	
	

	public Flipkart(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void usernameID() {
		usernameID.sendKeys(h.username());
}
	
	public void password() {
		 password.sendKeys(h.password());
}
	
	public WebElement login() {
		return login1;
		}
	
	public WebElement loginerror() throws InterruptedException {
		waitTime(4000);
		return loginerror;
		
}
	public WebElement returnPassword() {
		
		return password;
	}

	}

