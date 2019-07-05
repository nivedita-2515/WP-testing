package apptest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Registration {
	public static void main(String[] args)throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "/users/ambika/downloads/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://app.wpdrift.io/register#/");
		
		
		driver.findElement(By.name("name")).sendKeys("testuserjesish");
		
		driver.findElement(By.name("email")).sendKeys("jesish.321@gmail.com");
		
		driver.findElement(By.name("password")).sendKeys("testuserjesish");
		
		driver.findElement(By.xpath("//input[@class='form-check-input'] ")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary'] ")).click();
		Thread.sleep(6000);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.close();
		
		
		
		
		
	}
}
