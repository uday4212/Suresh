package SeleniumDemoPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

 public class txt 
 {
 static WebDriver driver;
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\chromedriver.exe");
 driver=new ChromeDriver();
 driver.manage().window().maximize();
 driver.get("");

 Actions actons=new Actions(driver);
 WebElement ac=driver.findElement(By.xpath(""));

 Actions actions=new Actions(driver);
 WebElement Element=driver.findElement(By.xpath(""));
 actions.moveToElement(Element).perform();

 Actions actions1=new Actions(driver);
 WebElement rc=driver.findElement(By.xpath("//[@id=nav-xshop]/a[1]"));
 actions1.contextClick(rc).perform();

 Actions actions2=new Actions (driver);
 WebElement ddc=driver.findElement(By.xpath(""));
 ddc.sendKeys("rbgtech");
 actions2.doubleClick(ddc).perform();

	}
 	
 }






