package com.selenium_utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	// write your code here

    System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        String baseUrl = "https://www.trademe.co.nz/Members/Register.aspx";
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);

        driver.findElement(By.id("SiteHeader_SiteTabs_homeLink")).click();
        Thread.sleep(3000);

        System.out.println(driver.getTitle());


    if(driver.getTitle().equals("Buy online and sell with NZ's #1 auction & classifieds site | Trade Me")) {
        System.out.println("We are back at Trademe home page");
    }else{
        System.out.println("We are not in Trademe home page");
    }
        driver.quit();

    }
}
