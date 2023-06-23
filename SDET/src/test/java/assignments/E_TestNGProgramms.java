package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class E_TestNGProgramms {
	public WebDriver driver;
	@BeforeMethod
	public void SetUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	@Test
	public void GoogleTest() {
		driver.get("https://google.com");
		if(driver.getTitle()=="Google") {
			System.out.println("Test is passed");
		}
	}
	@Test
	public void FaceBookTest() {
		driver.get("https://facebook.com");
		if(driver.getTitle()=="Facebook - log in or sign up") {
			System.out.println("Test is passed");
		}
	}
	@Test
	public void YoutubeTest() {
		driver.get("https://youtube.com");
		if(driver.getTitle()=="YouTube")
			System.out.println("Test is passed");
	}
}
