package seleniumJava;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits_Concept {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Soft Testing Training 2021\\Soft. Testing Application\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://upstox.com/");
		
		// 1. Implicit Wait
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		// 2. Explicit Wait

	//	WebDriverWait wait = new WebDriverWait(driver, 10);
	//	wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//nav[contains(@class,'nav-left-links')]//child::div//child::ul//child::li//following-sibling::li//a[contains(text(),'Sign')]")));
		
		WebElement NoThanks = driver.findElement(By.xpath("//button[contains(text(),'No')]"));
		NoThanks.click();
		
		// 3. Fluent Wait:
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		Thread.sleep(2000);
		
		
		js.executeScript("alert('Hi Team')");
		js.executeScript("alert('Welcome ALL')");
		
		
		FluentWait wait1 = new FluentWait(driver);
		
		wait1.withTimeout(120, TimeUnit.SECONDS);
		
		wait1.pollingEvery(1000, TimeUnit.MILLISECONDS);
		
		wait1.ignoring(NoAlertPresentException.class);
		
		Function<WebDriver, Boolean> function = new Function<WebDriver, Boolean>()
		{
			public Boolean apply(WebDriver arg0) {
				
				{
					driver.switchTo().alert().accept();
					return true;
				}
			}
		};

wait1.until(function);

//		WebElement SignIn = driver.findElement(By.xpath("//nav[contains(@class,'nav-left-links')]//child::div//child::ul//child::li//following-sibling::li//a[contains(text(),'Sign')]"));
//		SignIn.click();

	}

}
