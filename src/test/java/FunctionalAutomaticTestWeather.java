import code.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class FunctionalAutomaticTestWeather extends BaseTest {
    final static String BASE_URL = "https://openweathermap.org/";
    final static By API = By.xpath("//div[@id='desktop-menu']//a[text()='API']");
    final static By GUIDE = By.xpath("//div[@id='desktop-menu']//a[text()='Guide']");
    final static By DASHBOARD = By.xpath("//div[@id='desktop-menu']//a[text()='Dashboard']");
    final static By MARKETPLACE = By.xpath("//div[@id='desktop-menu']//a[text()='Marketplace']");
    final static By PRICING = By.xpath("//div[@id='desktop-menu']//a[text()='Pricing']");
    final static By MAPS = By.xpath("//div[@id='desktop-menu']//a[text()='Maps']");
    final static By OUR_INITIATIVES = By.xpath("//div[@id='desktop-menu']//a[text()='Our Initiatives']");
    final static By PARTNERS = By.xpath("//div[@id='desktop-menu']//a[text()='Partners']");
    final static By BLOG = By.xpath("//div[@id='desktop-menu']//a[text()='Blog']");
    final static By FOR_BUSINESS = By.xpath("//div[@id='desktop-menu']//a[text()='For Business']");
    final static By SIGN_IN = By.xpath("//div[@id='desktop-menu']//a[text()='Sign in']");
    final static By SUPPORT = By.id("support-dropdown");
    final static By FAQ = By.xpath("//ul[@id='support-dropdown-menu']//a[text()='FAQ']");
    final static By HOW_TO_STAR = By.xpath("//ul[@id='support-dropdown-menu']//a[text()='How to start']");
    final static By ASK_A_QUESTION = By.xpath("//ul[@id='support-dropdown-menu']//a[text()='Ask a question']");

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
    public void testUrlGuide() {
        String expectedResul = "https://openweathermap.org/guide";
        openBaseURL();
        getDriver().manage().window().maximize();
        waitForGrayFrameDisappered();
        click(GUIDE);
        Assert.assertEquals(getDriver().getCurrentUrl(), expectedResul);
    }

    @Test
    public void testUrlApi() {
        String expectedResul = "https://openweathermap.org/api";
        openBaseURL();
        getDriver().manage().window().maximize();
        waitForGrayFrameDisappered();
        click(API);
        Assert.assertEquals(getDriver().getCurrentUrl(), expectedResul);
    }

    @Test
    public void testUrlDashboard() {
        String expectedResul = "https://openweathermap.org/weather-dashboard";
        openBaseURL();
        getDriver().manage().window().maximize();
        waitForGrayFrameDisappered();
        click(DASHBOARD);
        Assert.assertEquals(getDriver().getCurrentUrl(), expectedResul);
    }

    @Test
    public void testUrlMarketplace() {
        String expectedResul = "https://home.openweathermap.org/marketplace";
        openBaseURL();
        getDriver().manage().window().maximize();
        waitForGrayFrameDisappered();
        click(MARKETPLACE);
        ArrayList<String> windows = new ArrayList(getDriver().getWindowHandles());
        getDriver().close();
        // getDriver().switchTo().window(windows.get(1)).getCurrentUrl();
        Assert.assertEquals(getDriver().switchTo().window(windows.get(1)).getCurrentUrl(), expectedResul);
        // Assert.assertEquals(getDriver().getCurrentUrl(), expectedResul);
    }

    @Test
    public void testUrlPricing() {
        String expectedResul = "https://openweathermap.org/weather-dashboard";
        openBaseURL();
        getDriver().manage().window().maximize();
        waitForGrayFrameDisappered();
        click(PRICING);
        Assert.assertEquals(getDriver().getCurrentUrl(), expectedResul);
    }

    @Test
    public void testUrlMaps() {
        String expectedResul = "https://openweathermap.org/weathermap?basemap=map&cities=true&layer=temperature&lat=";
        openBaseURL();
        getDriver().manage().window().maximize();
        waitForGrayFrameDisappered();
        click(MAPS);
        Assert.assertTrue(getDriver().getCurrentUrl().contains(expectedResul));
    }

    @Test
    public void testUrlOurInitiatives() {
        String expectedResul = "https://openweathermap.org/our-initiatives";
        openBaseURL();
        getDriver().manage().window().maximize();
        waitForGrayFrameDisappered();
        click(OUR_INITIATIVES);
        Assert.assertEquals(getDriver().getCurrentUrl(), expectedResul);
    }

    @Test
    public void testUrlPartners() {
        String expectedResul = "https://openweathermap.org/our-initiatives";
        openBaseURL();
        getDriver().manage().window().maximize();
        waitForGrayFrameDisappered();
        click(PARTNERS);
        Assert.assertEquals(getDriver().getCurrentUrl(), expectedResul);
    }


    @Test
    public void testUrlBlog() {
        String expectedResul = "https://openweather.co.uk/blog/category/weather";
        openBaseURL();
        getDriver().manage().window().maximize();
        waitForGrayFrameDisappered();
        click(BLOG);
        ArrayList<String> windows = new ArrayList(getDriver().getWindowHandles());
        getDriver().close();
        Assert.assertEquals(getDriver().switchTo().window(windows.get(1)).getCurrentUrl(), expectedResul);
    }

    @Test
    public void testUrlForBusiness() {
        String expectedResul = "https://openweather.co.uk/";
        openBaseURL();
        getDriver().manage().window().maximize();
        waitForGrayFrameDisappered();
        click(FOR_BUSINESS);
        ArrayList<String> windows = new ArrayList(getDriver().getWindowHandles());
        getDriver().close();
        Assert.assertEquals(getDriver().switchTo().window(windows.get(1)).getCurrentUrl(), expectedResul);
    }

    @Test
    public void testUrlSignIn() {
        String expectedResul = "https://home.openweathermap.org/users/sign_in";
        openBaseURL();
        getDriver().manage().window().maximize();
        waitForGrayFrameDisappered();
        click(SIGN_IN);
        Assert.assertEquals(getDriver().getCurrentUrl(), expectedResul);
    }

    @Test
    public void testUrlSupportFAQ() {
        String expectedResul = "https://openweathermap.org/faq";
        openBaseURL();
        getDriver().manage().window().maximize();
        waitForGrayFrameDisappered();
        click(SIGN_IN);
        waitForGrayFrameDisappered();
        click(FAQ);
        waitForGrayFrameDisappered();
        System.out.println(getDriver().getCurrentUrl());
        Assert.assertEquals(getDriver().getCurrentUrl(), expectedResul);
    }


}
