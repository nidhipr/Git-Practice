package com.MakemyTripApp.tests;

import java.util.concurrent.TimeUnit;


import org.testng.annotations.Test;

import com.MakemyTripApp.pageobjects.MakeMyTrip;

public class TC_MakeMyTrip extends BaseClass {

	
	@Test
	public void bookFlight() {
		try {
			driver.get(baseURL);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
			
		//Select source Flight	
			MakeMyTrip mp = new MakeMyTrip(driver);
			mp.clickFromsource();
			mp.sourceFlight(From);
			mp.selsourceFlight();
			Thread.sleep(2000);
			
			//Select calendar date
			 mp.selcal();
			 mp.dateofFlight();
			 Thread.sleep(2000);
			 
			 //click search button
			 
			mp.searchFlight();
			
			//check one stop check box
			mp.checkonestop();
			Thread.sleep(2000);
			
			//Number of flight noted
			 String count = mp.countFlight();
			 System.out.println(count);
			
			//minimum price 
			String price =mp.mincharge();
			System.out.println(price);
			
			//mp.countFlight();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
