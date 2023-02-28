package com.flipkart_v001.testCase;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


import com.flipkart_v001.pageObjects.productorderPage;

public class TC_productbuyTest_001 extends baseClass
{

	@Test
	public void productBuyTest() throws InterruptedException
	{
		logger.info("Flipkart URL Opened");
		
		productorderPage po=new productorderPage(driver);
		po.close_Login();
		logger.info("Login Prompt window closed");
		po.search_Product("ipad");
		Thread.sleep(300);
		logger.info("Searched product name with 'ipad' ");
		try 
		{
		List<WebElement> suggestionList = driver.findElements(By.xpath("//li[@class='Y5N33s']"));
		
		for (int i=0; i<suggestionList.size()-1;i++)
		{
			if(suggestionList.get(i).getText().contains("ipad 9th generation"))
			{
				Thread.sleep(300);
				suggestionList.get(i).click();
				logger.info("User Selected 'ipad 9th generation'");
				Thread.sleep(300);
				po.serach_Click();
				logger.info("User Clicked on Search Button");
				Thread.sleep(300);
				po.fliter_Online();
				logger.info("User Selected 'Online Filter'");
				Thread.sleep(300);
				po.selectresults_Product();
				logger.info("User Selected 'APPLE iPad (9th Gen) 64 GB ROM 10.2 inch with Wi-Fi Only (Space Grey)' product ");
				ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
				Thread.sleep(300);
				driver.switchTo().window(tabs2.get(1));
				logger.info("User Switched to Newly opend Tab");
				po.clickproduct_Buybutton();
				logger.info("User Clicked on Buy Button");
				Thread.sleep(300);
				String email = randomestring()+"@gmail.com";
				po.prompt_Email(email);
				logger.info("User Prompted for Email");
				Thread.sleep(3000);
				po.click_Continuebutton();
				Thread.sleep(300);
				po.prompt_Phonenumber("9987567456");
				logger.info("User Prompted for Phone Number");
				po.submit_button();
				logger.info("User clicked on Countinue button for 'Mobile OTP'");
				String expectedText = "Flipkart.com: Secure Payment: Login > Select Shipping Address > Review Order > Place Order";
				String acutalText = driver.getTitle();
				if(expectedText.equals(acutalText)) {
					Assert.assertTrue(true);
					logger.info("Product Order Test Passed");
					
				}
				else {
					Assert.assertTrue(false);
					logger.info("Product Order Test failed");
				}
				
			}
		}
		
		}
		catch(org.openqa.selenium.StaleElementReferenceException ex)
		{
			ex.getMessage(); 
		}
		finally {
			driver.close();
		}
	}
}
