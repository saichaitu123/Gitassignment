package PageObjects;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Resources.Utility;

public class BSE extends Utility {
	
	public static Properties prop;
	public WebDriver driver;
	Helperclass h= new Helperclass();
	
	
	By heading = By.xpath("(//table[@class='ng-scope'])[5]//tbody//following-sibling::tr[1]//tr[2]//td");
	String beforetitles = "(//table[@class='ng-scope'])[5]//tbody//following-sibling::tr[1]//tr[2]//td[";
	String aftertitles = "]";
	By column=By.xpath("//table[contains(.,'Mo')]//tr[@class='ng-scope']//td[@class='tdcolumn']");
	String beforecolumn = "(//table[contains(.,'Mo')]//tr[@class='ng-scope']//td[@class='tdcolumn'])[";
	String aftercolumn = "]";
	By Contract=By.xpath("(//table[contains(.,'Mo')]//b[contains(.,'Con')])[1]");
	
	
	
	
	public BSE(WebDriver driver) {
		this.driver=driver;
	}
	

	public void totalrowcount() throws InterruptedException {
		List <WebElement> table=driver.findElements(heading);
		System.out.println("***************");
		System.out.println("No of rows = "+table.size());
		System.out.println("***************");
	}
	
	
	public void printtitles() {
		List <WebElement> table=driver.findElements(heading);
		
		for(int i=1;i<=table.size();i++) {
			String xpathfull=beforetitles+i+aftertitles;
			WebElement Element = driver.findElement(By.xpath(xpathfull));
			System.out.println("Title at the row position "+i+" is "+Element.getText());
		}
	}
		public void columncount() {
			List <WebElement> table=driver.findElements(column);
			
			System.out.println("***************");
			System.out.println("No of columns = "+table.size());
			System.out.println("***************");
		}
		
		public String contract() {
		return driver.findElement(Contract).getText();	
		}
		
		
		
		public void printcontract() {

			List <WebElement> table=driver.findElements(column);
			for(int i=1;i<=table.size();i++) {
				String xpathfull=beforecolumn+i+aftercolumn;
				WebElement Element = driver.findElement(By.xpath(xpathfull));
				System.out.println("Title at the column position "+i+" is "+Element.getText());
			}
		
		
	}
	
	

}

