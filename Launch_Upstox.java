package seleniumJava;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Launch_Upstox {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "E:\\Soft Testing Training 2021\\Soft. Testing Application\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.navigate().to("https://upstox.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[contains(text(),'No thanks')]")).click();
		WebElement SignIn = driver.findElement(By.xpath("//nav[@class='nav-left-links']//child::div//child::ul//child::li[2]//a[contains(text(),'Sign In')]"));
		SignIn.click();
		
		String MainWindow = driver.getWindowHandle();
		Set<String> ChildWindows = driver.getWindowHandles();
		
		Iterator<String> itr = ChildWindows.iterator();
		while(itr.hasNext()) {
			
			String childWindow = itr.next();
			if(!MainWindow.equalsIgnoreCase(childWindow)) {
				
				driver.switchTo().window(childWindow);
				System.out.println(driver.getTitle());
			}
		//	driver.switchTo().window(MainWindow);
		//	driver.close();
		}
		driver.navigate().to("https://login.upstox.com/");
		WebElement EnterPin = driver.findElement(By.xpath("https://login.upstox.com/"));
		EnterPin.sendKeys("855955");
	/*	WebElement EnterMobileNo = driver.findElement(By.xpath("//input[contains(@class,'bq ak al bu ck cc k cl cm cn co bd cp cq cr cs ct cu u a')]"));
		EnterMobileNo.sendKeys("8552875855");
		driver.findElement(By.xpath("//button[contains(text(),'Get OTP')]")).click();*/

	}

}
