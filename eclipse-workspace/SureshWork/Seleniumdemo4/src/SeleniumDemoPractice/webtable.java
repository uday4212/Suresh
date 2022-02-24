package SeleniumDemoPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable 
{
static WebDriver driver;

	public static <webElement> void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\chromedriver.exe");
	driver=new ChromeDriver();
  driver.manage().window().maximize();
 driver.get("http://only-testing-blog.blogspot.com/2013/09/test.html");


//List<webElement> r1= driver.findElements(By.xpath("//*[@id=/"post-body-6522850981930750493"]/div[1]/table/tbody/tr"));
//intsize=table1.size();
// System.out.println("total no rows are===:-"+size);
//
// List<webElement> table2=driver.findElements(By.xpath("//div[1]/table/tbody/tr/td"));
// System.out.println("total no cells are===:-size1");
//
// List<webElement> table3 =driver.findElements(By.xpath(""));
// intsize2=table3.size();
// System.out.println("total no coloums are===:-"size2);
//
// webElement table=driver.findElement(By.xpath(""));
// String et="11";
// webElement table11=table;//table=gettext;
// String at=tablel.gettext();
//

	}
 }







	


