package com.selenium_utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	// write your code here
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        String baseUrl = "https://www.trademe.co.nz/";
        WebDriver driver = new ChromeDriver();

        driver.get(baseUrl);
        driver.findElement(By.className("drop-container")).click();
        //driver.findElement(By.id("SearchType"));
        Thread.sleep(3000);
        Select dropDown1 = new Select(driver.findElement(By.id("SearchType")));


        //dropDown1.selectByVisibleText("Books");
        dropDown1.selectByValue("193");
//        dropDown1.selectByIndex(5);

        Thread.sleep(3000);
        driver.quit();
    }
}
