package SeleniumDemoPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton 
{
static WebDriver driver;
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chorme.driver","C:\\Users\\DELL\\eclipse-workspace\\SeleniumDemo2\\LibDrivers\\jars\\New folder (2)\\chromedriver.exe");
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demo.guru99.com/test/newtours/reservation.php");


driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[2]")).click();

	}

}
