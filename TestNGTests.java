package week6.day2.Assignment;

import org.testng.annotations.Test;

public class TestNGTests {
	                   //packagename.ClassName.methodName
	@Test(dependsOnMethods= "week6.day2.Assignment.LeafTapsTestCases.createLead")				
public void dupicateLead() {
	System.out.println("Duplicate Lead");
}
}
