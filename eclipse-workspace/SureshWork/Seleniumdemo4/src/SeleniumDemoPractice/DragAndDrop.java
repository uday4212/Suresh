package SeleniumDemoPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop 
{
static WebDriver driver;
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Browser_Drivers\\chromedriver_win32\\chromedriver.exe");
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://jqueryui.com/droppable/");

driver.switchTo().frame(0);
WebElement Dragme=driver.findElement(By.xpath("//*[@id=\'draggable\']/p"));
WebElement Dropped=driver.findElement(By.xpath("//*[@id=\'droppable\']/p"));

Actions actions =new Actions(driver);
actions.dragAndDrop(Dragme, Dropped).perform();
	}

}
