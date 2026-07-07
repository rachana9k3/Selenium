package org.rachanakore.ex01_SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class seleniumOptions {

    @Test
    public void TestSeleniumOptions() throws InterruptedException {


        EdgeOptions edgeOptions = new EdgeOptions();
        //edgeOptions.addArguments("--window-size=800,640");
        //edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--start maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        Thread.sleep(5000);
        driver.quit();

        //we can also add extensions
        //edgeOptions.addExtensions()  ---add the path of the downloaded extension

    }
}
