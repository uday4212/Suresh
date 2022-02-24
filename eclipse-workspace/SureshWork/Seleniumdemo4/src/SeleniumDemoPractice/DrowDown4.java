package SeleniumDemoPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DrowDown4 
{


	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "D:\\Browser_Drivers\\chromedriver_win32\\chromedriver.exe");	
 WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demo.guru99.com/test/newtours/reservation.php");

// WebElement ArrivingIn=driver.findElement(By.xpath("//select[@name='toPort']"));
 //Select dd=new Select(ArrivingIn);
//Thread.sleep(4000);
//dd.selectByVisibleText("Paris");
//   Thread.sleep(4000);
// dd.selectByIndex(5);
// Thread.sleep(4000);
// dd.selectByValue("Zurich");
 

//  dd.selectByVisibleText("Zurich");
//  Thread.sleep(5000);
//   dd.selectByIndex(2);
//   Thread.sleep(5000);
//   dd.selectByValue("Paris");
   
//WebElement Returning=driver.findElement(By.xpath("//select[@name='toMonth']"));
//  Select dd=new Select(Returning);
//  Thread.sleep(6000);
//   dd.selectByVisibleText("January");
//   Thread.sleep(6000);
//   dd.selectByIndex(1);
//   Thread.sleep(6000);
//   dd.selectByValue("march");
//   
   
       WebElement ArrivingIn=driver.findElement(By.xpath("//select[@name='toPort']")); 
       Select dd=new Select(ArrivingIn);
       Thread.sleep(4000);
       dd.selectByVisibleText("Portland");
       Thread.sleep(4000);
       dd.selectByIndex(4);
       Thread.sleep(4000);
       dd.selectByValue("Paris");


	}

}
