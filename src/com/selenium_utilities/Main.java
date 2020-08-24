package com.selenium_utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        String baseUrl = "http://demo.guru99.com/test/upload/";

        driver.get(baseUrl);
        WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));
         uploadElement.sendKeys("/Users/monaliwijesinghe/Desktop/test.html");

         driver.findElement(By.id("terms")).click();

         driver.findElement(By.name("send")).click();

         driver.close();

    }
}
