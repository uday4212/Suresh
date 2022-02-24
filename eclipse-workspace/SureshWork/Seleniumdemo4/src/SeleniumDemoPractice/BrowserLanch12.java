package SeleniumDemoPractice;

 import  org.openqa.selenium.WebDriver;
 import org.openqa.selenium.chrome.ChromeDriver;

 public class BrowserLanch12 
 {
	static WebDriver driver;
	public static void main(String[] args) 
	{
 System.setProperty("webdriver.chorme.driver","D:\\Browser_Drivers\\chromedriver_win32\\chromedriver.exe");
 driver=new ChromeDriver();
 driver.manage().window().maximize();
 driver.get("https://www.microsoft.com/en-us/microsoft-teams/group-chat-software");

	}

 }
