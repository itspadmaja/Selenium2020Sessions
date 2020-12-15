package testNGConcept;

import org.testng.annotations.Test;

public class PriorityTestCases {
	
	@Test(priority = 1)
	public void atest() {
		System.out.println("a test");
	}
	@Test
	public void btest() {
		System.out.println("b test");
	}
	@Test(priority = 3)
	public void ctest() {
		System.out.println("c test");
	}
	@Test
	public void dtest() {
		System.out.println("d test");
	}
	@Test(priority = 5)
	public void etest() {
		System.out.println("e test");
	}

}
