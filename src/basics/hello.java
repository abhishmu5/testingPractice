package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("hi");
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://www.google.com");
//		System.out.println(driver.getTitle());
//		driver.get("https://www.google.com/webhp?hl=en&ictx=2&sa=X&ved=0ahUKEwisreid-KjzAhVM4zgGHbUbAj8QPQgJ");
//		driver.findElement(By.id("email")).sendKeys("abhishek is a good boy.");
//		driver.findElement(By.linkText("Forgotten password?")).click();
//		driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("abhsihek is a good boy");
//		driver.findElement(By.cssSelector("#email")).sendKeys("Abhishek");
//		driver.findElement(By.xpath("//*[@id=\"u_0_a_E5\"]/div[3]/a")).click();
//		driver.findElement(By.cssSelector("input[title='Search']")).sendKeys("abhsihek is a good boy");
//		driver.close();
//		driver.navigate().back();
		driver.get("https://www.cleartrip.com");
//		driver.findElement(By.xpath("//*[@id='root']/div/div/div[1]/div[1]/div[2]/div/div[8]/div[2]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/footer/div[3]/div/div/div[2]/div[1]/div/ul[1]/li[1]/a"))
				.click();

//		driver.findElement(By.cssSelector("button[class='px-7 bg-primary-500 hover:bg-primary-600 c-white bc-transparent c-pointer w-100p py-2 px-5 h-10 fs-4 fw-600 t-all button bs-solid tp-color td-500 bw-1 br-4 lh-solid box-border']")).click();
		driver.close();
	}

}
