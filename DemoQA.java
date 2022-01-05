package seleniumJava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoQA {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "E:\\Soft Testing Training 2021\\Soft. Testing Application\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.navigate().to("https://demoqa.com/automation-practice-form");
		driver.findElement(By.xpath("//img[contains(@title,'Ad.Plus Advertising')]")).click();
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement FirstName = driver.findElement(By.xpath("//input[contains(@id,'firstName')]"));
		FirstName.sendKeys("DHARMARAJ");
		
		WebElement LastName = driver.findElement(By.xpath("//input[contains(@id,'lastName')]"));
		LastName.sendKeys("CHAVAN");
		
		WebElement UserEmail = driver.findElement(By.xpath("//input[contains(@id,'userEmail')]"));
		UserEmail.sendKeys("chavandharmaraj@gmail.com");
		
		WebElement GenderMale = driver.findElement(By.xpath("//label[contains(text(),'Male')]"));
		GenderMale.click();
		
		WebElement MobileNo = driver.findElement(By.xpath("//input[contains(@id,'userNumber')]"));
		MobileNo.sendKeys("8552875855");
		
		driver.findElement(By.xpath("//input[contains(@id,'dateOfBirthInput')]")).click();
		
		WebElement Year = driver.findElement(By.xpath("//select[contains(@class,'react-datepicker__year-select')]"));
		Select selectyear = new Select(Year);
		selectyear.selectByValue("1991");
		
		WebElement Month = driver.findElement(By.xpath("//select[contains(@class,'react-datepicker__month-select')]"));
		Select selectMonth = new Select(Month);
		selectMonth.selectByVisibleText("September");
		
		driver.findElement(By.xpath("//div[contains(@class,'react-datepicker__day react-datepicker__day--013')]")).click();
		
//		WebElement Subjects = driver.findElement(By.xpath("//div[contains(@class,'subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3')]"));
//		Subjects.sendKeys("Computer,Science,Maths");
		
		driver.findElement(By.xpath("//label[contains(text(),'Sports')]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Reading')]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Music')]")).click();
		
/*		WebElement UploadFile = driver.findElement(By.xpath("//input[contains(@id,'uploadPicture')]"));
		UploadFile.click();
		UploadFile.sendKeys("E:\\Soft Testing Training 2021\\Soft. Testing Docs\\a.png");
		driver.findElement(By.id("Open"));*/
		
		
		WebElement CurrentAddress = driver.findElement(By.xpath("//textarea[contains(@class,'form-control')]"));
		CurrentAddress.sendKeys("New Bank Colony, Parli road, Ambajogai");
		
		driver.findElement(By.xpath("//div[contains(text(),'Select State')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Uttar Pradesh')]")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'Select City')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Agra')]")).click();
		
		driver.findElement(By.xpath("//button[contains(@id,'submit')]")).click();
		
		
		

	}

}
