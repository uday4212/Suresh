package SeleniumDemoPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
static WebDriver driver;
	public static void main(String[] args)
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\chromedriver.exe");
		driver=new ChromeDriver();//upcasting
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");//website
		
		

	}

}
