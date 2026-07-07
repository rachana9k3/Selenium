package org.rachanakore.ex04_Input_select_checkbox_alerts_radio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Input_Checkbox_Radio {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/practice.html");

        WebElement input = driver.findElement(By.name("firstname"));
        input.sendKeys("Rachana");

        WebElement radiobtn = driver.findElement(By.id("sex-1"));
        radiobtn.click();

        WebElement checkbox = driver.findElement(By.id("profession-0"));
        checkbox.click();

        driver.quit();

    }
}
