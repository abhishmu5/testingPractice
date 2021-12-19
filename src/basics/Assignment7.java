package basics;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Assignment7 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		WebDriverWait w=new WebDriverWait(driver, 5);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		System.out.println(driver.findElements(By.xpath("//table[@name='courses']/tbody/tr")).size());
		System.out.println(driver.findElements(By.xpath("//table[@name='courses']/tbody/tr/th")).size());
		List<WebElement> rowtext=driver.findElements(By.xpath("//table[@name='courses']/tbody/tr[3]/td"));
		for(int i=0;i<rowtext.size();i++)
		{
			System.out.println(rowtext.get(i).getText());
		}
	}

}
