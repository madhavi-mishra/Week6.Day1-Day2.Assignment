package week6.day2.Assignment;

import org.testng.annotations.Test;

public class Groups2 {
	@Test(groups = "regression" , dependsOnGroups = "smoke")
	public void duplicateLead() {
		System.out.println("Duplicate Lead");
	}
	@Test(groups = "sanity")
	public void deleteLead() {
		System.out.println("Delete Lead");
	}
	@Test
	public void mergeLead() {
		System.out.println("Merge Lead");
	}
}
