import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class AmazonSiteTest {
    WebDriver driver = new ChromeDriver();

    @BeforeTest
    public void testOpenUrl() {
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();

    }

    @Test
    public void testAmazonSite() {

        Select dropDownCategory = new Select(driver.findElement(By.id("searchDropdownBox")));
        dropDownCategory.selectByVisibleText("Books");

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Automation");
        driver.findElement(By.id("nav-search-submit-button")).click();

        driver.findElement(By.xpath("//*[@id=\"p_72/1250221011\"]/span/a/section/i")).click();

        driver.findElement(By.xpath("//*[@id=\"p_n_feature_nine_browse-bin/3291437011\"]/span/a/span")).click();



        //List<WebElement> li = driver.findElements(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div[1]/div/div[2]"));


        //List<WebElement> li = driver.findElements(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[1]/div/span/div/div/span"));
        //if (li.size() >= 2) {

            //WebElement secondProduct = li.get(1);
            //WebElement productNameElement = secondProduct.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div[1]/div/div[2]"));
            //secondProduct.click();


       // List<WebElement> productElements = driver.findElements(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[1]/div/span/div/div/span"));


           // if (productElements.size() >= 2) {
                //WebElement secondProduct = productElements.get(1);
                //.click();
            //}


    }




    }



