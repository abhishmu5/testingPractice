package basics;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Assignment8 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		WebDriverWait w=new WebDriverWait(driver, 5);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		String country="India";
		driver.findElement(By.id("autocomplete")).sendKeys("IND");
		Thread.sleep(1000L);
		List<WebElement> options=driver.findElements(By.className("ui-menu-item"));
		Thread.sleep(1000L);
		Thread.sleep(1000L);

		for(int i=0;i<options.size();i++)
		{
			driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
			String name=driver.findElements(By.cssSelector(".ui-menu-item")).get(i).getText();
			if(country.equalsIgnoreCase(name))
			{
				if(driver.findElement(By.id("autocomplete")).getAttribute("value").equalsIgnoreCase(name))
				{
					System.out.println(name+" is same as "+driver.findElement(By.id("autocomplete")).getAttribute("value")+" selected");
				}
				break;		
			}
		}
	}
}
