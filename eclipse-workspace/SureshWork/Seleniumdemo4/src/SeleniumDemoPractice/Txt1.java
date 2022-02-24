package SeleniumDemoPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Txt1 
{
static ChromeDriver driver;

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver", "D:\\Browser_Drivers\\chromedriver_win32\\chromedriver.exe");	
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("");

Actions actions=new Actions (driver);
WebElement ac=driver.findElement(By.xpath(""));

Actions actions1=new Actions(driver);
WebElement Element=driver.findElement(By.xpath(""));
actions.moveToElement(Element).perform();

Actions actions11=new Actions(driver);
WebElement rc=driver.findElement(By.xpath(""));
actions1.contextClick(rc).perform();

Actions action2=new Actions(driver);
WebElement ddc=driver.findElement(By.xpath(""));
ddc.sendKeys("");

action2.doubleClick(ddc).perform();

	}

}
