package seleniumJava;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowHandle_Concept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "E:\\Soft Testing Training 2021\\Soft. Testing Application\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.navigate().to("https://www.naukri.com/");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		String MainWindow = driver.getWindowHandle();
		
		Set<String> ChildWindows = driver.getWindowHandles();
		Iterator<String> itr = ChildWindows.iterator();
		while(itr.hasNext()) {
			
			String childwindow = itr.next();
			if(!MainWindow.equalsIgnoreCase(childwindow)) {
				
				driver.switchTo().window(childwindow);
				System.out.println(driver.getTitle());
				driver.close();
			}
		}	driver.switchTo().window(MainWindow);
		
		

	}

}
