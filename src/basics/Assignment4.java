package basics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		WebDriverWait w=new WebDriverWait(driver, 5);
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		String parentID=it.next();
		String childID=it.next();
		driver.switchTo().window(childID);
		System.out.println(driver.findElement(By.cssSelector("h3")).getText());
		driver.switchTo().window(parentID);
		System.out.println(driver.findElement(By.xpath("//h3[text()='Opening a new window']")).getText());
	}

}
