import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class EtsyTest {
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
    public void searchBarTest() {
        driver.get("https://www.etsy.com/");
        driver.findElement(By.id("global-enhancements-search-query")).sendKeys("chess set");
        driver.findElement(By.xpath("//span[@class='wt-icon wt-nudge-b-2 wt-nudge-r-1']")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void headerNavigationButtonTest() {
        driver.get("https://www.etsy.com/");
        driver.findElement(By.xpath("//ul[@class='wt-grid wt-grid--block wt-justify-content-center wt-pt-xs-1 wt-pl-xs-1 wt-pr-xs-1 wt-pt-md-0 wt-pl-md-4 wt-pr-md-4 wt-pl-lg-6 wt-pr-lg-6']"));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void headerNavigationPictureTest() {
        driver.get("https://www.etsy.com/");
        element = driver.findElement(By.xpath("//img[@src='https://i.etsystatic.com/27025196/r/il/39e7d1/3119788484/il_300x300.3119788484_2idk.jpg']"));
        assertEquals("https://i.etsystatic.com/27025196/r/il/39e7d1/3119788484/il_300x300.3119788484_2idk.jpg", element.getAttribute("src"));
    }

    @Test
    public void signInButtonTest() {
        driver.get("https://www.etsy.com/");
        driver.findElement(By.xpath("// button[@class='wt-btn wt-btn--small wt-btn--transparent wt-mr-xs-1 inline-overlay-trigger signin-header-action select-signin']")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        element = driver.findElement(By.xpath("//div[@class='wt-overlay__modal wt-overlay--animation-done']"));
        assertTrue("the sign in div is displayed", element.isDisplayed());
    }

    @Test
    public void shoppingCartTest() {
        driver.get("https://www.etsy.com/");
        element = driver.findElement(By.xpath("//a[@class='wt-tooltip__trigger wt-tooltip__trigger--icon-only wt-btn wt-btn--transparent wt-btn--icon']"));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        assertEquals("https://www.etsy.com/cart?ref=hdr-cart", element.getAttribute("href"));
    }
    @Test
    public void subscribeEmailInputTest(){
        driver.get("https://www.etsy.com/");
        driver.findElement(By.xpath("//input[@name='email_address']"));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void subscribeButtonTest(){
        driver.get("https://www.etsy.com/");
        driver.findElement(By.xpath("//div[@class='wt-input-btn-group']/button"));
    }

}
