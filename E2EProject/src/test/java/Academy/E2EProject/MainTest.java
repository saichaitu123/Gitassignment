package Academy.E2EProject;



import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.BSE;
import PageObjects.Bookingticket;
import PageObjects.Helperclass;
import PageObjects.myntra;
import PageObjects.Flipkart;



public class MainTest extends Resources.base {
	Helperclass h1= new Helperclass();

@BeforeTest

public void beforetest() throws IOException {
	driver=initializeDriver();	

	
	
}
	
	
	

@Test (priority=1)
public void validatinglogindetails() throws IOException, InterruptedException
{
	//opening flipkart site
	driver.get(h1.url1());
	Flipkart l = new Flipkart(driver);
	
	//entering username
	l.usernameID(); 
	
	//validating password field
	Assert.assertTrue(l.returnPassword().isEnabled());
	
	 //entering password
    l.password();
    
    
    
    //clicking login button
    l.login().click();
    
    //Validating Login confirmation message
    Assert.assertEquals(l.loginerror().getText(), h1.expected());
    

    
    
   
}

@Test (priority=2)
public void bookingflightticket() throws IOException, InterruptedException {
	
	//opening spicejet site
	driver.get(h1.url2());
	Bookingticket u=new Bookingticket(driver);
	
	
	 //choosing the city in "from" dropdown
	u.fromcity();
	
	//choosing the city "to" dropdown
	u.tocity(); 
	
	//choosing "from" date.
	u.fromtime(); 
	
	//choosing "to" date
	u.returntime(); 
	
	//choosing "number of passengers
	u.passengers(); 
	
	//searching flights for above details.
	u.searchflight(); 
}


@Test (priority=3)
public void shopping() throws IOException, InterruptedException { 
	
	
	//opening myntra website
	driver.get(h1.url3());
	myntra mn = new myntra(driver);
	
	//searching for desired product
	mn.searchforproduct();
	
	
	//choosing popular one out of all
	mn.choosingpopularproduct();
	
	//printing product name and its price in the console
	mn.productnameandprice();
	
	//Validating pincode entry
	Assert.assertTrue(mn.pincode().isEnabled());
	
	//entering pincode to purchase the product
	mn.pincode();
	
}

@Test (priority=4)

public void bsestock() throws InterruptedException {
	
	driver.get(h1.url4());
	BSE b = new BSE(driver);
	
	//printing total row count
	b.totalrowcount();
	
	//printing contents of first row
	b.printtitles();
	
	//printing total column count
	b.columncount();
	
	//validating text present at first column
	Assert.assertEquals(h1.checkingcolumntext(), b.contract());
	
	//printing contents of first row
	b.printcontract();
	
	
}





@AfterTest
public void aftertest() throws InterruptedException {
	
	driver.quit();
}
}

