package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AcitonsMouseInteraction {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		WebDriverWait w=new WebDriverWait(driver, 5);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Actions ac=new Actions(driver);
		//move to a specific element
		WebElement move=driver.findElement(By.id("nav-link-accountList"));
				ac.moveToElement(move).build().perform();
				ac.moveToElement(move).contextClick().build().perform();
		//give a input in capital letter
		driver.findElement(By.id("twotabsearchtextbox")).click();
		ac.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		driver.close();
	}

}
