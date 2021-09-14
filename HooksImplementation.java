package hooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
//////hooks implementation from steps package of src/test/java , kept for reference
public class HooksImplementation extends BaseClass {
	@Before    //Cucumber method
	public void preCondition() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps");

	}

	@After   //Cucumber method
	public void postCondition() {
		driver.close();
		

	}
}
