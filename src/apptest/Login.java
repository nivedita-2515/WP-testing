package apptest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	public static void main(String[] args)throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "/Users/ambika/downloads/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://app.wpdrift.io/register#/");
		driver.findElement(By.xpath("//a[@class='nav-link']")).click();
		driver.findElement(By.name("email")).sendKeys("jesish.321@gmail.com");
		driver.findElement(By.name("password")).sendKeys("testuserjesish");
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		driver.findElement(By.id("store-name")).sendKeys("testuserjesish");
		
		driver.findElement(By.id("store-url")).sendKeys("www.facebook.com");
		WebElement uploadElement=driver.findElement(By.id("store-photo"));
		uploadElement.sendKeys("/Users/ambika/Downloads/image 2.jpg");
		
		driver.findElement(By.xpath("//a[@class='pull-right btn btn-primary btn-sm']")).click();
		driver.findElement(By.id("company-name")).sendKeys("appllo");
		driver.findElement(By.id("company-content")).sendKeys("education world");
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		driver.findElement(By.id("store-content")).sendKeys("education world");
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.close();
		
	}
		
}	
		
		
		
		
		
		


		
		
		
	
		
	
		

