package week6.day2.Assignment;

import org.testng.annotations.Test;

public class Groups1 {
	@Test(groups = {"functional", "smoke"})
public void createLead() {
	System.out.println("Create Lead");
}
	@Test(groups = "functional")
	public void editLead() {
		System.out.println("Edit Lead");
	}
	
}
