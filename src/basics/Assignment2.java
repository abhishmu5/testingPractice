package basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver\\chromedriver.exe");
		// handling pop-us for asking allow notifications---copied from internet----till
		// line number 23----
		ChromeOptions op = new ChromeOptions();
		// disable notification parameter
		op.addArguments("--disable-notifications");
		// configure options parameter to Chrome driver
		WebDriver driver = new ChromeDriver(op);
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		driver.get("https://www.easemytrip.com/");
		driver.manage().window().maximize();
		// locations source to destincaiton
		driver.findElement(By.id("FromSector_show")).click();
		driver.findElement(By.id("FromSector_show")).sendKeys("BLR");
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//*[@id=\"ui-id-1\"]/li")).click();
		driver.findElement(By.cssSelector("input[id='Editbox13_show']")).click();
		driver.findElement(By.cssSelector("input[id='Editbox13_show']")).sendKeys("MAA");
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//*[@id=\"ui-id-2\"]/li[1]")).click();
		driver.findElement(By.cssSelector("li[class='active-date']")).click();
		driver.findElement(By.cssSelector("a[class='dropbtn_n9']")).click();
		Thread.sleep(2000L);
		// incrment adult to 2
		driver.findElement(By.xpath("//*[@id=\"myDropdown_n\"]/div/div[1]/div[2]/div/div[3]/input")).click();
		// increment children count to 2
		for (int i = 1; i <= 2; i++) {
			driver.findElement(By.xpath("//*[@id=\"myDropdown_n\"]/div/div[2]/div[2]/div/div[3]/input")).click();
		}
		// infants
		driver.findElement(By.xpath("//*[@id=\"myDropdown_n\"]/div/div[3]/div[2]/div/div[3]/input")).click();
		// selecting class for travelling
		driver.findElement(By.cssSelector("a[id='traveLer']")).click();
		driver.findElement(By.cssSelector("span[class='optclass-name']")).click();

		driver.findElement(By.xpath("//*[@id=\"myDropdown_n9\"]/div/label[2]")).click();
		driver.findElement(By.cssSelector("a[id='tripType']")).click();
		// click on search button
		driver.findElement(By.cssSelector("div[class='s_col_v4 ripplen']")).click();
		driver.close();
	}
}
//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[3]/div[1]/div[1]/div/div/div[1]/input")).sendKeys("Bang");
//Thread.sleep(2000L);
//List<WebElement> source= driver.findElements(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[3]/div[1]/div[1]/div/div/div[2]/ul/li"));
//for(WebElement option:source)
//{
//	System.out.println(option.getText());
//	
//	if(option.getText().equals("Bangalore, IN - Kempegowda International Airport (BLR)"))
//	{
//		Thread.sleep(1000L);
//		option.click();
//		break;
//	}
//}	
////selecting and giving value where we want to go
//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[3]/div[1]/div[5]/div/div/div[1]/input")).sendKeys("DEL");
//Thread.sleep(2000L);
//List<WebElement> destination= driver.findElements(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[3]/div[1]/div[5]/div/div/div[2]/ul/li"));
//for(WebElement option:destination)
//{
//	System.out.println(option.getText());
//	
//	if(option.getText().equals("New Delhi, IN - Indira Gandhi Airport (DEL)"))
//	{
//		Thread.sleep(1000L);
//		option.click();
//		break;
//	}
//}	
//
////--------------------------------calendar-------------------------------------------------------------------------
//driver.findElement(By.cssSelector("[class='flex flex-middle p-relative homeCalender']")).click();
//Thread.sleep(2000L);
//driver.findElement(By.cssSelector("div[class='DayPicker-Day DayPicker-Day--start DayPicker-Day--selected DayPicker-Day--today']")).click();	
//////handling dropdown for adult
//WebElement adultDropDown=driver.findElement(By.xpath("//div[@class='mb-4']/select"));
//Select adult=new Select(adultDropDown);
//adult.selectByVisibleText("2");
//////handling dropdown for children
//WebElement childrenDropDown=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[4]/div/div[3]/select"));
//Select children=new Select(childrenDropDown);
//children.selectByVisibleText("1");
//////handling dropdown for infants 
//WebElement infantDropDown=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[4]/div/div[5]/select"));
//Select infant=new Select(infantDropDown);
//infant.selectByVisibleText("1");
//////selecting class for travel
//driver.findElement(By.cssSelector("a[class='td-none hover:td-underline px-4 mt-1 weak']")).click();
//Thread.sleep(2000L);
