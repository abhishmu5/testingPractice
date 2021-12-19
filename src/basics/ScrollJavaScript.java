package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class ScrollJavaScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		WebDriverWait w=new WebDriverWait(driver, 5);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,650)");
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=500");
		List<WebElement>amount= driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum=0;
		for(int i=0;i<amount.size();i++)
		{
			int currentAmount=Integer.parseInt(amount.get(i).getText()); 
			sum=sum+currentAmount;
		}
		System.out.println(sum);
		String s=(driver.findElement(By.cssSelector(".totalAmount")).getText());
		int ans=Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		Assert.assertEquals(sum, ans);
//		String[] arr=s.split(":");
//		String ans=arr[1];
//		System.out.println(ans.trim());
		driver.quit();
	}

}
