package SeleniumDemoPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
 
public class DropDown5 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Browser_Drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver ();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/newtours/reservation.php");
        
      WebElement ArrivingIn = driver.findElement(By.xpath("//select[@name='toPort']"));
       Select dd=new Select(ArrivingIn);
        Thread.sleep(4000);
        dd.selectByVisibleText("Paris"); 
        
        Thread.sleep(4000);
        dd.selectByIndex(5);
        
        
	}

}
