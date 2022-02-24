package SeleniumDemoPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo1
{
static WebDriver driver;
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chorme.driver","D:\\Browser_Drivers\\chromedriver_win32\\chromedriver.exe");
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");


driver.findElement(By.xpath("//span[@id='ContentHolder_lbFeatures_TG_D']")).click();
	}

}
