package basics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		WebDriverWait w=new WebDriverWait(driver, 5);
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.manage().window().maximize();
		driver.findElement(By.className("blinkingText")).click();
		//to know the number of windows just save all the windows id to a set of string 
		Set<String> windows=driver.getWindowHandles();
		//to iterate over set of strings create a iterator of string
		Iterator<String> it=windows.iterator();
		String parentId=it.next();
		String childID=it.next();
		driver.switchTo().window(childID);
		String emailID=driver.findElement(By.cssSelector("[class='im-para red']")).getText().split("at")[1].trim().split(" ")[0];
		driver.switchTo().window(parentId);
		driver.findElement(By.id("username")).sendKeys(emailID);
		
	}

}
