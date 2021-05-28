package com.htc.cleartrip.pageobjects;

import org.openqa.selenium.By;

public interface Loginpageobject {
   By username=By.xpath("//input[@id='email']");
   By lpassword=By.xpath("//input[@id='password']");
   By lcheckbox=By.xpath("//input[@id='persistent_login']");
   By lsignin=By.xpath("//button[@id='signInButton']");
   By signout=By.xpath("//a[@id='global_signout']");
   
}
