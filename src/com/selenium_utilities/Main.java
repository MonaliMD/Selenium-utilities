package com.selenium_utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	// write your code here

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        String baseUrl = "http://demo.guru99.com/popup.php";

        driver.get(baseUrl);

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();

        String mainWindow = driver.getWindowHandle();

        // To handle all new opened window
        Set<String> w1= driver.getWindowHandles();
        Iterator<String> i1 = w1.iterator();

        while (i1.hasNext()){
            String childWindow = i1.next();

            if(!mainWindow.equalsIgnoreCase(childWindow));
            {
                driver.switchTo().window(childWindow);
                //Thread.sleep(3000);
                driver.findElement(By.name("emailid")).sendKeys("gaurav.3n@gmail.com");
                driver.findElement(By.name("btnLogin")).click();

                //Close the child window
                driver.close();
            }
        }
        // Switching to Parent window i.e Main Window.
        driver.switchTo().window(mainWindow);
    }
}
