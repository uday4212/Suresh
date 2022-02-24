package SeleniumDemoPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;
import org.openqa.selenium.support.ui.Select;


public class DropDown
{

	public static void main(String[]args) 
	{
	System.setProperty("webdriver.chrome.driver","D:\\Browser_Drivers\\chromedriver_win32\\chromedriver.exe");	
	WebDriver driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://demo.guru99.com/test/newtours/reservation.php");

 // driver.findElement(By.xpath("//select[@name='toPort']")).click();  
  
   WebElement Arriving = driver.findElement(By.xpath("//select[@name='toPort']"));//reference variable
     
   Select dd=new Select(Arriving);//select class
   dd.selectByVisibleText("Paris");//selectByVisibleText()
   
 WebElement on = driver.findElement(By.xpath("//select[@name='fromMonth']"));
   Select dd1=new Select(on);
   dd1.selectByValue("10");//selectByValue()
   
   WebElement Returning = driver.findElement(By.xpath("//select[@name='toMonth']"));
   Select dd2=new Select(Returning);
   dd2.selectByIndex(9);//selectbyindex
   
   WebElement From = driver.findElement(By.xpath("//select[@name='fromPort']"));
   
  Select dd3 =new Select(From);
  dd3.selectByVisibleText("New York");
  
 dd3.selectByValue("San Francisconull");
  dd3.selectByIndex(6);
  
  WebElement Passengers=driver.findElement(By.xpath("//b[text()='Passengers:']"));
  Select dd4=new Select(Passengers);
 // dd4.selectByVisibleText("1");
  
  //dd4.selectByValue("2");
 dd4.selectByIndex(3);
  
  
  
  
	}

}
