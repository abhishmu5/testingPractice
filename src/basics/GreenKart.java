package basics;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenKart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		String[] name= {"Brocolli","Cucumber","Beetroot"};
		List l1=Arrays.asList(name);
		List<WebElement> products=driver.findElements(By.cssSelector("h4[class='product-name']"));
		for(int i=0;i<products.size();i++)
		{
			
			String[] productName=products.get(i).getText().split("-");
			//Now we have "brocoli " at productnme[0] and productnme[1] " 1kg"
			String trimedName=productName[0].trim();
			
			if(l1.contains(trimedName))
			{
//				Thread.sleep(2000L);
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				System.out.println(trimedName);
			}
		}
		Thread.sleep(5000L);
	}

}
