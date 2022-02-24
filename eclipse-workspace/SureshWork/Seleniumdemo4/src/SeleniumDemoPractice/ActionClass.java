package SeleniumDemoPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Browser_Drivers\\chromedriver_win32\\chromedriver.exe");	
		 WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	 driver.get("http://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		
	WebElement draggable=driver.findElement(By.xpath("//*[@id='draggable']"));
	
	WebElement dropable=driver.findElement(By.xpath("//*[@id='droppable']"));
	
	
	Actions a1=new Actions(driver);
	a1.dragAndDrop(draggable, dropable).perform();
	}
}
