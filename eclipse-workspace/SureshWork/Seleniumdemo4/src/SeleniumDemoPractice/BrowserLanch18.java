package SeleniumDemoPractice;

 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.chrome.ChromeDriver;

 public class BrowserLanch18 
 {
  static WebDriver driver;
  public static void main(String[] args) 
	{
 System.setProperty("webdriver.chorm.drivers","D:\\Browser_Drivers\\chromedriver_win32\\chromedriver.exe");
 driver=new ChromeDriver();
 driver.get("https://rbgtechnologies.com/");
	}

 }
