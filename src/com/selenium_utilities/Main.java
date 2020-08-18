package com.selenium_utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	// write your code here
    System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
    WebDriver driver = new ChromeDriver();

    String baseUrl ="https://www.facebook.com/";
    driver.get(baseUrl);

    //Find and get the WebElement corresponding to the Email Address
    WebElement email = driver.findElement(By.id("email"));
    email.sendKeys("monali@gmail.com");
    System.out.println("email field set");
    Thread.sleep(5000);

    //Find and the WebElement corresponding to the password
    WebElement password = driver.findElement(By.name("pass"));
    password.sendKeys("monali123");
    System.out.println("password field is set");
    Thread.sleep(5000);

    //Deleting input values in the text fields
        email.clear();
        password.clear();
        System.out.println("email and password field are cleared");
        Thread.sleep(5000);

        //Find the login button
        WebElement login = driver.findElement(By.id("u_0_b"));

        // Using click method to submit form
        email.sendKeys("monalimd@123");
        password.sendKeys("monalimd123");
        login.click();
        System.out.println("login done with login button click");
        Thread.sleep(5000);

        //use submit method to submit the form. Submit used on password field
        driver.get(baseUrl);
        driver.findElement(By.id("email")).sendKeys("monalimd@1234");
        driver.findElement(By.name("pass")).sendKeys("monalimd1234");
        driver.findElement(By.id("u_0_b")).submit();
        System.out.println("Login done with submit");
        Thread.sleep(5000);
        driver.quit();
    }
}
