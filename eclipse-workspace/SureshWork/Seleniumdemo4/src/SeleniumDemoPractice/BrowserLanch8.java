package SeleniumDemoPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 public class BrowserLanch8 
{
  static WebDriver driver;
 public static void main(String[] args) 
 {
 System.setProperty("webdriver.chrome.driver","D:\\Browser_Drivers\\chromedriver_win32\\chromedriver.exe");
 driver=new ChromeDriver();//upcasting
 driver.manage().window().maximize();
 driver.get("https://play.google.com/store?utm_source");//website

	}

 }
