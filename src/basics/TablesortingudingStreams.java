package basics;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class TablesortingudingStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		WebDriverWait w=new WebDriverWait(driver, 5);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
//		driver.findElement(By.xpath("//span[text()='Veg/fruit name']")).click();
//		List<WebElement> offerProduct=driver.findElements(By.xpath("//tr/td[1]"));
//		List<String> orignalList=offerProduct.stream().map(s->s.getText()).collect(Collectors.toList());
//		List<String> sortedList=orignalList.stream().sorted().collect(Collectors.toList());
//		Assert.assertTrue(orignalList.equals(sortedList));
		List<String> price;
		//get price of speicifc product
		do
		{
			List<WebElement> rows=driver.findElements(By.xpath("//tr/td[1]"));
			price= rows.stream().filter(s->s.getText().contains("Beans")).map(s->getveggiePice(s)).collect(Collectors.toList());
			price.forEach(a->System.out.println(a));
			if(price.size()<1)
			{
				driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
			}
		}
		while(price.size()<1);
		

	}
	private static String getveggiePice(WebElement s)
	{
		String price=s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return price;
	}
}
