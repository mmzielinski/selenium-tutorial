import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


public class GooglePageTest {

    @Test
    public void openGooglePage() {
        ChromeOptions options = new ChromeOptions();
        options.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.ACCEPT);

        WebDriver driver = new ChromeDriver(options);

        //driver.manage().window().maximize();
        Dimension windowSize = new Dimension(1920, 1080);
        driver.manage().window().setSize(windowSize);

        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("alert('Hello!')");

        driver.get("https://www.google.com");

        //driver.quit();


    }
}
