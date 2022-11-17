import code.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
public class FunctionalAutomaticTestWeather extends BaseTest{
    final static String BASE_URL = "https://openweathermap.org/";
    final static By API = By.xpath("//div[@id='desktop-menu']//a[text()='API']");

    private void openBaseURL() {
        getDriver().get(BASE_URL);
    }

    private void waitForGrayFrameDisappered() {
        getWait10().until(ExpectedConditions.invisibilityOfElementLocated(By.className("owm-loader-container")));
    }

    private void click(By by) {
        getDriver().findElement(by).click();
    }

    @Test
    public void testUrlApi(){
        String expectedResul = "https://openweathermap.org/api";
        openBaseURL();
        getDriver().manage().window().maximize();
        waitForGrayFrameDisappered();
        click(API);
        Assert.assertEquals(getDriver().getCurrentUrl(), expectedResul);


    }
}
