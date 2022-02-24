package SeleniumDemoPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo2 
{
static WebDriver driver;
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrom.driver","C:\\Users\\DELL\\Desktop\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	
	
	driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("rbgtech");
	driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("rbgtech");
	driver.findElement(By.xpath("//input[@name='Submit']")).click();
	
	}

}
