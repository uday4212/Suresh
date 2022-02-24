 package SeleniumDemoPractice;

 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.chrome.ChromeDriver;

 public class BrowserLaunch2 
 {
	static WebDriver driver;
	public static void main(String[] args) 
	{
 System.setProperty("webdriver.chrome.driver","D:\\Browser_Drivers\\chromedriver_win32\\chromedriver.exe");
 driver=new ChromeDriver();//upcasting
 driver.manage().window().maximize();
 driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486458755421&hvpos=&hvnetw=g&hvrand=9005063197405332131&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007740&hvtargid=kwd-10573980&hydadcr=14453_2154373&gclid=Cj0KCQiA3fiPBhCCARIsAFQ8QzU71iSVISkGr1n3bZ0hz9DZwj8A__Ya9ClnrNQKDV58IwCPUFs7P40aAoeVEALw_wcB");//website
	}

 }
	