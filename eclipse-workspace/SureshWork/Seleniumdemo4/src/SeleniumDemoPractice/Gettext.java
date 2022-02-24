package SeleniumDemoPractice;

import java.sql.DriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettext 
{

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver","D:\\Browser_Drivers\\chromedriver_win32\\chromedriver.exe")	;
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
   driver.get("https://www.facebook.com/");
   
   driver.findElement(By.xpath("//input[@type='text']")).sendKeys("rbgtech");
   driver.findElement(By.xpath("//input[@type='password']")).sendKeys("rbgtech");
   driver.findElement(By.xpath("//button[@name='login']")).click();
   
	}
	
}