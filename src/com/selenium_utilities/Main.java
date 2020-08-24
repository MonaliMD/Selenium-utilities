package com.selenium_utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        String baseUrl = "https://www.facebook.com/";

        driver.get(baseUrl);
        WebElement txtUserName = driver.findElement(By.id("email"));

        Actions builder = new Actions(driver);
        Action seriesOfActions = builder.moveToElement(txtUserName)
                                        .click().keyDown(txtUserName, Keys.SHIFT)
                                        .sendKeys(txtUserName,"hello")
                                        .keyUp(txtUserName, Keys.SHIFT)
                                        .doubleClick(txtUserName)
                                        .contextClick()
                                        .build();

        seriesOfActions.perform();

    }
}
