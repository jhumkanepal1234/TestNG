package com.class01;

import org.testng.annotations.Test;

public class Task2 {
//	1. Create three test case with unique @test methods names.
//	2. Execute the test case
//	3. Post a screenshot of your report
	
	
	@Test
	public void beforeTest() {
		System.out.println("beforeTest");
	}
	
	@Test
	public void test() {
		System.out.println("test");
	}
	
	@Test
	public void afterTest() {
		System.out.println("afterTest");
	}

}
