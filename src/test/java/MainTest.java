import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.goinvest.trade.Main;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class MainTest {
    @Test
    public static void testTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

        // String title = driver.getTitle();
        // Assert.assertEquals("Web form", title);

        // driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        WebElement textBox = driver.findElement(By.name("my-text"));
        textBox.sendKeys("Selenium");

        WebElement submitButton = driver.findElement(By.cssSelector("button"));
        submitButton.click();

        WebElement message = driver.findElement(By.id("message"));
        String value = message.getText();

        Assert.assertEquals(value,"Received!");

        driver.quit();
    }
}
