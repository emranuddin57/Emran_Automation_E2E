package com.TestNgChallenges;

import org.testng.annotations.Test;

public class PriorityTest {
	@Test(priority = 2)
	public void GetMethod1() {
		System.out.println("GetMethod1");
			}
	@Test(priority = 4)
	public void GetMethod2() {
		System.out.println("GetMethod2");
			}
	@Test(priority = 3)
	public void GetMethod3() {
		System.out.println("GetMethod3");
			}
	@Test(priority = 1)
	public void GetMethod4() {
		System.out.println("GetMethod4");
			}
	@Test(priority = 0)
	public void GetMethod0() {
		System.out.println("GetMethod5");
			}
}
