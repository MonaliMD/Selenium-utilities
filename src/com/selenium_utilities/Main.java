package com.selenium_utilities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	// write your code here
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");

        // Alert Message handling
        WebDriver driver = new ChromeDriver();

        String baseUrl = "http://demo.guru99.com/test/delete_customer.php";

        driver.get(baseUrl);

        driver.findElement(By.name("cusid")).sendKeys("53920");
        driver.findElement(By.name("submit")).submit();

        //Switch to Alert

        Alert alert = driver.switchTo().alert();

        // Capturing alert message.

        String alertMessage = driver.switchTo().alert().getText();

        // If there is a input element
        //String alertMessage= driver.switchTo().alert().getText();

        //Display alert message
        System.out.println(alertMessage);
        Thread.sleep(3000);

        //accept alert
        alert.accept();
        //alert.dismiss();


    }
}
