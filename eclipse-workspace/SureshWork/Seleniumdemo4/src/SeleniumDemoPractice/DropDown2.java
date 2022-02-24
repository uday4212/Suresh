package SeleniumDemoPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown2 
{
 public static WebDriver driver;
    //static select sel=new select(null);
	public static void main(String[] args)
	{
		DropDown2 d=new DropDown2();
      d.url();
      d.FindonDropDown();
      d.findArrivingDropDown();
      d.findReturnDropDown();
      d.selectingon();
      d.on();
      d.selectingarrive();
      d.arrive();
	
	}
	public void browserSetup()
	{
	System.setProperty("webdriver.chrome.driver", "D:\\Browser_Drivers\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	
   }
	public void url()
	{
		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
    }
	public WebElement FindonDropDown()
	{
		WebElement on= driver.findElement(By.xpath("//select[@name='fromMonth']"));
		return on;
		
	}
   public WebElement findArrivingDropDown()	
   {
	   WebElement arr=driver.findElement(By.xpath("//select[@name='toMonth']"));
	   return arr;
   }
	public WebElement findReturnDropDown()	
	{
		WebElement retn=driver.findElement(By.xpath("//select[@name='toMonth']"));
		return retn;
	}
	public Select selectingon()
	{
		Select on =new Select(FindonDropDown());
		return on;
	}
	public Select selectingarrive()
	{
	Select arr=new Select(findArrivingDropDown());	
	return arr;
	}
	public void arrive()
	{
		Select ar =selectingarrive();
		ar.selectByValue("London");
	}
	public void on()
	{
		Select a= selectingon();
		a.selectByVisibleText("10");
	}
	
}
	
	
	
	
	
	


