package com.pages.RLL_240Testing_FirstCry_Shortlist;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver Driver= new ChromeDriver();
		Shortlist ab=new Shortlist(Driver);
		
//		ab.clickOnSearchBar();
//		ab.clickOnSearchButton();
//		ab.clickOnSearchProduct();
//		ab.clickOnShortlistOption();
//		ab.clickOnShortlistButton();
//		
//		ab.clickOnSearchBar2();
//		ab.clickOnSearchButton();
//		ab.clickOnSearchProduct();
//		ab.clickOnShortlistOption();
//		ab.clickOnShortlistButton();
		
		ab.clickOnLoginButton();
		ab.sendMobileNumber();
	}
}
