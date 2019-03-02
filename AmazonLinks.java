package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "c://driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.get("http://www.amazon.in");
		System.out.println(driver.findElements(By.tagName("a")).size());
		String sur = driver.getPageSource();
		System.out.println(sur);

	}

}
