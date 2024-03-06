package selektory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class SelectorLinkTest {

    @Test
    public void findElement(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        WebElement linkText = driver.findElement(By.linkText("Visit W3Schools.com!"));
        //WebElement linkText = driver.findElement(By.partialLinkText("Visit"));
        linkText.click();
    }
}
