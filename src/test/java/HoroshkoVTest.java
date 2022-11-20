import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class HoroshkoVTest  {
    static final String URL = "https://openweathermap.org/";
    static final String GUIDE = "//div[@id='desktop-menu']//a[text()='Guide']";
    final static String BASE_URL = "https://openweathermap.org/";
    final static By API = By.xpath("//div[@id='desktop-menu']//a[text()='API']");
    final static By GUIDEby = By.xpath("//div[@id='desktop-menu']//a[text()='Guide']");
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
    final static By H_1 = By.tagName("h1");
    final static By H_2 = By.tagName("//span[(text()='Weather forecasts, nowcasts and history in a fast and elegant way')]");

    /*private void openBaseURL() {
        getDriver().get(BASE_URL);
    }

    private void waitForGrayFrameDisappered() {
        getWait10().until(ExpectedConditions.invisibilityOfElementLocated(By.className("owm-loader-container")));
    }

    private void click(By by) {
        getDriver().findElement(by).click();
    }*/


    @Test
    public void TC_11_01_TestNameTitleAndUrlPageGuide() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\JavaProject\\webdriwer\\chromedriver.exe");
        String expectedResultTiltle = "OpenWeatherMap API guide - OpenWeatherMap";
        String expectedResultUrl = "https://openweathermap.org/guide";
        WebDriver driver = new ChromeDriver();
        driver.get(URL);
        Thread.sleep(5000);
        driver.manage().window().maximize();
        driver.findElement(By.xpath(GUIDE)).click();
        String actualResultTitle = driver.getTitle();
        String actualResultUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualResultTitle, expectedResultTiltle);
        Assert.assertEquals(actualResultUrl, expectedResultUrl);
        driver.quit();

    }

    @Test
    public void TC_11_01_TestNameUrlPageGuide() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\JavaProject\\webdriwer\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String expectedResul = "https://openweathermap.org/guide";
        driver.get(URL);
        Thread.sleep(5000);
        driver.manage().window().maximize();
        driver.findElement(By.xpath(GUIDE)).click();
        String actualResult = driver.getCurrentUrl();
        Assert.assertEquals(actualResult, expectedResul);
        driver.quit();
    }

    @Test
    public void TC_11_02_TestSwitchToFahrenheit() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\JavaProject\\webdriwer\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        char expectedResul = 'F';
        driver.get(URL);
        Thread.sleep(5000);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[(text()='Imperial: °F, mph')]")).click();
        String f = driver.findElement(By.xpath("//span[@class='heading']")).getText();
        char actualResult = f.charAt(f.length() - 1);
        Assert.assertEquals(actualResult, expectedResul);
        driver.quit();
    }

    @Test
    public void TC_11_03_TestConfirmationCookiesMenuText() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\JavaProject\\webdriwer\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String expectedResul = "We use cookies which are essential for the site to work. We also use non-essential cookies"
                + " to help us improve our services. Any data collected is anonymised. You can allow all cookies or"
                + " manage them individually.";
        driver.get(URL);
        Thread.sleep(5000);
        driver.manage().window().maximize();
        String actualResult = driver.findElement(By.xpath("//p[@class='stick-footer-panel__description']")).getText();
        Assert.assertEquals(actualResult, expectedResul);
        driver.quit();
    }

    @Test
    public void TC_11_03_TestConfirmationCookiesMenuButtonAllowAll() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\JavaProject\\webdriwer\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String expectedResul = "";
        driver.get(URL);
        Thread.sleep(5000);
        driver.manage().window().maximize();
        boolean actualResult = driver.findElement(By.xpath("//button[text()='Allow all']")).isDisplayed();
        Assert.assertTrue(actualResult);
        driver.quit();
    }

    @Test
    public void TV_11_03_TestConfirmationCookiesMenuButtonAManageCookies() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\JavaProject\\webdriwer\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String expectedResul = "";
        driver.get(URL);
        Thread.sleep(5000);
        driver.manage().window().maximize();
        boolean actualResult = driver.findElement(By.xpath("//a[@href='/cookies-settings']")).isDisplayed();
        Assert.assertTrue(actualResult);
        driver.quit();
    }

    @Test
    public void TV_11_04_TestConfirmationInSupportLinkFAQ_HowToStart_AskAQuestion() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\JavaProject\\webdriwer\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String expectedResul = "FAQ";
        driver.get(URL);
        Thread.sleep(5000);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[@id='support-dropdown']")).click();
        String actualResult = driver.findElement(By.xpath("//ul[@id='support-dropdown-menu']//a[@href='/faq']")).getText();
        Assert.assertEquals(actualResult, expectedResul);
        driver.quit();
    }

    @Test
    public void TV_11_04_TestConfirmationInSupportLink_HowToStart_AskAQuestion() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\JavaProject\\webdriwer\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String expectedResul = "How to start";
        driver.get(URL);
        Thread.sleep(5000);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[@id='support-dropdown']")).click();
        String actualResult = driver.findElement(By.xpath("//ul[@id='support-dropdown-menu']"
                + "//a[@href='/appid']")).getText();
        Assert.assertEquals(actualResult, expectedResul);
        driver.quit();
    }

    @Test
    public void TV_11_04_TestConfirmationInSupportLink_AskAQuestion() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\JavaProject\\webdriwer\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String expectedResul = "Ask a question";
        driver.get(URL);
        Thread.sleep(5000);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[@id='support-dropdown']")).click();
        String actualResult = driver.findElement(By.xpath("//ul[@id='support-dropdown-menu']"
                + "//a[@href='https://home.openweathermap.org/questions']")).getText();
        Assert.assertEquals(actualResult, expectedResul);
        driver.quit();
    }

    @Test
    public void TV_11_05_TestConfirmError_reCAPTCHA_verification_failed_please_try_again() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\JavaProject\\webdriwer\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String expectedResul = "reCAPTCHA verification failed, please try again.";
        driver.get(URL);
        Thread.sleep(5000);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[@id='support-dropdown']")).click();
        driver.findElement(By.xpath("//ul[@id='support-dropdown-menu']"
                + "//a[@href='https://home.openweathermap.org/questions']")).click();
        ArrayList<String> windows = new ArrayList(driver.getWindowHandles());
        driver.close();
        driver.switchTo().window(windows.get(1));
        driver.findElement(By.xpath("//input[@id='question_form_email']")).sendKeys("horoshko");
        Select select = new Select(driver.findElement(By.xpath("//select[@id='question_form_subject']")));
        select.selectByIndex(1);
        driver.findElement(By.xpath("//textarea[@id='question_form_message']")).sendKeys("Message");
        driver.findElement(By.xpath("//input[@name='commit']")).submit();
        String actualResult = driver.findElement(By.xpath("//div[@class='has-error']//div[@class='help-block']")).getText();
        Assert.assertEquals(actualResult, expectedResul);
        driver.quit();
    }

    @Ignore
    @Test
    public void TV_11_06_TestClearEmail() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\JavaProject\\webdriwer\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String expectedResul = "can't be blank";
        driver.get(URL);
        Thread.sleep(5000);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[@id='support-dropdown']")).click();
        driver.findElement(By.xpath("//ul[@id='support-dropdown-menu']"
                + "//a[@href='https://home.openweathermap.org/questions']")).click();
        ArrayList<String> windows = new ArrayList(driver.getWindowHandles());
        driver.close();
        driver.switchTo().window(windows.get(1));
        Select select = new Select(driver.findElement(By.xpath("//select[@id='question_form_subject']")));
        select.selectByIndex(1);
        driver.findElement(By.xpath("//textarea[@id='question_form_message']")).sendKeys("Message");
        driver.switchTo().frame((0));
        driver.findElement(By.xpath("//span[@id='recaptcha-anchor']")).click();
        Thread.sleep(8000);
        driver.switchTo().window(windows.get(1));
        driver.findElement(By.xpath("//input[@name='commit']")).submit();
        String actualResult = driver.findElement(By.xpath("//div[@class='form-group email required question_form_email has-error']//span[@class='help-block']")).getText();
        Assert.assertEquals(actualResult, expectedResul);
        driver.quit();
    }

    @Ignore
    @Test
    public void TC_11_07_Test_Switching_With_F_In_C() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\JavaProject\\webdriwer\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(URL);
        Thread.sleep(5000);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[(text()='Imperial: °F, mph')]")).click();
        String f = driver.findElement(By.xpath("//span[@class='heading']")).getText();
        driver.findElement(By.xpath("//div[(text()='Metric: °C, m/s')]")).click();
        String c = driver.findElement(By.xpath("//span[@class='heading']")).getText();
        Assert.assertNotEquals(c, f);
        driver.quit();
    }

    @Test
    public void TC_11_08_Test_Start_page() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\JavaProject\\webdriwer\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(URL);
        Thread.sleep(5000);
        driver.manage().window().maximize();
        String expectedResul = driver.getCurrentUrl();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//nav[@id='nav-website']//ul[@id='first-level-nav']//li[@class='logo']")).click();
        String actualResult = driver.getCurrentUrl();
        Assert.assertEquals(actualResult, expectedResul);
        driver.quit();
    }

    @Test
    public void TC_11_09_Test_Search_check() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\JavaProject\\webdriwer\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(URL);
        Thread.sleep(5000);
        driver.manage().window().maximize();
        String city = "Rome";
        driver.findElement(By.xpath("//div[@id='desktop-menu']//form[@role='search']//input[@name='q']")).sendKeys(city);
        driver.findElement(By.xpath("//div[@id='desktop-menu']//form[@role='search']//input[@name='q']")).sendKeys(Keys.ENTER);
        String find = driver.findElement(By.xpath("//input[@id='search_str']")).getAttribute("value");
        String url = driver.getCurrentUrl();
        Assert.assertEquals(find.equalsIgnoreCase(city), url.contains("find?q=".concat(find)));
        driver.quit();
    }

    @Test
    public void TC_11_10_Find_Orange_Button() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\JavaProject\\webdriwer\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(URL);
        Thread.sleep(5000);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[@id='desktop-menu']//a[@href='/api']")).click();
        ArrayList<String> button = new ArrayList(driver.findElements(By.xpath("//a[(@class='btn_block orange round') or contains(@class, 'ow-btn round btn-orange') ]")));

    }

    @Test
    public void testUrlSupportHowToStart() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\JavaProject\\webdriwer\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String expectedResul = "https://openweathermap.org/appid";
        driver.get(URL);
        Thread.sleep(5000);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[@id='support-dropdown']")).click();
        driver.findElement(By.xpath("//ul[@id='support-dropdown-menu']//a[text()='How to start']")).click();
        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals(driver.getCurrentUrl(), expectedResul);
        driver.quit();
    }@Test
    public void testUrlSupportAskAQuestion() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\JavaProject\\webdriwer\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String expectedResul = "https://home.openweathermap.org/questions";
        driver.get(URL);
        Thread.sleep(5000);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[@id='support-dropdown']")).click();
        driver.findElement(By.xpath("//ul[@id='support-dropdown-menu']//a[text()='Ask a question']")).click();
        ArrayList<String> windows = new ArrayList(driver.getWindowHandles());
        driver.close();
        Assert.assertEquals(driver.switchTo().window(windows.get(1)).getCurrentUrl(), expectedResul);
        Assert.assertEquals(driver.getCurrentUrl(), expectedResul);
        driver.quit();
    }
    @Test
    public void testH1ValidName() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\JavaProject\\webdriwer\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String expectedResul = "OpenWeather";
        driver.get(URL);
        driver.manage().window().maximize();
        Thread.sleep(5000);
        Assert.assertEquals(driver.findElement(H_1).getText(), expectedResul);
        driver.quit();
    }@Test
    public void testH2ValidName() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\JavaProject\\webdriwer\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String expectedResul = "Weather forecasts, nowcasts and history in a fast and elegant way";
        driver.get(URL);
        driver.manage().window().maximize();
        Thread.sleep(5000);
        Assert.assertEquals(driver.findElement(H_2).getText(), expectedResul);
        driver.quit();
    }
}

/*
<a href="/appid">How to start</a>
//*[@id="support-dropdown-menu"]/li[2]/a
        https://openweathermap.org/appid*/
