package week6.day2.Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGAssertion {
	@Test
	public void login() {
		String expTitle = "Leaftaps - TestLeaf Automation Platform";
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
	    
		String actTitle = driver.getTitle();
//		if (expTitle.equals(actTitle)) {
//			System.out.println("Title is Matching");
//		} else {
//			System.out.println("Title is not Matching");
//		}
		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		//HardAssert
	    //Assert.assertTrue(displayed);
		//Assert.assertFalse(displayed);
		//Assert.assertEquals(actTitle, expTitle);
		
		/////create object for SoftAssert
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(actTitle, expTitle);
		System.out.println("End Of Program");
		//Mandatory For Soft Assert
		softAssert.assertAll();
	}

}
