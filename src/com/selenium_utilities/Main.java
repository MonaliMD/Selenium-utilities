package com.selenium_utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Main {

    public static void main(String[] args) {
	// write your code here
    System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        String baseUrl = "http://demo.guru99.com/test/newtours/";

        driver.get(baseUrl);

        WebElement link_home = driver.findElement(By.linkText("Home"));
        WebElement td_home = driver.findElement(By.xpath("//body/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td[1]/table[1]/tbody[1]/tr[1]"));

        //Action test1 = driver.
        Actions builder = new Actions(driver);
        Action mouseHoverHome = builder.moveToElement(link_home).build();

        String bgColor = td_home.getCssValue("background-color");
        System.out.println("Before Hover:" +bgColor);
        mouseHoverHome.perform();
        bgColor = td_home.getCssValue("background-color");
        System.out.println(("After Hover:"+ bgColor));

        driver.close();
    }
}
