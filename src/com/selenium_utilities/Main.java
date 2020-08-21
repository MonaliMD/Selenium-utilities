package com.selenium_utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	// write your code here
    System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");

    String baseUrl1 ="http://demo.guru99.com/test/link.html";
    String baseUrl2 ="http://demo.guru99.com/test/accessing-link.html";
    String baseUrl3 ="http://demo.guru99.com/test/newtours/";
    String baseUrl4 ="http://demo.guru99.com/test/block.html";

        WebDriver driver = new ChromeDriver();

    //Accessing links using Exact Text Match: By.linkText()
        driver.get(baseUrl1);
        driver.findElement(By.linkText("click here")).click();
        System.out.println("Title of the page is:"+driver.getTitle());

        //driver.quit();
        Thread.sleep(3000);
    //Accessing links using Partial Text Match: By.partialLinkText()
    //if there are multiple liks with name "here" it will select first element
        driver.get(baseUrl2);
        driver.findElement(By.partialLinkText("here")).click();
        System.out.println("Title of the page is:"+ driver.getTitle());

       // driver.quit();

    //Case-sensitivity for Link Text both By.linkText() and By.partialLinkText()
        driver.get(baseUrl3);

        String linkText1 = driver.findElement(By.partialLinkText("egis")).getText();
        System.out.println(linkText1);

        String linkText2 = driver.findElement(By.partialLinkText("EGIS")).getText();
        System.out.println(linkText2);

    //Links Outside and Inside a Block
        driver.get(baseUrl4);

        driver.findElement(By.partialLinkText("Inside")).click();
        System.out.println("Title of the page is:" +driver.getTitle());

        driver.navigate().back();
        driver.findElement(By.partialLinkText("Outside")).click();
        System.out.println("Title of the page is:"+driver.getTitle());

        driver.quit();
    }
}
