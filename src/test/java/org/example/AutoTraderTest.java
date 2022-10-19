package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoTraderTest {
    WebDriver driver;
    WebElement element;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void carMakeDropDowntest(){
        driver.get("https://www.autotrader.com/");
        driver.findElement(By.id("2230463214")).click();
    }
    @Test
    public void carModelDropDown(){
        driver.get("https://www.autotrader.com/");
        driver.findElement(By.id("1617644117"));

    }
    @Test
    public void carForYouCarOuSelTest(){
        driver.get("https://www.autotrader.com/");
        driver.findElement(By.xpath("//div[@class='col-xs-12 col-md-10 col-md-offset-1 text-left']"));

    }

}
