package com.TestNgChallenges;

import org.testng.annotations.Test;

public class EnableTrueFalse {
	@Test(enabled = true)
	public void GetMethod1() {
		System.out.println("GetMethod1");
			}
	@Test(enabled = true)
	public void GetMethod2() {
		System.out.println("GetMethod2");
			}
	@Test(enabled = false)
	public void GetMethod3() {
		System.out.println("GetMethod3");
			}
	@Test(enabled = true)
	public void GetMethod4() {
		System.out.println("GetMethod4");
			}
	@Test(enabled = false)
	public void GetMethod0() {
		System.out.println("GetMethod5");
			}
}


