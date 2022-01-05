package seleniumJava;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Test_Naukri {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "E:\\\\Soft Testing Training 2021\\\\Soft. Testing Application\\\\edgedriver_win64\\\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.navigate().to("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	
		
		String MainWindow = driver.getWindowHandle();
		
		Set<String> ChildWindows = driver.getWindowHandles();
		
		Iterator<String> itr = ChildWindows.iterator();
		while(itr.hasNext()) {
			
			String childWindow = itr.next();
			if(!MainWindow.equalsIgnoreCase(childWindow)) {
				
				driver.switchTo().window(childWindow);
				System.out.println(driver.getTitle());
				driver.close();
			}
			driver.switchTo().window(MainWindow);
			
		}
		
	//	driver.findElement(By.xpath("//button[contains(text(),'GOT IT')]"));
	//	driver.findElement(By.xpath("//span[contains(text(),'Later')]"));
		
		driver.findElement(By.xpath("//div[contains(text(),'Jobs')]")).click();
		
		WebElement Search = driver.findElement(By.xpath("//input[contains(@id,'qsb-keyword-sugg')]"));
		Search.sendKeys("Automation testing");
		
		WebElement Location = driver.findElement(By.xpath("//input[contains(@id,'qsb-location-sugg')]"));
		Location.sendKeys("Pune");
		
		driver.findElement(By.xpath("//button[contains(text(),'Search')]")).click();

	}

}
