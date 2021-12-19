package basics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Exercise {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		WebDriverWait w=new WebDriverWait(driver, 5);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
//		driver.findElements(By.cssSelector("a")).size();
		System.out.println(driver.findElements(By.cssSelector("a")).size());
		WebElement footerID=driver.findElement(By.id("gf-BIG"));
		System.out.println(footerID.findElements(By.tagName("a")).size());
//		System.out.println(driver.findElements(By.cssSelector("div[id='gf-BIG'] a")).size());
		WebElement coloumn1=footerID.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(coloumn1.findElements(By.tagName("a")).size());
		for(int i=1;i<coloumn1.findElements(By.tagName("a")).size();i++)
		{
//			String clickOnLinkKeys=Keys.chord(Keys.CONTROL,Keys.ENTER);
			coloumn1.findElements(By.tagName("a")).get(i).sendKeys(Keys.CONTROL,Keys.ENTER);
		}
		 Set<String> window=driver.getWindowHandles();
		 Iterator<String> it=window.iterator();
		 while(it.hasNext())
		 {
			 driver.switchTo().window(it.next());
			 System.out.println(driver.getTitle());
		 }
	}
}
