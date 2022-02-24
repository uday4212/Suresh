package SeleniumDemoPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown1 
{
static WebDriver driver;
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver", "D:\\Browser_Drivers\\chromedriver_win32\\chromedriver.exe");
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demo.guru99.com/test/newtours/reservation.php");

driver.findElement(By.xpath("//select[@name='toPort']")).click();

WebElement Arriving = driver.findElement(By.xpath("//select[@name='toPort']"));
Select dd=new Select(Arriving);
dd.selectByVisibleText("paris");

WebElement on = driver.findElement(By.xpath("//select[@name='passCount']"));
Select dd1=new Select(on);
dd1.selectByValue("10");

WebElement Returning = driver.findElement(By.xpath("//select[@name='toMonth']"));
Select dd2=new Select(Returning);
dd2.selectByIndex(9);

WebElement From=driver.findElement(By.xpath("//select[@name='passCount']"));
Select dd3=new Select(From);
dd3.selectByVisibleText("//select[@name='passCount']");

WebElement From1=driver.findElement(By.xpath("//select[@name='fromPort']"));
Select dd4=new Select(From1);
dd4.selectByValue(null);







	}

}
