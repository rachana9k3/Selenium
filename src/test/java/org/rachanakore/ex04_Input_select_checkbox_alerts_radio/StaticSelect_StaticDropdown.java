package org.rachanakore.ex04_Input_select_checkbox_alerts_radio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticSelect_StaticDropdown {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");

        WebElement dropdown = driver.findElement(By.id("dropdown"));

        //Select option is given in Selenium.....
        Select select = new Select(dropdown);

        //select.selectByIndex(1);

        select.selectByVisibleText("Option 2");

        driver.quit();

    }
}
