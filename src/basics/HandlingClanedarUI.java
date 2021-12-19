package basics;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingClanedarUI {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		WebDriverWait w=new WebDriverWait(driver, 5);
		driver.get("https://www.path2usa.com/travel-companions");
		String DateToBeSelected="23";
		String month="November 2021";
		driver.manage().window().maximize();
		driver.findElement(By.id("travel_date")).click();
		
//		for(Boolean i=false;i!=driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains(month);)
//		{
//			driver.findElement(By.cssSelector("[class='datepicker-days'] [class='next']")).click();
//			
//		}

		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains(month))
		{
			driver.findElement(By.cssSelector("[class='datepicker-days'] [class='next']")).click();
		}
		List<WebElement> dates=driver.findElements(By.className("day"));
		int count=driver.findElements(By.className("day")).size();
		for(int i=0;i<count;i++)
		{
			String text=driver.findElements(By.className("day")).get(i).getText();
			if(text.equals(DateToBeSelected))
			{
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
		}
		
		
		
	}

}
