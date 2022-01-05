package seleniumJava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Sauce_Web_Page {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "E:\\Soft Testing Training 2021\\Soft. Testing Application\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.navigate().to("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement UserName = driver.findElement(By.xpath("//input[contains(@id,'user-name')]"));
		UserName.sendKeys("performance_glitch_user");
		
		WebElement Password = driver.findElement(By.xpath("//input[contains(@id,'password')]"));
		Password.sendKeys("secret_sauce");
		
		WebElement Login = driver.findElement(By.xpath("//input[contains(@id,'login-button')]"));
		Login.click();
		
		driver.findElement(By.xpath("//div[contains(text(),'Sauce Labs Fleece Jacket')]")).click();
		
		driver.findElement(By.xpath("//button[contains(text(),'Add to cart')]")).click();
		
		driver.findElement(By.xpath("//a[contains(@class,'shopping_cart_link')]")).click();
		
		driver.findElement(By.xpath("//button[contains(@id,'checkout')]")).click();
		
		WebElement Fname = driver.findElement(By.xpath("//input[@id='first-name']"));
		Fname.sendKeys("DHARMARAJ");
		
		WebElement Lname = driver.findElement(By.xpath("//input[@id='last-name']"));
		Lname.sendKeys("CHAVAN");
		
		WebElement PinCode = driver.findElement(By.xpath("//input[@id='postal-code']"));
		PinCode.sendKeys("431517");
		
		driver.findElement(By.xpath("//input[@id='continue']")).click();
	}

}
