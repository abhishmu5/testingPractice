package basics;
//Assert methods are used in this class
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
public class AutoSuggetiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
//----------------------------------------------------------------------------------------------------------------------------
		//autosugestive dropdown
//		driver.findElement(By.id("autosuggest")).sendKeys("ind");
//		Thread.sleep(2000L);
//		 List<WebElement> options= driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
//		 for(WebElement option:options)
//		 {
//			 if(option.getText().equalsIgnoreCase("india"))
//			 {
//				 option.click();
//				 break;
//			 }
//		 }
//		 
//-------------------------------------------------------------------------------------------------------------------------------
		//check boxes
//		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		 driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
//		 System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		 Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		//count the numer of checkboxes
		 
		 System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	}

}
