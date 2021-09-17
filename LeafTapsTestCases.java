package week6.day2.Assignment;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class LeafTapsTestCases {
	@Test
public void createLead() {
	System.out.println("Create Lead");
	//throw new NoSuchElementException();

}
	@Test(dependsOnMethods = "createLead")
public void editLead() {
	System.out.println("Edit Lead");

}
	@Test(dependsOnMethods = "editLead")
public void deleteLead() {
	System.out.println("Delete Lead");

}
	@Test(dependsOnMethods = {"deleteLead" ,"editLead"})
public void duplicateLead() {
	System.out.println("Duplicate Lead");

}
	@Test
public void mergeLead() {
	System.out.println("Merge Lead");

}
}
