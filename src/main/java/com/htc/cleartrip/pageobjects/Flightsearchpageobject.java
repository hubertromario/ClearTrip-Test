package com.htc.cleartrip.pageobjects;

import org.openqa.selenium.By;

public interface Flightsearchpageobject {
	 By oneway=By.xpath("//input[@id='OneWay']");
	 By From=By.xpath("//input[@id='FromTag']");
	 By To=By.xpath("//input[@id='ToTag']");
	 By departdate=By.xpath("//input[@id='DepartDate']");
	 By Monthtitle=By.xpath("(//div[@class=\"title\"])[1]");
	 By Nextmonth=By.xpath("//a[@class='nextMonth ']");
	 By NextmonthTitle=By.xpath("(//div[@class=\\\"title\\\"])[1]");
	 By Date=By.xpath("(//a[text()='x'])[1]");
	 By adult=By.xpath("//select[@name='adults']");
	 By children=By.xpath("//select[@name='childs']");
	 By infants=By.xpath("//select[@name='infants']");
	 By searchButton=By.xpath("//input[@id='SearchBtn']");
	 By Fromtab=By.xpath("(//a[@tabindex='-1'])[3]");
	 By Totab=By.xpath("(//a[@tabindex='-1'])[4]");
}




