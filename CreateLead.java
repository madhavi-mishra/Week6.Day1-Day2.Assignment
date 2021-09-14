package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLead extends BaseClass {
	@Then("Homepage should be displayed")
	public void verifyHomepage() {
		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		if (displayed) {
			System.out.println("The Home page is displayed");
		} else
			System.out.println("The Home page is not displayed");

	}
	@When("Click on {string} link")
	public void clickLink(String link){
		driver.findElement(By.linkText(link)).click();
		}
	@Then("{string} Page should be displayed")
	public void verifyPage(String pageName) {              
		 boolean displayed = driver.findElement(By.xpath("//div[text()='"+pageName+"']")).isDisplayed();
		 if (displayed) {
				System.out.println(pageName+" is Displayed");
			} else
				System.out.println(pageName+" is not displayed");
				

		}

}
