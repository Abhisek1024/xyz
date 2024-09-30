package com.stepdefination.RLL_240Testinh_FirstCry_Shortlist;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.RLL_240Testing_FirstCry_Shortlist.Shortlist;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
/*******************************************
Project Name:
Module Name:
Script Name : 
Author:
Date of Creation:
Script Description:

********************************************/




public class StepDefination_homePage 
{
	WebDriver driver=new ChromeDriver();
	Shortlist ab=new Shortlist(driver);

	@Given("The user is in the firstcry home page")
	public void the_user_is_in_the_firstcry_home_page() {
	   ab.clickOnSearchBar();
	}

	@When("The user clicks on login")
	public void the_user_clicks_on_login() {
	}

	@And("The user enters the mobile number")
	public void the_user_enters_the_mobile_number() {
	    
	}

	@Then("click on continue")
	public void click_on_continue() {
	    
	}

	@And("The user enters the provided otp")
	public void the_user_enters_the_provided_otp() {
	    
	}

	@And("The user click on submit")
	public void the_user_click_on_submit() {
	    
	}

	@Then("The user must able to login")
	public void the_user_must_able_to_login() {
	   
	}
	//@access_shortlist_01
	@Given("The user in the firstcry home page")
	public void the_user_in_the_firstcry_home_page() {
	   
	}

	@When("The user search for a shirt")
	public void the_user_search_for_a_shirt() {
		ab.clickOnSearchBar();
	}

	@And("click the product")
	public void click_the_product() {
	    ab.clickOnSearchButton();
	    ab.clickOnSearchProduct();
	}

	@And("The user click the product for shortlisting")
	public void the_user_click_the_product_for_shortlisting() throws InterruptedException {
	    ab.clickOnShortlistOption();
	}

	@Then("The user is able to shortlist the shirt")
	public void the_user_is_able_to_shortlist_the_shirt() {
	   
	}
	//@access_shortlist_02
	@Given("user in the firstcry home page")
	public void user_in_the_firstcry_home_page() {
	    
	}

	@When("The user search for a footwear")
	public void the_user_search_for_a_footwear() {
	    ab.clickOnSearchBar2();
	}
	
	@And("click on the product")
	public void click_on_the_product() {
	   ab.clickOnSearchButton();
	   ab.clickOnSearchProduct2();
	}
	
	@And("user click the product for shortlisting")
	public void user_click_the_product_for_shortlisting() throws InterruptedException {
	    ab.clickOnShortlistOption();
	}

	@Then("The user is able to shortlist the footwear")
	public void the_user_is_able_to_shortlist_the_footwear() {
	   
	}
	 //@Check_item
	@Given("user is in the firstcry home page")
	public void user_is_in_the_firstcry_home_page() throws InterruptedException {
	   ab.clickOnLoginButton();
	   ab.sendMobileNumber();
	   ab.clickOnContinueButton();
	   ab.clickOnSubmitButton();
	}

	@When("The user click on the Shortlist button")
	public void the_user_click_on_the_shortlist_button() {
	   ab.clickOnShortlistButton();
		 //Assert.assertTrue(driver.getTitle().contains("            My Shortlist"));

	}

	@Then("The user is able to see the shortlisted products")
	public void the_user_is_able_to_see_the_shortlisted_products() {
	}
}
	 