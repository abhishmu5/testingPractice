package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DyamicdropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//Static dropdown
//----------------------------------------------------------------------------------------------------
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		for(int i=1;i<=2;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "3 Adult");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.findElement(By.id("btnclosepaxoption")).click();
//-----------------------------------------------------------------------------------------------------------
		//dynamic dropDown
//		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
//		driver.findElement(By.xpath("//a[@value='BHO']")).click();
//		driver.findElement(By.xpath("(//a[@value='ATQ'])")).click();
//----------------------------------------------------------------------------------------------------------
		//dYNAMIC RELATIONSHIP PARENT AND CHILD
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
//		Thread.sleep(2000L);
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		//										glsctl00_mainContent_ddl_destinationStation1_CTNR
		//										glsctl00_mainContent_ddl_destinationStation1_CTNR
		
//		driver.close();

	}

}
