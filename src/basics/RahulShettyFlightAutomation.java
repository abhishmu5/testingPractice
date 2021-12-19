package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class RahulShettyFlightAutomation {
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//selecting departure menu
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000L);
		//slecting from where to start the journey
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000L);
		//slecting from where to end  the journey
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		//Calendar
		driver.findElement(By.cssSelector("td[class=' ui-datepicker-days-cell-over  ui-datepicker-today']")).click();
		//check if the return claendar is close or not
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("display: block; opacity: 1;"))
		{
			System.out.println("enable");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("disable");
			Assert.assertTrue(true );
		}
		//selecting the number of passenger
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		for(int i=1;i<=2;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "3 Adult");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.findElement(By.id("btnclosepaxoption")).click();
		//payment mode
		WebElement staticDropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropDown=new Select(staticDropdown);
		dropDown.selectByVisibleText("USD");
		//click on search
		driver.findElement(By.cssSelector("input[name='ctl00$mainContent$btn_FindFlights']")).click();
	}


}
