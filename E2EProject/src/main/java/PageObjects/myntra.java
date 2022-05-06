package PageObjects;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


import Resources.Utility;

public class myntra extends Utility{

	public WebDriver driver;
	public Actions actions;
	Helperclass h = new Helperclass();
	
	By searchbar = By.cssSelector(".desktop-searchBar");
	By name=By.className("sort-sortBy");
	By popularity = By.xpath("//label[normalize-space()='Popularity']");
	By productname=By.xpath("//div[@class='product-productMetaInfo']/h4");
	By productprice=By.xpath("//li[@class='product-base']");
	By cost=By.className("product-discountedPrice");
	By pincode=By.cssSelector("input[placeholder='Enter pincode");
	
	public myntra(WebDriver driver) {
		this.driver=driver;
		
		}
	
	

	
	
	public void searchforproduct() {
		 driver.findElement(searchbar).sendKeys (h.productname(), Keys.ENTER);
		
}
	
	
	public void choosingpopularproduct() {
		 actions=new Actions(driver);
		actions.moveToElement(driver.findElement(name)).build().perform();
		 driver.findElement(popularity).click();
		 }
	
	public void productnameandprice() throws IOException {
	
		System.out.println(driver.findElement(productname).getText());
		System.out.println(driver.findElement(cost).getText());
		driver.findElement(productprice).click();
	secondwindow(driver);
		 }
	
	
	public WebElement pincode() throws IOException, InterruptedException {
		
	WebElement pn=driver.findElement(pincode);
	pn.click();
	Thread.sleep(3000);
	pn.sendKeys(h.pincode(), Keys.ENTER);
	return pn;
	
		
		 }
	
	
	

}
