 package SeleniumDemoPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

 public class ActionsClass1 
 {
  static WebDriver driver;
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver", "D:\\Browser_Drivers\\chromedriver_win32\\chromedriver.exe");
  driver=new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("https://www.amazon.in/");

   Actions a=new Actions(driver);
   WebElement uday=driver.findElement (By.xpath("//*[@id=\"icp-nav-flyout\"]/span/span[2]"));
   
   WebElement Uday=driver.findElement(By.xpath("//*[@id=\"customer-preferences\"]/div/div/form/div[1]/div[1]/div[4]/div/label/i"));
    
    a.moveToElement(Uday).perform();
   WebElement suresh=driver.findElement(By.xpath("//*[@id=\"customer-preferences\"]/div/div/form/div[1]/div[1]/div[5]/div/label/span"));
   a.moveToElement(suresh).click().perform();

    
   
   
    
	}

}
