package SeleniumDemoPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo1 
{
static WebDriver driver;
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\chromedriver.exe");
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.fb.com");


driver.findElement(By.xpath("//input[@id='email']")).sendKeys("rbgtech");
driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("rbgtechs");
driver.findElement(By.xpath("//button[@name='login']")).click();

//driver.findElement(By.xpath("")).sendKeys("");          type---textbox
//driver.findElement(By.xpath("")).click();              click ----button
	}

}
