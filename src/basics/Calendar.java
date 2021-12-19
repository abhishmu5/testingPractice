package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		System.out.println("done");
		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_view_date1']")).click();
		System.out.println("done");
		driver.findElement(By.cssSelector("a[class='ui-state-default.ui-state-highlight']")).click();
//		System.out.println("done");
//		System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());

		
//--------------------------------------------------------------------------------------------------------------------
		//validating the element is disable or enable
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("display: block; opacity: 1;"))
		{
//			System.out.println("enable");
			Assert.assertTrue(true);
		}
		else
		{
//			System.out.println("diable");
			Assert.assertTrue(false);
		}
	}
}
