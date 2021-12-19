package basics;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ImplicitExpicitWaits {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String[] name = { "Brocolli", "Cucumber", "Beetroot" };
		WebDriverWait w=new WebDriverWait(driver, 5);
		
		addItems(driver, name,w);
	}

	public static void addItems(WebDriver driver, String[] name, WebDriverWait w) throws InterruptedException {
		
		driver.manage().window().maximize();
		List l1 = Arrays.asList(name);
		List<WebElement> products = driver.findElements(By.cssSelector("h4[class='product-name']"));
		for (int i = 0; i < products.size(); i++) {

			String[] productName = products.get(i).getText().split("-");
			// Now we have "brocoli " at productnme[0] and productnme[1] " 1kg"
			String trimedName = productName[0].trim();

			if (l1.contains(trimedName)) {
//				Thread.sleep(2000L);
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				System.out.println(trimedName);
			}
		}
		// Now, clicking on cart icon
		driver.findElement(By.cssSelector("a[class='cart-icon']")).click();
		// click on proceed to check out
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		// apply cupon code
//		driver.findElement(By.cssSelector("[class='promoCode']")).click();
		driver.findElement(By.cssSelector("[class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("[class='promoBtn']")).click();
		// validate if cuopon is applied or not
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		
		String s = driver.findElement(By.cssSelector("span.promoInfo")).getText();
		Assert.assertEquals(s, "Code applied ..!");

	}
}
