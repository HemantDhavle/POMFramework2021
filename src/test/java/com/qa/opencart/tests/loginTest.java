package com.qa.opencart.tests;

import org.testng.annotations.Test;

public class loginTest extends baseTest 
{
	@Test
	public void dologinTest()
	{
		lp.doLogin("hemant");
	}

}
