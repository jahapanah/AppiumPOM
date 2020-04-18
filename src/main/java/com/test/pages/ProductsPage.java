package com.test.pages;

import com.test.BaseTest;
import com.test.MenuPage;
import com.test.utils.TestUtils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class ProductsPage extends MenuPage {
	TestUtils utils = new TestUtils();
	
	@AndroidFindBy (xpath = "//android.widget.ScrollView[@content-desc=\"test-PRODUCTS\"]/preceding-sibling::android.view.ViewGroup/android.widget.TextView") 
	@iOSXCUITFindBy (xpath ="//XCUIElementTypeOther[@name=\"test-Toggle\"]/parent::*[1]/preceding-sibling::*[1]")
	private MobileElement productTitleTxt;
	
	@AndroidFindBy (xpath = "(//android.widget.TextView[@content-desc=\"test-Item title\"])[1]") 
	@iOSXCUITFindBy (xpath = "(//XCUIElementTypeStaticText[@name=\"test-Item title\"])[1]")
	private MobileElement SLBTitle;
	
	@AndroidFindBy (xpath = "(//android.widget.TextView[@content-desc=\"test-Price\"])[1]") 
	@iOSXCUITFindBy (xpath = "(//XCUIElementTypeStaticText[@name=\"test-Price\"])[1]")
	private MobileElement SLBPrice;
	
public String getTitle() {
	String title = getText(productTitleTxt);
	utils.log().info("product page title is - " + title);
	return title;
}

public String getSLBTitle() {
	String title = getText(SLBTitle);
	utils.log().info("title is - " + title);
	return title;
}

public String getSLBPrice() {
	String price = getText(SLBPrice);
	utils.log().info("price is - " + price);
	return price;
}

public ProductDetailsPage pressSLBTitle() {
	utils.log().info("press SLB tile link");
	click(SLBTitle);
	return new ProductDetailsPage();
}

}
