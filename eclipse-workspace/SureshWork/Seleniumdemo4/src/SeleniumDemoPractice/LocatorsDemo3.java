package SeleniumDemoPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo3
{
static WebDriver driver;
	public static void main(String[] args)
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\chromedriver.exe");	
driver=new ChromeDriver();
driver.manage().window().maximize();
driver. get("https://demo.guru99.com/V4/");


driver.findElement(By.xpath("//input[@type='text']")).sendKeys("rbgtech ");
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("rbgtech");
driver.findElement(By.xpath("//input[@type='submit'] ")).click();

	}

}
 