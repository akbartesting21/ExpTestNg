package com.ejju.ExpTestNG;

import org.testng.annotations.Test;

public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
	
	
	@Test
		public void hi()
	{
		
		System.out.println("hi");
		System.out.println("\\hi");
		
		
	}
	
	@Test(enabled = true)
	public void hello() {
		
		System.out.println("hello1");
		
	}
	
	@Test(dependsOnMethods = "hi")
	public void hello2() {
		
		System.out.println("hello2");
		
		
	}
}
