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

    //Find and get the WebElement corresponding to the Email Address
    WebElement email = driver.findElement(By.id("email"));
    email.sendKeys("monali@gmail.com");
    System.out.println("email field set");

    //Find and the WebElement corresponding to the password
    WebElement password = driver.findElement(By.name("pass"));
    password.sendKeys("monali123");
    System.out.println("password field is set");

    //Deleting input values in the text fields
        email.clear();
        password.clear();
        System.out.println("email and password field are cleared");

        //Find the login button
        WebElement login = driver.findElement(By.id("u_0_b"));

        // Using click method to submit form
        email.sendKeys("monalimd@123");
        password.sendKeys("monalimd123");
        login.click();
        System.out.println("login done with login button click");


    }
}
