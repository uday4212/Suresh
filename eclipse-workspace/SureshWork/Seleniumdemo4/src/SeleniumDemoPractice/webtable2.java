 package SeleniumDemoPractice;

 import java.util.List;

 import org.openqa.selenium.By;
 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.WebElement;
 import org.openqa.selenium.chrome.ChromeDriver;

  public class webtable2 
  {
   static WebDriver driver;
  private static List<WebElement> table;
  public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver", "D:\\Browser_Drivers\\chromedriver_win32\\chromedriver.exe");	
  driver=new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("http://only-testing-blog.blogspot.com/2013/09/test.html");

  List<WebElement>table= driver.findElements(By.xpath("//*[@id=\"post-body-6522850981930750493\"]/div[1]/table/tbody/tr"));
  int size=table.size();
  System.out.println("total no rows are===;-"+size);

 List<WebElement>table2=driver.findElements(By.xpath("//*[@id=\"post-body-6522850981930750493\"]/div[1]/table/tbody/tr/td"));
  int size1=table2.size();
  System.out.print("total no cells are===;-"+size1);

  List<WebElement>table3=driver.findElements(By.xpath("//*[@id=\"post-body-6522850981930750493\"]/div[1]/table/tbody/tr[1]/td"));
  int size2=table3.size();
  System.out.println("total no coloums are ===;-"+size2);

  }

}
