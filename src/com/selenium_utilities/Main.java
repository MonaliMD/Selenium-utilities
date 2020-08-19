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
        Thread.sleep(3000);
        System.out.println("Radio button option1 selected");
        radio2.click();
        Thread.sleep(3000);
        System.out.println("Radio button option2 selected");
        radio3.click();
        Thread.sleep(3000);
        System.out.println("Radio button option2 selected");

        // Check whether the Check box is toggled on
        if(radio1.isSelected()){
            System.out.println("Radio1 is selcted");
        }else if (radio2.isSelected()){
            System.out.println("Radio2 is selcted");
        }else
            System.out.println("Radio3 is selcted");

        //Selecting Checkbox and using isSelected Method

        //WebElement checkbox= driver.findElement(By.xpath("//span[@name='TnCCheckbox']"));
        WebElement checkbox= driver.findElement(By.id("TnCCheckbox"));

        checkbox.click();
        Thread.sleep(3000);

        // Check whether the Checkbox is toggled on
        if(checkbox.isSelected()){
            System.out.println("Check box is toggled on");
        }else{
            System.out.println("Check box is toggled off");
        }


        //Selecting Check box and using isSelected Method
        for(int i=0; i<1; i++){
            checkbox.click();
            System.out.println("Checkbox status is" + checkbox.isSelected());
        }
        driver.quit();

    }
}
