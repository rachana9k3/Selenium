package org.rachanakore.WebTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class webTables_method1 {

    @Test
    public void test_web_tables(){
        WebDriver driver =  new ChromeDriver();
        driver.get("https://awesomeqa.com/webtable.html");
        driver.manage().window().maximize();

        //xpath -- //table[@id="customers"]/tbody/tr

        String firstPart = "//table[@id=\"customers\"]/tbody/tr[";
        String secondPart = "]/td[";
        String thirdPart = "]";

        int row = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
        int col = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr[2]/td")).size();

        for (int i=2; i<=row; i++){   //i=2 bcoz 1st row is header
            for (int j=1; j<=col; j++){

                String dynamic_path = firstPart+i+secondPart+j+thirdPart;
                //System.out.println(dynamic_path); output displayed is - //table[@id="customers"]/tbody/tr[1]/td[2]

                String data = driver.findElement(By.xpath(dynamic_path)).getText();
                //System.out.println(data);

                if(data.contains("Helen Bennett")){
                    String country = dynamic_path+"/following-sibling::td";
                    String country_text = driver.findElement(By.xpath(country)).getText();
                    ////table[@id="customers"]/tbody/tr[5]/td[2]/following-sibling::td
                    System.out.println("-----------");
                    System.out.println("Helen Bennett is in - " + country_text);
                }
            }
        }
        driver.quit();
    }
}
