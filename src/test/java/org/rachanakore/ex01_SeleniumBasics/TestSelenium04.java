package org.rachanakore.ex01_SeleniumBasics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium04 {

    @Description("Open the url")
    @Test
    public void testSelenium1(){


        WebDriver driver = new EdgeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();

        driver.getCurrentUrl();
        driver.getTitle();

        driver.quit();

    }
}
