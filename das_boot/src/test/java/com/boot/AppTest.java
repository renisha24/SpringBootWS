package com.boot;

import static org.junit.Assert.*;

import org.junit.Test;

import com.boot.controller.HomeController;

public class AppTest 
{
	@Test
    public void testApp()
    {
		HomeController hc=new HomeController();
		String result=hc.home();
		assertEquals(result,"Renishas Spring boot returning to duty");
	
    }
}
