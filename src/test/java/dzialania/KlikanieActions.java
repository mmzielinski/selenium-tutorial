package dzialania;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class KlikanieActions {

    @Test
    public void actionsClick() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        Actions actions = new Actions(driver);
        //actions.contextClick().perform();
        actions.contextClick(driver.findElement(By.id("clickOnMe"))).perform();
    }


    @Test
    public void actionsDoubleClick() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/doubleclick.html");

        Actions actions = new Actions(driver);
        WebElement button = driver.findElement(By.id("bottom"));
        actions.doubleClick(button).perform();


    }
}
