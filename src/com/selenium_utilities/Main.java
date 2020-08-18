package com.selenium_utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
public class Main {

    public static void main(String[] args) {
	// write your code here
    System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
    WebDriver driver = new ChromeDriver();

    driver.get("https://www.facebook.com/");

    WebElement email = driver.findElement(By.id("email"));


    WebElement password = driver.findElement(By.name("pass"));

        email.sendKeys("monali@gmail.com");
        password.sendKeys("monali123");

        WebElement login = driver.findElement(By.id("u_0_b"));
        login.click();

        //email.clear();
        //password.clear();
    }
}
