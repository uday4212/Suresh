package SeleniumDemoPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass3 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Browser_Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.amazon.in/gp/customer-preferences/select-language/ref=topnav_lang?ie=UTF8&preferencesReturnUrl=%2F");
      Actions a1=new Actions(driver);
      driver.findElement(By.xpath("//*[@id=\"customer-preferences\"]/div/div/form/div[1]/div[1]/div[2]/div/label/i")).click();
      WebElement rbg=driver.findElement(By.xpath("//*[@id=\"icp-nav-flyout\"]/span"));
      Thread.sleep(5000);
      a1.moveToElement(rbg).perform();

     WebElement rbg1=driver.findElement(By.xpath("//*[@id=\"customer-preferences\"]/div/div/form/div[1]/div[1]/div[4]/div/label/span"));
     Thread.sleep(5000);
     a1.moveToElement(rbg1).perform();

    WebElement rbg2=driver.findElement(By.xpath("//*[@id=\"customer-preferences\"]/div/div/form/div[1]/div[1]/div[5]/div/label/span"));
    Thread.sleep(5000) ;
    a1.moveToElement(rbg2).perform();
	
	WebElement rbg3=driver.findElement(By.xpath("//*[@id=\"customer-preferences\"]/div/div/form/div[1]/div[1]/div[6]/div/label/span"));
    Thread.sleep(5000);
	a1.moveToElement(rbg3).perform();
	
	WebElement rbg4=driver.findElement(By.xpath("//*[@id=\"customer-preferences\"]/div/div/form/div[1]/div[1]/div[7]/div/label/span"));
	Thread.sleep(5000);
	a1.moveToElement(rbg4).perform();
	
	WebElement rbg5=driver.findElement(By.xpath("//*[@id=\"customer-preferences\"]/div/div/form/div[1]/div[1]/div[8]/div/label/span"));
	Thread.sleep(3000);
	a1.moveToElement(rbg5).perform();
	
	WebElement rbg6=driver.findElement(By.xpath("//*[@id=\"customer-preferences\"]/div/div/form/div[1]/div[1]/div[3]/div/label/span"));
	Thread.sleep(2000);
	a1.moveToElement(rbg6).perform();
	
	
	}
}








