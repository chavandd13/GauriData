package seleniumJava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ReadProperties_Concept {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\DC\\eclipse-workspace\\Selenium_Java_Project_2021\\Data.properties");
		Properties prop = new Properties();
		prop.load(file);
		
		System.setProperty("webdriver.edge.driver", prop.getProperty("driverpath"));
		WebDriver driver = new EdgeDriver();
		driver.navigate().to(prop.getProperty("Url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(prop.getProperty("UserName"));
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(prop.getProperty("Password"));
		driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();

	}

}
