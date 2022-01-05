package seleniumJava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Alerts_Concept {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "E:\\\\Soft Testing Training 2021\\\\Soft. Testing Application\\\\edgedriver_win64\\\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.navigate().to("https://demoqa.com/alerts");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//img[@title='Ad.Plus Advertising']"));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[contains(@id,'alertButton')]")).click();
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//button[contains(@id,'timerAlertButton')]")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//button[contains(@id,'confirmButton')]")).click();
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//button[contains(@id,'promtButton')]")).click();
		driver.switchTo().alert().sendKeys("DHARMARAJ");
		driver.switchTo().alert().accept();
		
		driver.navigate().to("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();

	}

}
