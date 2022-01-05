package seleniumJava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Xpath_Axes_Method {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Soft Testing Training 2021\\Soft. Testing Application\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://upstox.com/");
		
		// 1. Implicit Wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		// 2. Explicit Wait
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//nav[contains(@class,'nav-left-links')]//child::div//child::ul//child::li//following-sibling::li//a[contains(text(),'Sign')]")));
		
		
		WebElement NoThanks = driver.findElement(By.xpath("//button[contains(text(),'No')]"));
		NoThanks.click();
		
		WebElement SignIn = driver.findElement(By.xpath("//nav[contains(@class,'nav-left-links')]//child::div//child::ul//child::li//following-sibling::li//a[contains(text(),'Sign')]"));
		SignIn.click();
		
		
		
		WebElement EnterMobileNo = driver.findElement(By.xpath("//input[@class='bq ak al bu ck cc k cl cm cn co bd cp cq cr cs ct cu u a']"));
		EnterMobileNo.sendKeys("8552875855");
		
		WebElement GetOtp = driver.findElement(By.xpath("//button[contains(text(),'Get OTP')]"));
		GetOtp.click();

	}

}
