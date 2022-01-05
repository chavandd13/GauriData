package seleniumJava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions_Concept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "E:\\\\Soft Testing Training 2021\\\\Soft. Testing Application\\\\edgedriver_win64\\\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.navigate().to("https://demoqa.com/text-box");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);
		
		driver.findElement(By.xpath("//a[@id='close-fixedban']")).click();
		
		WebElement UserName = driver.findElement(By.xpath("//input[@id='userName']"));
		WebElement UserEmail = driver.findElement(By.xpath("//input[@id='userEmail']"));
		WebElement CurrAdd = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
//		WebElement PerAdd = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
		WebElement SubmitBtn = driver.findElement(By.xpath("//button[@id='submit']"));
//		WebElement links = driver.findElement(By.xpath("//span[text()='Links']"));
		
		actions.sendKeys(UserName, "DHARMARAJ CHAVAN").perform();
		actions.sendKeys(UserEmail, "chavandharmaraj@gmail.com").perform();
		actions.sendKeys(CurrAdd, "New Bank Colony, parli road, Ambajogai").perform();
		
		// current address select using Ctrl + a
				actions.keyDown(Keys.CONTROL);
				actions.sendKeys("a");
				actions.keyUp(Keys.CONTROL);
				actions.build().perform();
				
				// current address Copy
				actions.keyDown(Keys.CONTROL);
				actions.sendKeys("c");
				actions.keyUp(Keys.CONTROL);
				actions.build().perform();
				
				// Tab key
				actions.sendKeys(Keys.TAB);
				actions.build().perform();
				
				// paste address in Permenant address
				
				actions.keyDown(Keys.CONTROL);
				actions.sendKeys("v");
				actions.keyUp(Keys.CONTROL);
				actions.build().perform();
				
				// Tab key
				actions.sendKeys(Keys.TAB);
				actions.build().perform();
				
				actions.click(SubmitBtn).build().perform();
		

	}



}
