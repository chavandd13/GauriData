package seleniumJava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions_Concept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "E:\\\\Soft Testing Training 2021\\\\Soft. Testing Application\\\\edgedriver_win64\\\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.navigate().to("https://demoqa.com/buttons");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//Create an object of Actions class, object reference is actions & pass driver in it. 
		Actions actions = new Actions(driver);
		
		WebElement DoubleClickBtn = driver.findElement(By.xpath("//button[contains(@id,'doubleClickBtn')]"));
		actions.doubleClick(DoubleClickBtn).perform();
		
		WebElement RightClickBtn = driver.findElement(By.xpath("//button[contains(@id,'rightClickBtn')]"));
		actions.contextClick(RightClickBtn).perform();
		
		WebElement Click = driver.findElement(By.xpath("//button[text()='Click Me']"));
		actions.click(Click).perform();
		
		driver.navigate().to("https://demoqa.com/droppable");
		
		WebElement DragBtn = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement DropBtn = driver.findElement(By.xpath("//div[@id='draggable']//following-sibling::div"));
		actions.dragAndDrop(DragBtn, DropBtn).perform();
		
		driver.navigate().to("https://demoqa.com/tool-tips");
		WebElement HoverMe = driver.findElement(By.xpath("//button[@id='toolTipButton']"));
		actions.moveToElement(HoverMe).perform();
		System.out.println(driver.findElement(By.xpath("//div[@id='buttonToolTip']")).getText());

	}

}
