package SeleniumDemoPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo4 
{
static WebDriver driver;
	public static void main(String[] args) 
	{
System.setProperty("webdriver.chrom.driver","C:\\Users\\DELL\\Desktop\\chromedriver.exe");
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.google.com/search?q=amazon&rlz");

driver.findElement(By.xpath("//input[@type='email']")).sendKeys("rbgtech");
driver.findElement(By.xpath("//input[@id='continue']")).click();

	}

}
