package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class C_Selenium {
	@Test
	public void Run() {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://makymytrip.com");
		
		if(driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[1]/a/picture/img")).isDisplayed()) {
			System.out.println("Logo is displayed");
		}
		else {
			System.out.println("Logo is not displayed");
		}
	}

}
