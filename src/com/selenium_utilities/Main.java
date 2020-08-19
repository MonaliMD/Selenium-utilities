package com.selenium_utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	// write your code here
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        String baseUrl = "https://www.trademe.co.nz/Members/Register.aspx";

        driver.get(baseUrl);

        //WebElement text = driver.findElement(By.name("LoginDetails$EmailAddressTextBox"));
        WebElement radio1 = driver.findElement(By.xpath("//label[contains(text(),'Man')]"));
        WebElement radio2 = driver.findElement(By.xpath("//label[contains(text(),'Woman')]"));
        WebElement radio3 = driver.findElement(By.xpath("//label[contains(text(),'Gender diverse')]"));

    //text.sendKeys("abc");
        radio1.click();
        Thread.sleep(5000);
        radio2.click();
        Thread.sleep(5000);
        radio3.click();
        Thread.sleep(5000);
        driver.quit();

    }
}
