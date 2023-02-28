package com.flipkart_v001.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productorderPage {
	
	WebDriver ldriver;
	
	public productorderPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
	@CacheLookup
	WebElement closeLogin;
	
	@FindBy(name="q")
	@CacheLookup
	WebElement searchProduct;
	
	@FindBy(xpath="//button[@class='L0Z3Pu']")
    @CacheLookup
    WebElement searchClick;
	
	@FindBy(linkText="Tablets")
	@CacheLookup
	WebElement clickTablets;
	
	@FindBy(xpath="//div[text()='APPLE iPad (9th Gen) 64 GB ROM 10.2 inch with Wi-Fi Only (Space Grey)']")
	@CacheLookup
	WebElement clickProduct;
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']")
	@CacheLookup
	WebElement clickbuyProduct;
	
	@FindBy(xpath="(//input[starts-with(@class,'_2IX_2-')])[1]")
	@CacheLookup
	WebElement promptEmail;
	
	@FindBy(xpath="//button[@class='_2KpZ6l _20xBvF _3AWRsL']")
	@CacheLookup
	WebElement clickContinue;
	
	@FindBy(xpath="(//input[starts-with(@class,'_2IX_2-')])[2]")
	@CacheLookup
	WebElement promptPhonenumber;
	
	@FindBy(xpath="//button[@class='_2KpZ6l _20xBvF _3AWRsL']")
	@CacheLookup
	WebElement clickonSubmitbutton;
	
	public void close_Login() {
		closeLogin.click();
	}
	
	public void search_Product(String productname)
	{
		searchProduct.sendKeys(productname);
	}
	
	public void submit_button()
	{
		clickonSubmitbutton.click();
	}
	
	public void serach_Click()
	{
		searchClick.click();
	}
	
	public void fliter_Online()
	{
		clickTablets.click();
	}
	
	public void selectresults_Product()
	{
		clickProduct.click();
	}
	
	public void clickproduct_Buybutton()
	{
		clickbuyProduct.click();
	}
	
	public void prompt_Email(String Email)
	{
		promptEmail.sendKeys(Email);
	}
	
	public void click_Continuebutton()
	{
		clickContinue.click();	
	}
	
	public void prompt_Phonenumber(String PhoneNo)
	{
		promptPhonenumber.sendKeys(PhoneNo);
	}
}
