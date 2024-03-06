import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleSecondTest {

    @Test
    public void openGooglePage() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        WebElement agreeButton = driver.findElement(By.xpath("//div[text()='Zaakceptuj wszystko']"));
        agreeButton.click();

        WebElement searchField = driver.findElement(By.name("q"));
        searchField.sendKeys("Selenium");
        searchField.sendKeys(Keys.ENTER);

        WebElement result = driver.findElement(By.xpath("//a[contains(@href,'selenium.dev')]//h3"));

        Assert.assertTrue(result.isDisplayed());
    }
}
