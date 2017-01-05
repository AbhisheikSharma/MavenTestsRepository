package com.Abhisheik.TestNGRevision;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotationsTest {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Inside Before Suite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("Inside after suite");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Inside Before Test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("Inside After Test");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Inside before class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("Inside after class");
	}

/*	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Inside before method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Inside After method");
	} */

	@Test(groups={"odd","NotDivisible"},priority=6,dependsOnMethods={"test3"})
	public void test1() {
		System.out.println("Test 1");
	}

	@Test(groups={"even","Divisible"})
	public void test2() {
		System.out.println("Inside test 2");
	}
	@Test(groups={"odd","NotDivisible"})
	public void test3() {
		System.out.println("Test 3");
	}
	@Test(groups={"even","Divisible"})
	public void test4() {
		System.out.println("Test 4");
	}
	@Test(groups={"odd","NotDivisible"})
	public void test5() {
		System.out.println("Test 5");
	}
	@Test(groups={"even","Divisible"})
	public void test6() {
		System.out.println("Test 6");
	}
}
