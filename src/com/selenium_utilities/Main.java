package com.selenium_utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        String baseUrl = "http://demo.guru99.com/popup.php";

        driver.get(baseUrl);

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();
    }
}
