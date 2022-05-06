package PageObjects;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Helperclass {
	public static Properties prop;
	public static  FileInputStream fis;
	
	
	String fc()  {
		prop=new Properties();
		
		try {
			fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop.getProperty("from");
			}
	
	
	 String tc() {
prop=new Properties();
		
		try {
			fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop.getProperty("to");
	}
	
	 
	 String fromdate() {
		 prop=new Properties();
		 		
		 		try {
		 			fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");
		 		} catch (FileNotFoundException e) {
		 			// TODO Auto-generated catch block
		 			e.printStackTrace();
		 		}
		 		try {
		 			prop.load(fis);
		 		} catch (IOException e) {
		 			// TODO Auto-generated catch block
		 			e.printStackTrace();
		 		}
		 		return prop.getProperty("fromdate");
		 	}
	 int fromdate = Integer.parseInt(fromdate());

	 String frommonth() {
		 prop=new Properties();
		 		
		 		try {
		 			fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");
		 		} catch (FileNotFoundException e) {
		 			// TODO Auto-generated catch block
		 			e.printStackTrace();
		 		}
		 		try {
		 			prop.load(fis);
		 		} catch (IOException e) {
		 			// TODO Auto-generated catch block
		 			e.printStackTrace();
		 		}
		 		return prop.getProperty("frommonth");
		 	}
	
	 String todate() {
		 prop=new Properties();
		 		
		 		try {
		 			fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");
		 		} catch (FileNotFoundException e) {
		 			// TODO Auto-generated catch block
		 			e.printStackTrace();
		 		}
		 		try {
		 			prop.load(fis);
		 		} catch (IOException e) {
		 			// TODO Auto-generated catch block
		 			e.printStackTrace();
		 		}
		 		return prop.getProperty("todate");
		 	}
	 int todate = Integer.parseInt(fromdate());
	 
	 String tomonth() {
		 prop=new Properties();
		 		
		 		try {
		 			fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");
		 		} catch (FileNotFoundException e) {
		 			// TODO Auto-generated catch block
		 			e.printStackTrace();
		 		}
		 		try {
		 			prop.load(fis);
		 		} catch (IOException e) {
		 			// TODO Auto-generated catch block
		 			e.printStackTrace();
		 		}
		 		return prop.getProperty("tomonth");
		 	}

	 String year() {
		 prop=new Properties();
		 		
		 		try {
		 			fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");
		 		} catch (FileNotFoundException e) {
		 			// TODO Auto-generated catch block
		 			e.printStackTrace();
		 		}
		 		try {
		 			prop.load(fis);
		 		} catch (IOException e) {
		 			// TODO Auto-generated catch block
		 			e.printStackTrace();
		 		}
		 		return prop.getProperty("year");
		 	}
	 
	 
	 String pass() {
		 prop=new Properties();
		 		
		 		try {
		 			fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");
		 		} catch (FileNotFoundException e) {
		 			// TODO Auto-generated catch block
		 			e.printStackTrace();
		 		}
		 		try {
		 			prop.load(fis);
		 		} catch (IOException e) {
		 			// TODO Auto-generated catch block
		 			e.printStackTrace();
		 		}
		 		return prop.getProperty("passengers");
		 	}
	 int passenger = Integer.parseInt(pass());

	 
	 public String url1() {
		 prop=new Properties();
		 		
		 		try {
		 			fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");
		 		} catch (FileNotFoundException e) {
		 			// TODO Auto-generated catch block
		 			e.printStackTrace();
		 		}
		 		try {
		 			prop.load(fis);
		 		} catch (IOException e) {
		 			// TODO Auto-generated catch block
		 			e.printStackTrace();
		 		}
		 		return prop.getProperty("url1");
		 	}
	 
	 public String url2() {
		 prop=new Properties();
		 		
		 		try {
		 			fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");
		 		} catch (FileNotFoundException e) {
		 			// TODO Auto-generated catch block
		 			e.printStackTrace();
		 		}
		 		try {
		 			prop.load(fis);
		 		} catch (IOException e) {
		 			// TODO Auto-generated catch block
		 			e.printStackTrace();
		 		}
		 		return prop.getProperty("url2");
		 	}
	 
	 public String url3() {
		 prop=new Properties();
		 		
		 		try {
		 			fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");
		 		} catch (FileNotFoundException e) {
		 			// TODO Auto-generated catch block
		 			e.printStackTrace();
		 		}
		 		try {
		 			prop.load(fis);
		 		} catch (IOException e) {
		 			// TODO Auto-generated catch block
		 			e.printStackTrace();
		 		}
		 		return prop.getProperty("url3");
		 	}
	 
	 public String url4() {
		 prop=new Properties();
		 		
		 		try {
		 			fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");
		 		} catch (FileNotFoundException e) {
		 			// TODO Auto-generated catch block
		 			e.printStackTrace();
		 		}
		 		try {
		 			prop.load(fis);
		 		} catch (IOException e) {
		 			// TODO Auto-generated catch block
		 			e.printStackTrace();
		 		}
		 		return prop.getProperty("url4");
		 	}
	 
	 public String username() {
		 prop=new Properties();
		 		
		 		try {
		 			fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");
		 		} catch (FileNotFoundException e) {
		 			// TODO Auto-generated catch block
		 			e.printStackTrace();
		 		}
		 		try {
		 			prop.load(fis);
		 		} catch (IOException e) {
		 			// TODO Auto-generated catch block
		 			e.printStackTrace();
		 		}
		 		return prop.getProperty("username");
		 	}
	 
	 public String expected() {
		 prop=new Properties();
		 		
		 		try {
		 			fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");
		 		} catch (FileNotFoundException e) {
		 			// TODO Auto-generated catch block
		 			e.printStackTrace();
		 		}
		 		try {
		 			prop.load(fis);
		 		} catch (IOException e) {
		 			// TODO Auto-generated catch block
		 			e.printStackTrace();
		 		}
		 		return prop.getProperty("expected");
		 	}
	 
	 public String password() {
		 prop=new Properties();
		 		
		 		try {
		 			fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");
		 		} catch (FileNotFoundException e) {
		 			// TODO Auto-generated catch block
		 			e.printStackTrace();
		 		}
		 		try {
		 			prop.load(fis);
		 		} catch (IOException e) {
		 			// TODO Auto-generated catch block
		 			e.printStackTrace();
		 		}
		 		return prop.getProperty("password");
		 	}
	 
	 public String path() {
		 prop=new Properties();
		 		
		 		try {
		 			fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");
		 		} catch (FileNotFoundException e) {
		 			// TODO Auto-generated catch block
		 			e.printStackTrace();
		 		}
		 		try {
		 			prop.load(fis);
		 		} catch (IOException e) {
		 			// TODO Auto-generated catch block
		 			e.printStackTrace();
		 		}
		 		return prop.getProperty("file");
		 	}
	 
	 public String driverpath() {
		 prop=new Properties();
		 		
		 		try {
		 			fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");
		 		} catch (FileNotFoundException e) {
		 			// TODO Auto-generated catch block
		 			e.printStackTrace();
		 		}
		 		try {
		 			prop.load(fis);
		 		} catch (IOException e) {
		 			// TODO Auto-generated catch block
		 			e.printStackTrace();
		 		}
		 		return prop.getProperty("driverpath");
		 	}
	 
	 public String productname() {
		 prop=new Properties();
		 		
		 		try {
		 			fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");
		 		} catch (FileNotFoundException e) {
		 			// TODO Auto-generated catch block
		 			e.printStackTrace();
		 		}
		 		try {
		 			prop.load(fis);
		 		} catch (IOException e) {
		 			// TODO Auto-generated catch block
		 			e.printStackTrace();
		 		}
		 		return prop.getProperty("productname");
		 	}
	 
	 public String pincode() {
		 prop=new Properties();
		 		
		 		try {
		 			fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");
		 		} catch (FileNotFoundException e) {
		 			// TODO Auto-generated catch block
		 			e.printStackTrace();
		 		}
		 		try {
		 			prop.load(fis);
		 		} catch (IOException e) {
		 			// TODO Auto-generated catch block
		 			e.printStackTrace();
		 		}
		 		return prop.getProperty("pincode");
		 	}

	 public String checkingcolumntext() {
		 prop=new Properties();
		 		
		 		try {
		 			fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");
		 		} catch (FileNotFoundException e) {
		 			// TODO Auto-generated catch block
		 			e.printStackTrace();
		 		}
		 		try {
		 			prop.load(fis);
		 		} catch (IOException e) {
		 			// TODO Auto-generated catch block
		 			e.printStackTrace();
		 		}
		 		return prop.getProperty("Assertion");
		 	}
	
	
	 }


