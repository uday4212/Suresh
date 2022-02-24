package SeleniumDemoPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes 
{
 static WebDriver driver;


	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chorme.driver","C:\\Users\\DELL\\Desktop\\chromedriver.exe");
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("");

driver.switchTo().frame(0);
WebElement webElementtext=driver.findElement(By.xpath(""));
driver.switchTo().defaultContent();
WebElement webelementtext=driver.findElement(By.xpath(""));

  }
}


