package basics;
// STATIC DROPDOWN/ DROPDOWN HAVING SELECT TAG
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		//get the webelement
		WebElement staticDropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropDown=new Select(staticDropdown);
		dropDown.selectByIndex(3);
		//to get the option we have selected at dropdown
		System.out.println(dropDown.getFirstSelectedOption().getText());
		dropDown.selectByVisibleText("INR");
		System.out.println(dropDown.getFirstSelectedOption().getText());
		driver.close();

	}

}
