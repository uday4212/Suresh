package SeleniumDemoPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe1 
{
static WebDriver driver;
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver","D:\\Browser_Drivers\\chromedriver_win32\\chromedriver.exe");	
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("");

driver.switchTo().frame(0);
WebElement webelement=driver.findElement(By.xpath(""));
driver.switchTo().defaultContent();
WebElement webElement=driver.findElement(By.xpath(""));
	}

}

