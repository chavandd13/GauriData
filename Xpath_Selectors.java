package seleniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Selectors {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Soft Testing Training 2021\\Soft. Testing Application\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://kite.zerodha.com");
		driver.manage().window().maximize();
		
		// 1. Absolute Xpath: Starts from root node i.e. html tag
		
	/*	WebElement UserName = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/form/div[2]/input"));
		UserName.sendKeys("855287");
		
		WebElement Password = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/form/div[3]/input"));
		Password.sendKeys("1235688");
		
		WebElement Login = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/form/div[4]/button"));
		Login.click();*/
		
		// 2. Relative Xpath: //tagname[@attribute='value']
		
/*		WebElement UserName = driver.findElement(By.xpath("//input[@id='userid']"));
		UserName.sendKeys("855287");
		
		WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
		Password.sendKeys("1235688");
		
		WebElement Login = driver.findElement(By.xpath("//button[@class='button-orange wide']"));
		Login.click();*/
		
		// (1) Contains Method: (i) //tagname[contains(@attribute,'value')] - value may or may not be partial
				
	/*	WebElement UserName = driver.findElement(By.xpath("//input[contains(@id,'user')]"));
		UserName.sendKeys("855287");
		
		WebElement Password = driver.findElement(By.xpath("//input[contains(@id,'pass')]"));
		Password.sendKeys("1235688");
		
		WebElement Login = driver.findElement(By.xpath("//button[contains(@class,'orange')]"));
		Login.click();*/
		
		//  (ii) contains - text method - //tagname[contains(text(),'value')]
		
	/*	WebElement UserName = driver.findElement(By.xpath("//input[contains(@id,'user')]"));
		UserName.sendKeys("855287");
		
		WebElement Password = driver.findElement(By.xpath("//input[contains(@id,'pass')]"));
		Password.sendKeys("1235688");
		
		WebElement Login = driver.findElement(By.xpath("//button[contains(@class,'orange')]"));
		Login.click();
		
		WebElement SignUp = driver.findElement(By.xpath("//a[contains(text(),'Signup')]")); // Used Contains-text() method
		SignUp.click();*/
		
		// (2) Starts-with Method: //tagname[starts-with(@attribute,'value')]
		
	/*	WebElement UserName = driver.findElement(By.xpath("//input[starts-with(@id,'use')]"));
		UserName.sendKeys("855287");
		
		WebElement Password = driver.findElement(By.xpath("//input[starts-with(@id,'pas')]"));
		Password.sendKeys("1235688");
		
		WebElement Login = driver.findElement(By.xpath("//button[starts-with(@class,'but')]"));
		Login.click(); */
		
		// (3) Text() Method: //tagname[text()='value'] - Use only complete text
		
/*		WebElement UserName = driver.findElement(By.xpath("//input[contains(@id,'user')]"));
		UserName.sendKeys("855287");
		
		WebElement Password = driver.findElement(By.xpath("//input[contains(@id,'pass')]"));
		Password.sendKeys("1235688");
		
		WebElement ForgotPass = driver.findElement(By.xpath("//a[text()='Forgot password?']"));
		ForgotPass.click();*/
		
		// (4) AND, OR Method
		
		WebElement UserName = driver.findElement(By.xpath("//input[@id='userid' and @label='User ID']"));
		UserName.sendKeys("855287");
		
		WebElement Password = driver.findElement(By.xpath("//input[contains(@id,'pass') or (contains(@placeholder,'passw'))]"));
		Password.sendKeys("1235688");
		
		WebElement ForgotPass = driver.findElement(By.xpath("//a[contains(@class,'text-light forgot-link') or (contains(text(),'forgot'))]"));
		ForgotPass.click();
		

	}

}
