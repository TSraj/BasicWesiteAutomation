package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

import basePackage.DriverSetup;

public class TC_001_LocatorLearning extends DriverSetup {

//	public static String baseUrl = "https://rahulshettyacademy.com/";
	public static String baseUrl = "https://sso.teachable.com/secure/9521/identity/login/password?wizard_id=csGvtWOH_lzRp5JDr4y4VrrjMUzyCguuVtVpxIofnaNOVIdW4uqUHsjNPWoqruM_LL8yfGBkl5jyJiolWWWcxQ";

	@Test
	public static void locateElement() throws InterruptedException {
		driver.get(baseUrl);
		new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.manage().window().maximize();
		Thread.sleep(3000);

		driver.findElement(By.id("email")).sendKeys("raj");
		Thread.sleep(3000);

		driver.findElement(By.id("password")).sendKeys("tanvir");
		Thread.sleep(3000);

		driver.findElement(By.name("commit")).click();
		Thread.sleep(3000);
	}
}
