package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class F_W3schools {
	@Test
	public void Run() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com");
		WebElement logo = driver.findElement(By.xpath("//*[@id=\"pagetop\"]a[1]/i"));
		if(logo.isDisplayed())
			System.out.println("Logo is displayed");
		else
			System.out.println("Logo is not displaying");
	}

}
