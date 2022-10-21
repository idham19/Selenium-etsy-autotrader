import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AutoTraderTest {
    WebDriver driver;
    WebElement element;
    private JavascriptExecutor javascriptExecutor;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        javascriptExecutor=((JavascriptExecutor)driver);
    }

//    @After
//    public void tearDown() {
//        driver.quit();
//    }

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
//    @Test
//    public void carImageTest() throws InterruptedException {
//        driver.get("https://www.nike.com/");
////        driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
//
////        javascriptExecutor.executeScript("window.scrollBy(0,2000)");
////        Thread.sleep(300);
//
//        element= driver.findElement(By.xpath("//body[1]/div[4]/div[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/h2[1]"));
//
//    }



}
