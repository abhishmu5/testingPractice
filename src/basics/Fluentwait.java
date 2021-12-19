package basics;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Fluentwait {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		WebDriverWait w=new WebDriverWait(driver, 5);
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@id='start']/button")).click();
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
		WebElement foo=wait.until(new Function<WebDriver , WebElement>() {
			public WebElement apply(WebDriver driver) {
				if(driver.findElement(By.id("finish")).isDisplayed())
				{
					return driver.findElement(By.id("finish"));
				}
				else
				{
					return null;
				}
			}
		});
		System.out.println(driver.findElement(By.xpath("//h4[text()='Hello World!']")).getText());
		System.out.println(driver.findElement(By.cssSelector("[id='finish'] h4")).isDisplayed());

		//		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
//		     public WebElement apply(WebDriver driver) {
//		       return driver.findElement(By.id("foo"));
//		     }

	}
}
