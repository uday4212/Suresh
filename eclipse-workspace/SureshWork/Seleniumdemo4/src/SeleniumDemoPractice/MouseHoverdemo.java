package SeleniumDemoPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverdemo 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Browser_Drivers\\chromedriver_win32\\chromedriver.exe");
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.amazon.in/");
            
            
          WebElement account= driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
           Thread.sleep(3000);
          Actions a=new Actions(driver);
          a.moveToElement(account).perform();
          
	}

}
