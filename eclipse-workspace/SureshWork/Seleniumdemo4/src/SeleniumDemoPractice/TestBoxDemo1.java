package SeleniumDemoPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBoxDemo1 
{
static WebDriver driver;
public static void main(String[]args) 
	{
	System.setProperty("webdriver.chorme.driver","C:\\Users\\DELL\\eclipse-workspace\\SeleniumDemo2\\LibDrivers\\jars\\New folder (2)\\chromedriver.exe");
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.fb.com");

driver.findElement(By.xpath("//input[@id='email']")).sendKeys("rbgtech");
driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("rbgtech");
driver.findElement(By.xpath("//button[@name='login']")).click();

	}

}
