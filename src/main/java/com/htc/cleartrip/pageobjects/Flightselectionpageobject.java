package com.htc.cleartrip.pageobjects;

import org.openqa.selenium.By;

public interface Flightselectionpageobject {
	By BookButton=By.xpath("//button[text()='Book']");
	By nonstopcheckbox=By.xpath("(//span[@class='checkbox__mark bs-border bc-neutral-500 bw-1 ba'])[2]");
	
}
