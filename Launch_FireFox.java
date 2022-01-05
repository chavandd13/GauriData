package seleniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_FireFox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "E:\\Soft Testing Training 2021\\Soft. Testing Application\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//driver.get("https://www.facebook.com");
				//driver.close();
				
				//Navigational Methods:
				
				String url = "https://www.google.com";
		/*1*/	driver.navigate().to(url);
		/*2*/	driver.navigate().to("https://www.facebook.com");
			//	driver.manage().window().maximize();
		///*3*/   driver.navigate().back();
		///*4*/	driver.navigate().forward();
		///*5*/	driver.navigate().refresh();
				
				//Selectors:
				//1. id selector
				WebElement username = driver.findElement(By.id("email"));
				username.sendKeys("8552875855");
				
				WebElement password = driver.findElement(By.id("pass"));
				password.sendKeys("123456");
				
				// 2. name selector
				
//				WebElement login = driver.findElement(By.name("login"));
//				login.click();
				
				//3. classname selector
				
				WebElement CreateAPage = driver.findElement(By.className("_8esh"));
				CreateAPage.click();



			}
		



}
