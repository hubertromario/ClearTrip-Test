package com.htc.cleartrip.pages;

import org.openqa.selenium.WebDriver;

import com.htc.cleartrip.base.Basepage;
import com.htc.cleartrip.pageobjects.Giftcardpageobject;

public class Giftcardpage extends Basepage implements Giftcardpageobject{
	public Giftcardpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void clickgiftcard() {
		clickableMethod(giftcard);
		switchtoNewTab(driver,2);
	}
}
