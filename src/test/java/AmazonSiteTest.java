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
        //Navigate to official Amazon site (https://www.amazon.com/)
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();

    }

    @Test
    public void testAmazonSite() {

        //Select ‘Books’ from the Category list
        Select dropDownCategory = new Select(driver.findElement(By.id("searchDropdownBox")));
        dropDownCategory.selectByVisibleText("Books");

        //Select ‘Books’ from the Category list
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Automation");
        driver.findElement(By.id("nav-search-submit-button")).click();

         //Select Customer Reviews as “4 Stars & Up”
        driver.findElement(By.xpath("//*[@id=\"p_72/1250221011\"]/span/a/section/i")).click();

        //Select Language as “English”
        driver.findElement(By.xpath("//*[@id=\"p_n_feature_nine_browse-bin/3291437011\"]/span/a/span")).click();


        //Get the name of the second item from the Product List page and click it
        List<WebElement> elementList = driver.findElements(By.className("rush-component"));
        if (elementList.size() >= 2) {

            WebElement secondProduct = elementList.get(1);
            secondProduct.click();
        }



        
        



    }




    }



