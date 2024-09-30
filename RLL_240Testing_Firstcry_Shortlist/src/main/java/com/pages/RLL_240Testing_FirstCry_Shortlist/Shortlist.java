package com.pages.RLL_240Testing_FirstCry_Shortlist;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Shortlist 
{
	WebDriver driver;
	//This is a page constructor
	public Shortlist(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Locators
		
	By login=By.xpath("//span[text()=\"Login /\"]");
	By search_bar=By.xpath("//*[@id=\"search_box\"]");
	By search_button=By.xpath("//*[@class='search-button']");
	By search_product=By.xpath("//img[@title=\"Babyhug Disney  Single Jersey Knit Full Sleeves Shirt With Winnie & Friends Print & Pocket Detailing - White\"]");
	By search_product2=By.xpath("//img[@src='//cdn.fcglcdn.com/brainbees/images/products/300x364/15957678a.webp']");
	By shortlist_option=By.xpath("//label[@class=\"th-menu\"]");
	By shortlist_button=By.xpath("//span[text()=\"Shortlist\"]");
	
	By add_to_cart = By.xpath("//div[@class=\"bn_btn li_ml lft M14_white addtocrt\"]");
	By done_add_to_cart =By.xpath("//div[@class='done_btn M14_white']");
   	By delete = By.xpath("//span[@class='prd_delete_sz']");
   	By details = By.xpath("(//div[@class=\"list_block lft clrcls\"])[1]");
   	By clear_all = By.xpath("//span[text()=\"Clear All\"]");
   	
   	By LoginButton = By.xpath("//*[text()='Login /']");
	By phoneNumber = By.name("email");
	By continueButton = By.xpath("//*[text()='CONTINUE']");
	By submitButton = By.xpath("//*[text()='SUBMIT']");
   
	/*******************************************
	Project Name: FirstCry
	Module Name: Shortlist
	Requirement ID:
	Testcase ID :
	Method Name : clickOnLoginButton()
	Method Description : To click on login button
	Author: Abhishek
	Date of Creation: 
	Script Description: To login in opencart application 
	using valid credentials

	********************************************/
	
	public void clickOnLoginButton() throws InterruptedException {
		driver.get("https://www.firstcry.com/");
		driver.manage().window().maximize();

		driver.findElement(LoginButton).click();
		Thread.sleep(1000);
	}
	/*******************************************
	Project Name: FirstCry
	Module Name: Shortlist
	Requirement ID:
	Testcase ID :
	Method Name : clickOnLoginButton()
	Method Description : To click on login button
	Author: Abhishek
	Date of Creation: 
	Script Description: To login in opencart application 
	using valid credentials

	********************************************/
	
	public void sendMobileNumber() throws InterruptedException {
		driver.findElement(phoneNumber).sendKeys("abhisekbera.10@gmail.com");
		Thread.sleep(1000);
	}
	/*******************************************
	Project Name: FirstCry
	Module Name: Shortlist
	Requirement ID:
	Testcase ID :
	Method Name : clickOnLoginButton()
	Method Description : To click on login button
	Author: Abhishek
	Date of Creation: 
	Script Description: To login in opencart application 
	using valid credentials

	********************************************/
	public void clickOnContinueButton() throws InterruptedException {
		driver.findElement(continueButton).click();
		Thread.sleep(20000);
	}
	/*******************************************
	Project Name: FirstCry
	Module Name: Shortlist
	Requirement ID:
	Testcase ID :
	Method Name : clickOnLoginButton()
	Method Description : To click on login button
	Author: Abhishek
	Date of Creation: 
	Script Description: To login in opencart application 
	using valid credentials

	********************************************/
	public void clickOnSubmitButton() throws InterruptedException {
		driver.findElement(submitButton).click();
		Thread.sleep(5000);
	}
	/*******************************************
	Project Name: FirstCry
	Module Name: Shortlist
	Requirement ID:
	Testcase ID :
	Method Name : clickOnLoginButton()
	Method Description : To click on login button
	Author: Abhishek
	Date of Creation: 
	Script Description: To login in opencart application 
	using valid credentials

	********************************************/
	
	
	public void clickOnSearchBar()
	{
		driver.get("https://www.firstcry.com/");
		driver.manage().window().maximize();
		driver.findElement(search_bar).click();
		driver.findElement(search_bar).sendKeys("shirt");
	}
	public void clickOnSearchButton()
	{
		driver.findElement(search_button).click();
	}
	public void clickOnSearchProduct()
	{
		driver.findElement(search_product).click();
		driver.findElement(done_add_to_cart);
	}
	public void clickOnShortlistOption() throws InterruptedException
	{
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		String parent=it.next();
		String child=it.next();
		driver.switchTo().window(child);
		Thread.sleep(2000);
		driver.findElement(shortlist_option).click();
	}
	public void clickOnSearchBar2()
	{
		driver.get("https://www.firstcry.com/");
		driver.manage().window().maximize();
		driver.findElement(search_bar).click();
		driver.findElement(search_bar).sendKeys("footwear");
	}
	
	public void clickOnSearchProduct2()
	{
		driver.findElement(search_product2).click();
	}
	public void clickOnShortlistButton()
	{
		driver.findElement(shortlist_button).click();
	}
public void clickOnAddToCart() throws InterruptedException {
    	
    	Thread.sleep(4000);
    	driver.findElement(add_to_cart).click();
    	Thread.sleep(2000);

    	driver.findElement(done_add_to_cart).click();;
    	
    }

    public void clickOnDelete() {
        driver.findElement(delete).click();
        driver.switchTo().alert().accept();
    }

    public void clickOnDetails() {
        driver.findElement(details).click();
        
    }

    public void clickOnClearAll() {
    	driver.findElement(clear_all).click();
        driver.switchTo().alert().accept();

    }
}
