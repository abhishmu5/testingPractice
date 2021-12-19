package basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		WebDriverWait w=new WebDriverWait(driver, 5);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		//checkbox
		driver.findElement(By.id("checkBoxOption2")).click();
		String option=driver.findElement(By.xpath("//*[@id=\"checkbox-example\"]/fieldset/label[2]")).getText();
		System.out.println(option);
		
		//dropdown
		WebElement staticdropdown=driver.findElement(By.id("dropdown-class-example"));
		Select dropdown= new Select(staticdropdown);
		dropdown.selectByVisibleText(option);
		driver.findElement(By.id("name")).sendKeys(option);
		driver.findElement(By.id("alertbtn")).click();
		String text=driver.switchTo().alert().getText();
		if(text.contains(text))
		{
			System.out.println(option+" is present");
		}
		else {
			System.out.println(option+" is not present");
		}
		driver.switchTo().alert().dismiss();
		

	}

}
