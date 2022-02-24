package SeleniumDemoPractice;

 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.chrome.ChromeDriver;

 public class BrowserLauch19 
 {
 static WebDriver driver;
	public static void main(String[] args) 
	{
 System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\SeleniumDemo2\\LibDrivers\\jars\\New folder (2)\\chromedriver.exe");
 driver=new ChromeDriver();
 driver.manage().window().maximize();
 driver.get("https://www.fb.com ");
	}

 }
